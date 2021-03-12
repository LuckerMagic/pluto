package com.pluto.common.basic.utils;

import com.pluto.common.basic.enums.CommonStatusCodeEnum;
import com.pluto.common.basic.enums.ResultStatusCode;
import com.pluto.common.basic.vo.ResultVO;

/**
 * @author ceshi
 * @date 2021/3/815:10
 * @description: 统一封装返回工具类
 * @version: 1.0.0
 */
public class ResultVoUtil<T> {

    /**
        @author Administrator
        @date 2021/3/8 15:32
        @description 操作成功时无数据返回
    */
    public static <T> ResultVO<T> success(){
        return new ResultVO<>(CommonStatusCodeEnum.SUCCESS.getCode(),
                CommonStatusCodeEnum.SUCCESS.getMsg());

    }

    /**
        @author Administrator
        @date 2021/3/8 15:34
        @description 操作成功并返回数据
    */
    public static <T> ResultVO<T> success(T data){
        return new ResultVO<>(
                CommonStatusCodeEnum.SUCCESS.getCode(),
                CommonStatusCodeEnum.SUCCESS.getMsg(),
                data
        );
    }

    /**
        @author Administrator
        @date 2021/3/8 15:36
        @description 操作错误返回
    */
    public static <T> ResultVO<T> error(){
        return new ResultVO<>(
                CommonStatusCodeEnum.SERVER_ERROR.getCode(),
                CommonStatusCodeEnum.SERVER_ERROR.getMsg()
        );
    }

    /**
        @author Administrator
        @date 2021/3/8 15:38
        @description 操作失败时返回提示信息
    */
    public static <T> ResultVO<T> failed(ResultStatusCode resultStatusCode){
        return new ResultVO<>(resultStatusCode.getCode(),resultStatusCode.getMsg());
    }
}
