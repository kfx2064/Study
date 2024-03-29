package com.jth.spring.mobile.web;

import com.jth.spring.mobile.web.config.MobileConfiguration;
import com.jth.spring.mobile.web.filter.DeviceResolverRequestFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class MobileApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { MobileConfiguration.class };
    }

    @Override
    protected Filter[] getServletFilters() {
        return new Filter[] {new DeviceResolverRequestFilter()};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

}
