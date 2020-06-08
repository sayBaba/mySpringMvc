package com.hzit.mySpringMvc.controller;

import com.hzit.mySpringMvc.req.ItemReq;
import com.hzit.mySpringMvc.req.Items;
import com.hzit.mySpringMvc.req.QueryVo;
import com.hzit.mySpringMvc.resp.TestUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller //等于 controller + ResponseBody ,不能返回页面
public class TestController {

    ModelAndView modelAndView = null;

    /**
     * modelAndView 返回视图
     * @return
     */
    @RequestMapping("/test")
    public ModelAndView test(){
        modelAndView = new ModelAndView();


        List<TestUser> list = new ArrayList<TestUser>();

        TestUser testUser = new TestUser();
        testUser.setUserName("小翠");
        testUser.setSex("男");
        testUser.setAge("48");

        list.add(testUser);

        testUser = new TestUser();
        testUser.setUserName("小翠他哥");
        testUser.setSex("女");
        testUser.setAge("68");

        list.add(testUser);


        modelAndView.addObject("msg","好666");
        modelAndView.addObject("list",list);


        modelAndView.setViewName("index");

        return modelAndView;

    }


    /**
     * servlet支持的 springMvc 都支持, 页面不能放入到 WEB-INF 下面
     * @param request
     */
    @RequestMapping("/test01")
    public void test01(HttpServletRequest request, HttpServletResponse response){
        String userName =  request.getParameter("userName");

        request.getSession();
        try {
            request.setAttribute("msg","好666");
            request.getRequestDispatcher("test.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param model 传参数到前端页面
     * @return
     */
    @RequestMapping("/test02")
    public String test02(Model model){

        List<TestUser> list = new ArrayList<TestUser>();

        TestUser testUser = new TestUser();
        testUser.setUserName("小翠");
        testUser.setSex("男");
        testUser.setAge("48");

        list.add(testUser);

        testUser = new TestUser();
        testUser.setUserName("小翠他哥");
        testUser.setSex("女");
        testUser.setAge("68");

        list.add(testUser);

        model.addAttribute("msg","小翠真牛");
        model.addAttribute("list",list);
        return "index"; //参数带不过去
    }


    /**
     *
     * @param modelMap 传参数到前端页面
     * @return
     */
    @RequestMapping("/test03")
    public String test02(ModelMap modelMap){

        List<TestUser> list = new ArrayList<TestUser>();
        TestUser testUser = new TestUser();
        testUser.setUserName("小翠");
        testUser.setSex("男");
        testUser.setAge("48");
        list.add(testUser);

        testUser = new TestUser();
        testUser.setUserName("小翠他哥");
        testUser.setSex("女");
        testUser.setAge("68");
        list.add(testUser);

        modelMap.addAttribute("msg","小翠好牛");
        modelMap.addAttribute("list",list);
        return "index";
    }

    /**
     * http://localhost:8080/mySpringMvc_war/show?userName=111&id=1
     * @param userName
     * @param id
     * @return
     */
    @RequestMapping("/show") //映射地址
    public String show(String userName ,Integer id){
        System.out.println("userName = " + userName);
        System.out.println("id = " + id);

        return "show";

    }


    /**
     * 参数名和 javabean中名字类型 都对应上
     * http://localhost:8080/mySpringMvc_war/show1?userName=111&password=1
     * @param itemReq
     * @return
     */
    @RequestMapping("/show1") //映射地址
    public String show1(ItemReq itemReq,Model model){
        System.out.println("itemReq.userName = " + itemReq.getUserName());
        System.out.println("itemReq.password = " + itemReq.getPassword());

        model.addAttribute("item",itemReq);
        return "item";
    }

    @RequestMapping("/show2")
    public void show2(String userName,String password,String [] item_id){

        System.out.println("item_id SIZE ：" + item_id.length);
        System.out.println("item_id [0] ：" + item_id[0]);

    }


    /**
     * 加载list
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model){

        List<Items> itemsList = new ArrayList<Items>();

        Items items = new Items();

        items.setId("1");
        items.setName("电脑");
        items.setPrice("200");

        itemsList.add(items);

        items = new Items();

        items.setId("4");
        items.setName("手机");
        items.setPrice("800");

        itemsList.add(items);


        model.addAttribute("itemsList",itemsList);

        return "list";
    }

//    /**
//     * 获取页面传的list
//     * @param queryVo
//     * @return
//     */
//    @RequestMapping("/submitlist")
//    public String submitlist(QueryVo itemList,HttpServletRequest request){
//
//        System.out.println("------------------" + request.getParameter("itemsList"));
//
//        System.out.println("queryVo.size()=" + itemList.getItemList());
//
//        return "list";
//    }





    //批量修改
    @RequestMapping(value = "/updateItems")
    public String updateItems(QueryVo queryVo){
        System.out.println(queryVo.getItemList().size());

        return "success";
    }



}
