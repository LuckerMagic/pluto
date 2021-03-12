package com.pluto.common.basic.enums;

/**
 * @author ShiLei
 * @version 1.0.0
 * @date 2021/3/11 11:45
 * @description 用户操作状态码
 */
public enum UserStatusCodeEnum implements ResultStatusCode{

    /**
     * 用户账号操作异常
     */
    LOGIN_PASSWORD_ERROR(5000,"账号或密码错误"),

    ACCOUNT_EXPIRED(5001,"账号已过期"),

    ACCOUNT_LOCKED(5002,"账号已被锁定"),

    ACCOUNT_CREDENTIAL_EXPIRED(5003,"账号凭证已过期"),

    ACCOUNT_DISABLE(5004,"账号已被禁用"),

    PERMISSION_DENIED(5005,"账号没有权限"),

    USER_UNAUTHORIZED(5006,"账号未认证"),

    ACCOUNT_NOT_EXIST(5007,"账号不存在"),

    // token 异常
    TOKEN_ERROR(5008,"非法token异常"),

    TOKEN_EXPIRED(5009,"token 过期"),


    ;

    private final int code;

    private final String msg;

    UserStatusCodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
