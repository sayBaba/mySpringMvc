package com.hzit.mySpringMvc.controller;

import com.hzit.mySpringMvc.req.QueryReq;
import com.hzit.mySpringMvc.req.User;
import com.hzit.mySpringMvc.resp.Resp;
import com.hzit.mySpringMvc.resp.UserInfoData;
import com.hzit.mySpringMvc.resp.UserResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 注册控制器
 */
@Controller
public class RegisterController {

    /**
     * 使用RequestParam 传参
     * @param userName
     * @param password
     */
    @RequestMapping("/req.do")
    public void userRegister(@RequestParam(value = "userName") String userName,
                             @RequestParam(value = "password") String password  ){

        System.out.println("userName = " + userName);

        System.out.println("password = " + password);

    }

    /**
     * 使用 pathVariable 传参, 占位符
     */
    @RequestMapping("/reg.do/{userName}/{password}")
    public void userRegister2(@PathVariable("userName") String userName1, @PathVariable("password") String password1){

        System.out.println("userName = " + userName1);

        System.out.println("password = " + password1);

    }

    /**
     * RequestBody的用法
     * @param queryReq
     */
    @ResponseBody //返回一个json格式
    @RequestMapping(value = "/query.do")
    public Resp  queryUserInfo(@RequestBody QueryReq queryReq){

        System.out.println("---------"+ queryReq.getAge());
        System.out.println("---------"+ queryReq.getPassword());
        System.out.println("---------"+ queryReq.getUserName());
        System.out.println("---------"+ queryReq.getSex());

        //返回一个json格式
        //JsonObject 封装
        Resp resp = new Resp();
        resp.setCode(0);
        resp.setMsg("查询成功");

        UserInfoData data = new UserInfoData();
        data.setAge("18");

        data.setName("张天阳");

        resp.setData(data);

        return resp;
    }

    @ResponseBody //返回一个json格式
    @RequestMapping("/queryList")
    public UserResp queryList(@RequestBody List<User> userList){

        System.out.println("------------" + userList.size());

        System.out.println("========userId： " + userList.get(0).getUserId());


        //返回一个json

        UserResp resp = new UserResp();

        resp.setCode(0);
        resp.setMsg("查询成功");

        List<UserInfoData> list = new ArrayList<UserInfoData>();

        UserInfoData data = new UserInfoData();

        data.setName("张天阳");
        data.setAge("18");

        list.add(data);

        data = new UserInfoData();

        data.setName("张天阳222");
        data.setAge("38");

        list.add(data);

        resp.setData(list);

        return resp;

    }




}
