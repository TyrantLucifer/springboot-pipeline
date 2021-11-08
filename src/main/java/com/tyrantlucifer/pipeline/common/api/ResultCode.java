package com.tyrantlucifer.pipeline.common.api;

/**
 * 常用API返回对象
 * @author tyrantlucifer
 */
public enum ResultCode implements StatusCode {

    SUCCESS(0, "操作成功"),
    FAILED(-1, "操作失败"),
    VALIDATE_FAILED(-2, "参数检验失败"),
    UNAUTHORIZED(-3, "暂未登录或token已经过期"),
    FORBIDDEN(-4, "没有相关权限");

    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
