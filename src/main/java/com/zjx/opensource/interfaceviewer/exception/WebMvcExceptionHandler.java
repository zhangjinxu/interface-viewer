package com.zjx.opensource.interfaceviewer.exception;

import com.zjx.opensource.interfaceviewer.model.ResponseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.WebExceptionHandler;

@ControllerAdvice
public class WebMvcExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);

    @ExceptionHandler(BussinessException.class)
    @ResponseBody
    public ResponseResult handleServiceException(BussinessException e) {
        return ResponseResult.getFailResult(e.getMessage());
    }

    /*@ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseResult handleServiceException(Exception e) {
        return ResponseResult.getFailResult(e.getMessage());
    }*/
}
