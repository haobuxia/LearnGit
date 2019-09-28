package edu.thss.platform.controller.exception;

import edu.thss.platform.controller.ResponseMsg;
import edu.thss.platform.exception.PlatformException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.bind.BindException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.RestClientException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import javax.xml.bind.ValidationException;
import java.util.Map;

@ControllerAdvice        //所有requestmapping前都会配置这样一个异常信息,这也是前期框架搭建时要考虑的
public class RestExceptionAdvice {

    protected static Logger logger = LoggerFactory.getLogger(RestExceptionAdvice.class);

    /**
     * 400 - Bad Request
     * @param ex
     * @return
     */
    @ExceptionHandler(value = {PlatformException.class, RestClientException.class, MissingServletRequestParameterException.class,
            HttpMessageNotReadableException.class, MethodArgumentNotValidException.class,
            BindException.class, ConstraintViolationException.class, ValidationException.class})
    public ResponseEntity<?> handleBadRequest(Exception ex) {
        ResponseMsg rsp = new ResponseMsg(400, ex.getMessage());
        return new ResponseEntity<ResponseMsg<?>>(rsp, HttpStatus.valueOf(200));
    }

    /**
     * 405 - Not Found
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<?> noHandlerFoundException(NoHandlerFoundException e) {
        ResponseMsg<?> rsp = new ResponseMsg<>(404, e.getMessage());
        return buildResponseEntity(rsp);
    }


    /**
     * 415 - Unsupported Media Type
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<?> handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        ResponseMsg<?> rsp = new ResponseMsg<>(415, e.getMessage());
        return buildResponseEntity(rsp);
    }


    /**
     * 500 - Internal Server Error
     */
    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<?> handleInternalServerError(Exception ex, HttpServletRequest webRequest) {
        logger.error("Error Request URL: " + webRequest.getRequestURL());
        logger.error("Stack Trace: ", ex);
        ResponseMsg<?> rsp = new ResponseMsg<>(500, ex.getMessage(), ex.getStackTrace());
        return buildResponseEntity(rsp);
    }


    private ResponseEntity<?> buildResponseEntity(ResponseMsg<?> responseMsg) {
        return new ResponseEntity<ResponseMsg<?>>(responseMsg, HttpStatus.valueOf(responseMsg.getCode()));
    }


}
