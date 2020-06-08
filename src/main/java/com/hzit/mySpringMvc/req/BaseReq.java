package com.hzit.mySpringMvc.req;

/**
 * 系统参数
 */
public  abstract class BaseReq {

    private String time_stamp;

    private String client_id;

    private String signature;

    private String signature_method;


    private String version;

    private String access_token;


    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getSignature_method() {
        return signature_method;
    }

    public void setSignature_method(String signature_method) {
        this.signature_method = signature_method;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
