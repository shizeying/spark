package com.spark.scala.utils;

/**
 * @Author：史泽颖
 * @Date： Create in  2019-05-02  23:08
 * @Description：boot返回值工具类
 */
public class ResultVoUtil {

    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(object);
        resultVo.setCode(0);
        resultVo.setMsg("成功");
        return resultVo;
    }
    public static ResultVo success( ){
        return success(null);
    }
    public static ResultVo error(Integer code,String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
