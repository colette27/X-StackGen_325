package io.starter.happypath.api;

@javax.annotation.Generated(value = "io.starter.ignite.generator.swagger.languages.StackGenSpringCodegen", date = "2020-04-14T12:17:28.197-07:00")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
