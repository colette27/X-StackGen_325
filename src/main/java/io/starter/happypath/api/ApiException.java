package io.starter.happypath.api;

@javax.annotation.Generated(value = "io.starter.ignite.generator.swagger.languages.StackGenSpringCodegen", date = "2020-04-14T12:17:28.197-07:00")

public class ApiException extends Exception{
    private int code;
    public ApiException (int code, String msg) {
        super(msg);
        this.code = code;
    }
}
