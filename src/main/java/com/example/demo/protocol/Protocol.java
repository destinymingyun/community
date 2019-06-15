package com.example.demo.protocol;

/**
 * 账号返回值整型释义
 */
public class Protocol {
    //  基本状态码
    public static final int ERROR =   0b0000_0000_0000_0000; //  失败
    public static final int SUCCESS = 0b0000_0000_0000_0001; // 成功

    //  个人信息状态码
    public static final int MAN = 0b0000_0000_0000_0000;   // 男性
    public static final int WOMAN = 0b0000_0000_0000_0001; // 女性

    //  账号状态码
    public static final int ADMIN =   0b0000_0000_0000_0001; // 响应为管理员
    public static final int USER =    0b0000_0000_0000_0011; // 响应为用户

    //  身份状态码
    public static final int VOLUNTEER = 0b0000_0000_0000_0001; // 志愿者
    public static final int UNEMPLOYED = 0b0000_0000_0000_0010; // 失业的
    public static final int THE_TRAINED = 0b0000_0000_0000_1000; // 受培训的
    public static final int DISABLED = 0b0000_0000_0001_0000; // 残疾的
    public static final int POOLED = 0b0000_0000_0010_0000; //  领低保的
}
