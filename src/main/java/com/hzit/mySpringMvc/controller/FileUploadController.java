package com.hzit.mySpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传控制器
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    /**
     * 加载图片上传的页面
     * @return
     */
    @RequestMapping("/imgShow")
    public String imgShow(){

        return "imgShow";
    }

    /**
     * 上传图片
     * @return
     */
    @RequestMapping(value = "/imgUpload",method = RequestMethod.POST)
    public String imgUpload(MultipartFile file){
        System.out.println("接受到上传图片的请求.... file: "+ file);

        System.out.println("文件名：" + file.getName());

        System.out.println("文件名getContentType：" + file.getContentType());
        System.out.println("文件名getOriginalFilename：" + file.getOriginalFilename());


        //获取文件的后缀
        int index  = file.getOriginalFilename().indexOf(".");
        String suffix = file.getOriginalFilename().substring(index);

        if(file!=null){

            //生成文件名
            String fileName = UUID.randomUUID().toString().replace("-","");
            String filepath = "D:\\develop\\upload\\temp\\" + fileName + suffix;


            try {
                //生成到指定的目录
                file.transferTo(new File(filepath));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }


        return "";
    }


    public static void main(String[] args) {


//        System.out.println(suffix);


    }

}
