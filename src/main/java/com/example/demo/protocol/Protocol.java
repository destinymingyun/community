package com.example.demo.protocol;

/**
 * 账号返回值整型释义
 */
public class Protocol {
    //  基本状态码
    public static final int ERROR =   0b0000_0000_0000_0000; //  失败
    public static final int SUCCESS = 0b0000_0000_0000_0001; // 成功

    //  账号状态码
    public static final int ADMIN =   0b0000_0000_0000_0001; // 响应为管理员
    public static final int USER =    0b0000_0000_0000_0011; // 响应为用户

    //  个人信息状态码
    public static final int MAN = 0b0000_0000_0000_0000;   // 男性
    public static final int WOMAN = 0b0000_0000_0000_0001; // 女性
}
