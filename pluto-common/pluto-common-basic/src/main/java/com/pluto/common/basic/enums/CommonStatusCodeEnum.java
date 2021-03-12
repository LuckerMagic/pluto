package com.pluto.common.basic.enums;

/**
 * @author ceshi
 * @date 2021/3/815:04
 * @description: 通用状态码定义
 * @version: 1.0.0
 */
public enum CommonStatusCodeEnum implements ResultStatusCode{
    /**
     * 通用状态码定义
     */
    SERVER_ERROR(500,"服务异常"),

    SUCCESS(200,"成功"),

    PARAMETER_ERROR(500,"非法参数异常"),

    ;

    private final int code;

    private final String msg;

    CommonStatusCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }
}
