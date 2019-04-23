package com.github.ionething.sparrow.common.bean;

import com.github.ionething.sparrow.common.constant.ResultConstants;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestResult<T> {

    private Integer code;

    private String message;

    private T data;

    public RestResult(T data) {
        this.code = ResultConstants.CODE_SUCCESS;
        this.message = ResultConstants.MESSAGE_SUCCESS;
        this.data = data;
    }

    public RestResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static RestResult ok() {
        return new RestResult(null);
    }

    public static RestResult fail() {
        return new RestResult(ResultConstants.CODE_FAIL, ResultConstants.MESSAGE_FAIL);
    }
}
