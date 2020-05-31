package com.jth.spring.sequence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DatePrefixGenerator implements PrefixGenerator {

	@Override
	public String getPrefix() {
		DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String result = formatter.format(new Date());
		return result;
	}
	
}
