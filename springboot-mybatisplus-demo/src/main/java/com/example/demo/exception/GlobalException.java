package com.example.demo.exception;

import com.example.demo.common.Result;
import com.example.demo.common.ResultCode;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    private static final Logger log = LoggerFactory.getLogger(GlobalException.class);

    @ExceptionHandler({MethodArgumentNotValidException.class, BindException.class, ConstraintViolationException.class, IllegalArgumentException.class})
    public Result<Void> handleBadRequest(Exception exception, HttpServletRequest request) {
        log.warn("请求异常, uri={}, message={}", request.getRequestURI(), exception.getMessage());
        return Result.fail(ResultCode.BAD_REQUEST, exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result<Void> handleException(Exception exception, HttpServletRequest request) {
        log.error("系统异常, uri={}", request.getRequestURI(), exception);
        return Result.fail(ResultCode.INTERNAL_ERROR);
    }
}
