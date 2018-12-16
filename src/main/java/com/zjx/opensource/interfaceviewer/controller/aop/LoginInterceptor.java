package com.zjx.opensource.interfaceviewer.controller.aop;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        if (user == null) {
            response.getWriter().write("{code:-100,msg:'session is invalid,please login again!'}");
            return false;
        }
        return true;
    }


}
