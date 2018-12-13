package com.zjx.opensource.interfaceviewer.controller;

import com.zjx.opensource.interfaceviewer.model.*;
import com.zjx.opensource.interfaceviewer.service.InterfaceService;
import com.zjx.opensource.interfaceviewer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class InterfaceController {

    private static final Logger logger = LoggerFactory.getLogger(InterfaceController.class);

    @Autowired
    private InterfaceService interfaceService;

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/interfaces", method = RequestMethod.GET)
    public ResponseResult listInterface(HttpServletRequest request,@RequestParam(defaultValue = "1") int pageNum, @RequestParam int projectId) {
        User user = (User) request.getSession().getAttribute("user");
        List<InterfaceVO> interfaces = interfaceService.listInterface(user, pageNum, projectId);
        return ResponseResult.getSuccessResult(interfaces);
    }

    @RequestMapping(value = "/interface/{id}",method = RequestMethod.GET)
    public ResponseResult getInterface(HttpServletRequest request,@PathVariable("id") int interfaceId) {
        User user = (User) request.getSession().getAttribute("user");
        InterfaceVO iv = interfaceService.selectById(user,interfaceId);
        return ResponseResult.getSuccessResult(iv);
    }

    @RequestMapping(value = "/interface",method = RequestMethod.POST)
    public ResponseResult addInterface(HttpServletRequest request, InterfaceAddOrModifyParam param) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResponseResult.getFailResult("请先登录");
        }
        if (param == null) {
            return ResponseResult.getParamErrorResult();
        }
        if (param.getId() != null) {
            return ResponseResult.getParamErrorResult();
        }
        if (!param.isCorrect()) {
            return ResponseResult.getParamErrorResult();
        }
        interfaceService.insertInterface(user, param);
        return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value = "/interface/{id}", method = RequestMethod.DELETE)
    public ResponseResult deleteInterface(HttpServletRequest request, @PathVariable("id") int interfaceId) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResponseResult.getFailResult("请先登录");
        }
        interfaceService.deleteInterface(user,interfaceId);
       return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value = "/interface",method = RequestMethod.PUT)
    public ResponseResult modifyInterface(HttpServletRequest request, InterfaceAddOrModifyParam param) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResponseResult.getFailResult("请先登录");
        }
        if (param == null || param.getId() == null || param.getId() <= 0) {
            return ResponseResult.getParamErrorResult();
        }
        interfaceService.updateInterface(user, param);
        return ResponseResult.getSuccessResult();
    }
}
