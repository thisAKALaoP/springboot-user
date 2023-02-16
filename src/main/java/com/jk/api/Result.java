package com.jk.api;

public class Result<T>{
    private Boolean success;
    private int code;
    private String message;
    private T data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    public Result(){

    }

    //定义统一类型返回
    public Result (ReturnCode resultCode, Boolean success , T data){
        this.success = success;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }

    //因为重复使用成功与错误，所以建立了这两个，方便使用
    public static<T> Result<T> ok(T data){
        return new Result<>(ReturnCode.HTTP_SUCCESS, true , data);
    }

    public static Result fail(){
        return new Result<>(ReturnCode.HTTP_FAIL, false, null);
    }



}
