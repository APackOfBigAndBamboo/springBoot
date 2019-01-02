package com.david.enums;

/**
 * @author  David
 */
public enum ResultEnum {
    /**
     * 枚举字段释义
     */
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"你可能正在上小学"),
    MIDDLE_SCHOOL(101,"你可能正在上初中");
    private Integer code;
    private String mg;

    ResultEnum(Integer code, String mg) {
        code = code;
        this.mg = mg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        code = code;
    }

    public String getMg() {
        return mg;
    }

    public void setMg(String mg) {
        this.mg = mg;
    }
}
