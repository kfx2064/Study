package com.jth.spring.court;

import java.io.IOException;

import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

public class OtherMain {
	
	public static void main(String[] args) throws IOException {
		
		final String json = "{\\\"courtName\\\":\\\"Tennis #2\\\",\\\"date\\\":[2008,1,14],\\\"hour\\\":20,\\\"player\\\":{\\\"name\\\":\\\"James\\\",\\\"phone\\\":\\\"N/A\\\"},\\\"sportType\\\":{\\\"id\\\":1,\\\"name\\\":\\\"Tennis\\\"},\\\"dateAsUtilDate\\\":1200265200000}\\n"; 
		
		ObjectMapper mapper = Jackson2ObjectMapperBuilder.json().build();
		System.out.println(mapper.readValue(json, Reservation.class));
	}

}
