package com.spark.scala.utils;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author：史泽颖
 * @Date： Create in  2019-05-02  23:05
 * @Description：http请求返回的对象
 */

public class ResultVo<T> implements Serializable {
    /**
     * 错误码
     */
    @Getter
    @Setter
    private Integer code;
    /**
     * 提示信息
     */
    @Getter
    @Setter
    private String msg;
    /**
     * 具体内容
     */
    @Getter
    @Setter
    private T data;
}
