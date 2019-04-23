package com.github.ionething.sparrow.common.constant;

import org.springframework.http.HttpStatus;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ResultConstants {

    public static final int CODE_SUCCESS = HttpStatus.OK.value();
    public static final String MESSAGE_SUCCESS = "处理成功";

    public static final int CODE_FAIL = HttpStatus.BAD_REQUEST.value();
    public static final String MESSAGE_FAIL = "处理失败";

    public static final Integer CODE_ERROR = HttpStatus.INTERNAL_SERVER_ERROR.value();
    public static final String MESSAGE_ERROR = "抱歉，系统暂时无法处理你的请求";

    public static final String MESSAGE_UNKNOWN = "未知错误";

    public static final Map<Integer, String> CODE_MESSAGE_MAP;

    static  {
        Map<Integer, String> codeMessageMap = new HashMap<>(16);
        codeMessageMap.put(CODE_SUCCESS, MESSAGE_SUCCESS);
        codeMessageMap.put(CODE_ERROR, MESSAGE_ERROR);
        // 这里定义
        CODE_MESSAGE_MAP = Collections.unmodifiableMap(codeMessageMap);
    }

    public static String getMessage(@NotNull Integer code) {
        return CODE_MESSAGE_MAP.getOrDefault(code, MESSAGE_UNKNOWN);
    }

}
