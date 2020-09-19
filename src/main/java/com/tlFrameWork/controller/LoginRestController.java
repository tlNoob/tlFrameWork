package com.tlFrameWork.controller;

import com.tlFrameWork.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/LoginRestController")
public class LoginRestController {

    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    public String login(String userId,String passWord) {
        String err=loginService.login(userId,passWord);
        return err;
    }
}
