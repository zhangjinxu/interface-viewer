package com.zjx.opensource.interfaceviewer.controller;

import com.zjx.opensource.interfaceviewer.model.ResponseResult;
import com.zjx.opensource.interfaceviewer.model.User;
import com.zjx.opensource.interfaceviewer.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    public ResponseResult login(HttpServletRequest request, @RequestParam String username, @RequestParam String password) {
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return ResponseResult.getParamErrorResult();
        }
        User user = userService.login(username,password);
        request.getSession().setAttribute("user", user);
        return ResponseResult.getSuccessResult();
    }
}
