package com.tlFrameWork.service.impl;

import com.tlFrameWork.model.SysUser;
import com.tlFrameWork.repository.SysUserRepository;
import com.tlFrameWork.service.LoginService;
import com.tlFrameWork.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private SysUserRepository sysUserRepository;
    @Autowired
    private HttpServletRequest request;
    @Override
    public String login(String userId, String passWord) {
        String err=null;
        SysUser sysUser=null;
        try {
             sysUser =sysUserRepository.findByUserIdAndPassWord(userId,MD5Utils.md5(passWord));
        }catch (Exception e){
             err="无法获取用户信息！";
        }

        if(null != sysUser){
            request.getSession().setAttribute("user",sysUser);
        }else {
            err="用户名或者密码错误,请重新输入！";
        }
        return err;
    }
}
