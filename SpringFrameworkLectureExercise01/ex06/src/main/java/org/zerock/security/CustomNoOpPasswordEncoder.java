package org.zerock.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomNoOpPasswordEncoder implements PasswordEncoder {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomNoOpPasswordEncoder.class);

	@Override
	public String encode(CharSequence rawPassword) {
		
		logger.warn("before encode : " + rawPassword);
		
		String result = rawPassword.toString();
		
		return result;
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		
		logger.warn("matches : " + rawPassword + " : " + encodedPassword);
		
		boolean result = rawPassword.toString().equals(encodedPassword);
		
		return result;
	}
	
	

}
