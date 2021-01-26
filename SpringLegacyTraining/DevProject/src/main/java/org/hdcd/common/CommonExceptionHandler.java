package org.hdcd.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CommonExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(CommonExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public String exceptionHandle(Exception e) {
        logger.info(e.getMessage());

        return "error/errorCommon";
    }

}
