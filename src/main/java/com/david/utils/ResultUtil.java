package com.david.utils;

import com.david.domain.Result;

/**
 * @author David
 *
 */
public class ResultUtil {
    public static Result success(Object o){
        Result result=new Result();
        result.setMsg("成功");
        result.setCode(0);
        result.setData(o);
        return result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setMsg(msg);
        result.setCode(code);
        return result;
    }
}
