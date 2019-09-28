package edu.thss.platform.controller;

import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

public class ResponseMsg<T> {

    private static final Map<Integer, String> codeTable = new HashMap<>();

    static{
        codeTable.put(200, "OK");
        codeTable.put(201, "Created");
        codeTable.put(202, "Accepted");
        codeTable.put(204, "Deleted");
        codeTable.put(400, "Invalid Request");
        codeTable.put(401, "Unauthorized");
        codeTable.put(403, "Forbidden");
        codeTable.put(404, "Not Found");
        codeTable.put(406, "Not Acceptable");
        codeTable.put(500, "Internal Server Error");
    }

    private Boolean success;
    @ApiModelProperty(example = "200")
    private Integer code;
    private String message;
    private T data;

    public ResponseMsg(){
        this.success = true;
        this.code = 200;
        this.message = codeTable.get(200);
        this.data = null;
    }

    public ResponseMsg(int code){
        this.code = code;
        this.success =  (code >= 200 && code < 300);
        this.message = codeTable.get(code);
    }

    public ResponseMsg(T data){
        this.code = 200;
        this.success = true;
        this.message = codeTable.get(200);
        this.data = data;
    }

    public ResponseMsg(Integer code, T data){
        this.code = code;
        this.success =  (code >= 200 && code < 300);
        this.message = codeTable.get(code);
        this.data = data;
    }

    public ResponseMsg(Integer code, String message){
        this.success =  (code >= 200 && code < 300);
        this.code = code;
        this.message = message;
    }


    public ResponseMsg(Integer code, String message, T data){
        this.success =  (code >= 200 && code < 300);
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseMsg(Boolean success, Integer code, String message, T data){
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
