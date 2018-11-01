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

    @RequestMapping("/hello")
    public String hello(){
        return "你好，我是梅西";
    }
}
