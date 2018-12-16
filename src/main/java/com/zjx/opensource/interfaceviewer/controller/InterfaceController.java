package com.zjx.opensource.interfaceviewer.controller;

import com.alibaba.fastjson.JSON;
import com.zjx.opensource.interfaceviewer.model.InterfaceAddOrModifyParam;
import com.zjx.opensource.interfaceviewer.model.InterfaceVO;
import com.zjx.opensource.interfaceviewer.model.ResponseResult;
import com.zjx.opensource.interfaceviewer.model.User;
import com.zjx.opensource.interfaceviewer.service.InterfaceService;
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


    @RequestMapping(value = "/interfaces",method = RequestMethod.GET)
    public ResponseResult listInterface(HttpServletRequest request,
                                        @RequestParam(defaultValue = "1") int pageNum,
                                        @RequestParam(defaultValue = "1") int projectId,
                                        @RequestParam(defaultValue = "") String nameLike,
                                        @RequestParam(defaultValue = "0") long start,
                                        @RequestParam(defaultValue = "0") long end) {
        User user = (User) request.getSession().getAttribute("user");
        if (pageNum < 1) {
            pageNum = 1;
        }
        if (projectId < 1) {
            projectId = 1;
        }

        List<InterfaceVO> interfaces = interfaceService.listInterface(user, pageNum, projectId, nameLike, start, end);
        return ResponseResult.getSuccessResult(interfaces);
    }

    @RequestMapping(value = "/interface/{id}",method = RequestMethod.GET)
    public ResponseResult getInterface(HttpServletRequest request,@PathVariable("id") int interfaceId) {
        User user = (User) request.getSession().getAttribute("user");
        InterfaceVO iv = interfaceService.selectById(user,interfaceId);
        return ResponseResult.getSuccessResult(iv);
    }

    @RequestMapping(value = "/interface",method = RequestMethod.POST)
    public ResponseResult addInterface(HttpServletRequest request, InterfaceAddOrModifyParam p) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResponseResult.getFailResult("请先登录");
        }
        if (p == null) {
            return ResponseResult.getParamErrorResult();
        }
//        InterfaceAddOrModifyParam p = JSON.parseObject(param, InterfaceAddOrModifyParam.class);
        if (p.getId() != null) {
            p.setId(null);
        }
        if (!p.isCorrect()) {
            return ResponseResult.getParamErrorResult();
        }
        interfaceService.insertInterface(user, p);
        return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value = "/interfaces", method = RequestMethod.DELETE)
    public ResponseResult deleteInterfaces(HttpServletRequest request,@RequestParam(value = "interfaceIds[]")int[] interfaceIds) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResponseResult.getFailResult("请先登录");
        }


        interfaceService.deleteInterface(user,interfaceIds);
        return ResponseResult.getSuccessResult();
    }
    @RequestMapping(value = "/interface/{id}", method = RequestMethod.DELETE)
    public ResponseResult deleteInterface(HttpServletRequest request, @PathVariable("id") int interfaceId) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResponseResult.getFailResult("请先登录");
        }
        int[] ids = {interfaceId};
        interfaceService.deleteInterface(user,ids);
       return ResponseResult.getSuccessResult();
    }

    @RequestMapping(value = "/interface",method = RequestMethod.PUT)
    public ResponseResult modifyInterface(HttpServletRequest request, @RequestParam String param) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResponseResult.getFailResult("请先登录");
        }
        InterfaceAddOrModifyParam p = JSON.parseObject(param, InterfaceAddOrModifyParam.class);

        if (p == null || p.getId() == null || p.getId() <= 0) {
            return ResponseResult.getParamErrorResult();
        }
        interfaceService.updateInterface(user, p);
        return ResponseResult.getSuccessResult();
    }
}
