package com.wxy.vo;

import lombok.Getter;

@Getter
public enum CodeMsg {
//使用枚举信息进行赋值
    SUCCESS(0,"成功"),

    INTERNAL_ERROR(500,"服务器内部错误"),


    //商品模块  100xxx
    PRODUCT_NOT_EXIST(100001,"商品不存在"),

    //订单模块   200xxx
    ORDER_CLOSED(200001,"交易已关闭"),

    //用户模块   300xx
    LOGIN_FAIL(300001,"用户名或密码输入错误");

    private int cord;
    private String msg;

    private CodeMsg(int cord , String msg){
        this.cord = cord;
        this.msg = msg;
    }

}
