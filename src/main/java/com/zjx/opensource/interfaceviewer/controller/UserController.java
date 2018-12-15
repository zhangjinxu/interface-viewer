package com.zjx.opensource.interfaceviewer.controller;

import com.zjx.opensource.interfaceviewer.model.ResponseResult;
import com.zjx.opensource.interfaceviewer.model.User;
import com.zjx.opensource.interfaceviewer.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResponseResult login(HttpServletRequest request, @RequestParam String username, @RequestParam String password) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return ResponseResult.getParamErrorResult();
        }
        User user = userService.login(username,password);
        request.getSession().setAttribute("user", user);
        return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ResponseResult register(HttpServletRequest request, HttpServletResponse response, @RequestParam String username, @RequestParam String password, @RequestParam(defaultValue = "visitor") String type) {
        User user = userService.register(username, password, type);
        request.getSession().setAttribute("user", user);
        return ResponseResult.getSuccessResult();
    }
}
