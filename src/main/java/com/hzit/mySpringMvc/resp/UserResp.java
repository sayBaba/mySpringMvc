package com.hzit.mySpringMvc.resp;

import java.util.List;

public class UserResp {

    private int code;

    private String msg;

    private List<UserInfoData> data;

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

    public List<UserInfoData> getData() {
        return data;
    }

    public void setData(List<UserInfoData> data) {
        this.data = data;
    }
}
