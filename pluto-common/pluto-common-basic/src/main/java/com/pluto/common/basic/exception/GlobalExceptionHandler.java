package com.pluto.common.basic.exception;

import com.pluto.common.basic.enums.UserStatusCodeEnum;
import com.pluto.common.basic.utils.ResultVoUtil;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.reactive.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author ShiLei
 * @version 1.0.0
 * @date 2021/3/9 17:51
 * @description 全局异常捕获处理
 */
@Component
public class GlobalExceptionHandler extends DefaultErrorAttributes {

    public GlobalExceptionHandler() {
        super();
    }

    @Override
    public Map<String, Object> getErrorAttributes(ServerRequest request, ErrorAttributeOptions options) {
        Map<String, Object> errorAttributes = new LinkedHashMap<>();
        Throwable error = getError(request);
        if (error instanceof ExpiredJwtException) {
            errorAttributes.put("result", ResultVoUtil.failed(UserStatusCodeEnum.TOKEN_EXPIRED));
        } else {
            errorAttributes.put("result", ResultVoUtil.error());
        }
        return errorAttributes;
    }
}
