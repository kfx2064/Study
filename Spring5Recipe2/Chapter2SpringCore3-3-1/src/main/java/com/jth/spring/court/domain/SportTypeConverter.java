package com.jth.spring.court.domain;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SportTypeConverter implements Converter<String, SportType> {



    @Override
    public SportType convert(String source) {
        return null;
    }

}
