package com.jth.spring.sequence;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrefixGenerator implements PrefixGenerator {

	private DateFormat formatter;
	
	public void setPattern(String pattern) {
		this.formatter = new SimpleDateFormat(pattern);
	}
	
	@Override
	public String getPrefix() {
		String result = formatter.format(new Date()); 
		return result;
	}

}
