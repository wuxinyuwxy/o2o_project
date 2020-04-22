package com.wxy.vo;

import lombok.Data;

@Data
public class ResponseVO<T> { //泛型的使用
    private int code;
    private String msg;
    private T data; //数据

    //成功
    public static <T> ResponseVO success(T data){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setData(data);
        responseVO.setCode(CodeMsg.SUCCESS.getCord());
        responseVO.setMsg(CodeMsg.SUCCESS.getMsg());
        //泛型
        return responseVO;
    }


    //失败
    public static <T> ResponseVO erro(CodeMsg codeMsg){
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(codeMsg.getCord());
        responseVO.setMsg(codeMsg.getMsg());
        //泛型
        return responseVO;
    }
}
