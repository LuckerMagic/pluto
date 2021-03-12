package com.pluto.common.basic.enums;

/**
 * @author ShiLei
 * @date 2021/3/11 11:48
 * @description
 */
public interface ResultStatusCode{

    /**
     * 获取返回状态码
     * @return code
     */
    int getCode();

    /**
     * 获取返回消息
     * @return msg
     */
    String getMsg();
}
