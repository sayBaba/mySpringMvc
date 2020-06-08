package com.hzit.mySpringMvc.resp;

public class Resp {

    private int code;

    private String msg;

    private UserInfoData data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserInfoData getData() {
        return data;
    }

    public void setData(UserInfoData data) {
        this.data = data;
    }

    /**
     *
     *  code : 1
     *  msg :"查询成功",
       data:{
            userName: 111,
            password: 222,
            sex:       女
     }
     *
     *
     *
     */


}
