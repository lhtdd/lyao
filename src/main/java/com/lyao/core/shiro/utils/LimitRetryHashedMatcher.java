package com.lyao.core.shiro.utils;

import java.util.concurrent.atomic.AtomicInteger;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;

public class LimitRetryHashedMatcher extends HashedCredentialsMatcher {

	@Override
	public boolean doCredentialsMatch(AuthenticationToken token,
			AuthenticationInfo info) {
		String userNO = (String) token.getPrincipal();
		// retrycount + 1
		Object element = EhcacheUtil.getItem(userNO);
		if (element == null) {
			EhcacheUtil.putItem(userNO, 1);
			element = 0;
		} else {
			int count = Integer.parseInt(element.toString()) + 1;
			element = count;
			EhcacheUtil.putItem(userNO, element);
		}
		AtomicInteger retryCount = new AtomicInteger(Integer.parseInt(element
				.toString()));
		if (retryCount.incrementAndGet() > 3) {
			// if retrycount >5 throw
			throw new ExcessiveAttemptsException("登录3次被锁");
		}
		boolean matches = super.doCredentialsMatch(token, info);
		if (matches) {
			// clear retrycount
			EhcacheUtil.removeItem(userNO);
		}
		return matches;
	}
}
