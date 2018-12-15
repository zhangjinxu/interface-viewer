package com.zjx.opensource.interfaceviewer.controller;

import com.zjx.opensource.interfaceviewer.model.ResponseResult;
import com.zjx.opensource.interfaceviewer.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public ResponseResult projects() {
        return ResponseResult.getSuccessResult(projectService.listProjects());
    }
}
