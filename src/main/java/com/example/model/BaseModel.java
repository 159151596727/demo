package com.example.model;

/**
 * Create by 李印锋 on 2019/2/24 0:45
 * 返回json类型的模板
 */
public class BaseModel {
    /**
     * 操作是否成功 SUCCESS_CODE为成功 ERROR_CODE反之
     */
    public int code;
    /**
     * 操作返回的信息
     */
    public String msg;
    /**
     * 返回的个数
     */
    public int count;

    public BaseModel(int code, String msg, int count) {
        this.code = code;
        this.msg = msg;
        this.count = count;
    }
}
