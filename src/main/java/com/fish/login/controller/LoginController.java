package com.fish.login.controller;

import com.fish.login.dto.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user/api/")
public class LoginController {
    @PostMapping("/login") /*@PostMapping("/login")表示：有人访问 /login-进入 login() 方法*/
    public String login(@RequestBody LoginRequest abc){/*@RequestBody = 把前端传过来的 JSON，转换成 Java 对象。*/
        String u = abc.getUsername();/*abc是变量名*/
        String p = abc.getPassword();
        if(u.equals("kevin") && p.equals("123456")){
            return "登陆成功";
        }else {
            return "用户名或者密码错误777";
        }
       // return "欢迎"+ u+","+"密码是"+p;



    }

}
