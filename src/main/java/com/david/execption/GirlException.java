package com.david.execption;

import com.david.enums.ResultEnum;

/**
 * @author David
 */
public class GirlException extends RuntimeException {

    private Integer code ;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
