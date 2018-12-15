package com.zjx.opensource.interfaceviewer.service.impl;

import com.zjx.opensource.interfaceviewer.mapper.ProjectMapper;
import com.zjx.opensource.interfaceviewer.model.Project;
import com.zjx.opensource.interfaceviewer.model.ProjectExample;
import com.zjx.opensource.interfaceviewer.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {


    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public List<Project> listProjects() {
        ProjectExample projectExample = new ProjectExample();
        projectExample.createCriteria().andIsDeleteEqualTo(false);
        return projectMapper.selectByExample(projectExample);
    }
}
