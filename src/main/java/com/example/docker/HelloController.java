package com.example.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @ClassName: com.example.docker
 * @Author: yuyong
 * @CreateDate: 2018/10/24 16:24
 * @UpdateUser:
 * @UpdateDate: 2018/10/24 16:24
 * @UpdateRemark:
 * @Version: 1.0
 * @since JDK 1.8
 */
@RestController
public class HelloController {
    /**
    * @author yuyong
    * @Description 添加注释
    * @param []
    * @return java.lang.String
    * @date 2018/11/1 16:48
    */
    @RequestMapping("/hello")
    public String hello(){
        return "你好，我是梅西";
    }
}
