package com.xxgc.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/a/user")
public class SysUserController {
    //请求登录
    @RequestMapping("/login")
    public String login() {
        return "sys/login";
    }
    @RequestMapping("/logout")
    public String loginPage(HttpServletRequest request, HttpServletResponse
            response) {
        Authentication auth =
                SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
//设置用户厉害
            new SecurityContextLogoutHandler().logout(request,response,auth);
        }
        return "redirect:/a/user/login";
    }
}