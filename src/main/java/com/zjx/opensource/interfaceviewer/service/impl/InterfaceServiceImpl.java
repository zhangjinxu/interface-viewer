package com.zjx.opensource.interfaceviewer.service.impl;
import java.util.Date;

import com.github.pagehelper.PageHelper;
import com.zjx.opensource.interfaceviewer.mapper.InterfaceFieldMapper;
import com.zjx.opensource.interfaceviewer.mapper.InterfaceMapper;
import com.zjx.opensource.interfaceviewer.model.*;
import com.zjx.opensource.interfaceviewer.service.InterfaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class InterfaceServiceImpl implements InterfaceService {
    private static final Logger logger = LoggerFactory.getLogger(InterfaceServiceImpl.class);

    @Autowired
    private InterfaceMapper interfaceMapper;

    @Autowired
    private InterfaceFieldMapper interfaceFieldMapper;

    @Override
    public List<InterfaceVO> listInterface(User user, int pageNum, int projectId, String nameLike, long start, long end) {
        List<InterfaceVO> interfaceVOS = interfaceMapper.selectByProjectId(projectId,nameLike,start,end);
        for (InterfaceVO i : interfaceVOS) {
            Integer id = i.getId();
            List<InterfaceField> fields = interfaceFieldMapper.selectByInterfaceId(id);
            i.setFields(fields);
        }
        return interfaceVOS;
    }

    @Override
    public void insertInterface(User user, InterfaceAddOrModifyParam param) {
        Interface i = new Interface();
        i.setName(param.getName());
        i.setUrl(param.getUrl());
        i.setRequestMethod(param.getRequestMethod());
        i.setDescription(param.getDescription());
        i.setCreateUserId(user.getId());
        i.setUpdateUserId(user.getId());
        i.setProjectId(param.getProjectId());
        interfaceMapper.insertSelective(i);

        insertInterfaceField(user.getId(),param.getFields(),i.getId());


    }

    @Override
    public void deleteInterface(User user, int interfaceId) {
        Interface i = interfaceMapper.selectByPrimaryKey(interfaceId);
        if (i == null) {
            return;
        }

        i.setIsDelete(true);
        i.setUpdateTime(new Date());
        i.setUpdateUserId(user.getId());
        interfaceMapper.updateByPrimaryKeySelective(i);

        deleteInterfaceField(user.getId(),interfaceId);
    }

    private void deleteInterfaceField(int userId, int interfaceId) {
        List<InterfaceField> fields = interfaceFieldMapper.selectByInterfaceId(interfaceId);
        for (InterfaceField field : fields) {
            field.setIsDelete(true);
            field.setUpdateTime(new Date());
            field.setUpdateUserId(userId);
            interfaceFieldMapper.updateByPrimaryKeySelective(field);
        }
    }

    @Override
    public InterfaceVO selectById(User user,int interfaceId) {
        InterfaceVO iv = interfaceMapper.selectById(interfaceId);
        List<InterfaceField> ifs = interfaceFieldMapper.selectByInterfaceId(interfaceId);
        iv.setFields(ifs);
        return iv;
    }

    @Override
    public void updateInterface(User user, InterfaceAddOrModifyParam param) {
        Interface i = new Interface();
        i.setId(param.getId());
        i.setName(param.getName());
        i.setUrl(param.getUrl());
        i.setRequestMethod(param.getRequestMethod());
        i.setDescription(param.getDescription());
        i.setUpdateTime(new Date());
        i.setUpdateUserId(user.getId());
        interfaceMapper.updateByPrimaryKeySelective(i);

        deleteInterfaceField(user.getId(),param.getId());

        insertInterfaceField(user.getId(), param.getFields(), param.getId());

    }

    private void insertInterfaceField(int userId, List<InterfaceField> fields, Integer interfaceId) {
        for (InterfaceField f : fields) {
            f.setId(null);
            f.setInterfaceId(interfaceId);
            f.setIsDelete(false);
            f.setCreateUserId(userId);
            f.setUpdateUserId(userId);
            interfaceFieldMapper.insertSelective(f);
        }
    }
}
