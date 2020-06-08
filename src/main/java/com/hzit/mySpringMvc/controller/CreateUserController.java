package com.hzit.mySpringMvc.controller;

import com.hzit.mySpringMvc.req.CreateUserReq;
import com.hzit.mySpringMvc.req.QueryReq;
import com.hzit.mySpringMvc.resp.CreateUserResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 创建用户账号接口
 */
@Controller
@RequestMapping("/user")
public class CreateUserController {

    /**
     * RequestBody 解析请求的参数为xml,json 支持post
     * @param createUserReq
     */
    @ResponseBody //返回json格式
    @RequestMapping(value = "/create" ,method = RequestMethod.POST)
    public CreateUserResp createUser(@RequestBody CreateUserReq createUserReq){
        String openid = createUserReq.getOpenid();

        String email = createUserReq.getEmail();

        System.out.println("openid = " + openid);

        System.out.println("email = " + email);

        //TODO

        CreateUserResp  createUserResp = new CreateUserResp();

        //TODO
        createUserResp.setRet(0);
        createUserResp.setMsg("成功");
        createUserResp.setUid("877686876");

        createUserResp.setAccess_token("hsakjdhashdksa");

        createUserResp.setExpires_in(100098);

        return  createUserResp;


    }



}
