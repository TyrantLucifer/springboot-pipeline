package com.tyrantlucifer.pipeline.common.api;

/**
 * 接口状态码接口类
 * @author tyrantlucifer
 */
public interface StatusCode {
    /**
     * 获取状态错误码
     *
     * @return 错误码
     */
    int getCode();

    /**
     * 获取默认错误信息
     *
     * @return 默认错误信息
     */
    String getMessage();
}
