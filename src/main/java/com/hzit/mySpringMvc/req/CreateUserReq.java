package com.hzit.mySpringMvc.req;

/**
 * 创建用户账户请求参数
 */
public class CreateUserReq extends BaseReq {

    private String openid;

    private String username;

    private String email;

    private String mobile;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
