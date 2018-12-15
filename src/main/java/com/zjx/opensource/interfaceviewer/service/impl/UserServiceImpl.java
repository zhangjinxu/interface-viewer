package com.zjx.opensource.interfaceviewer.service.impl;
import java.util.Date;

import com.zjx.opensource.interfaceviewer.exception.BussinessException;
import com.zjx.opensource.interfaceviewer.mapper.UserMapper;
import com.zjx.opensource.interfaceviewer.model.User;
import com.zjx.opensource.interfaceviewer.model.UserExample;
import com.zjx.opensource.interfaceviewer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.isEmpty()) {
            throw new BussinessException("用户名或密码错误");
        }
        return users.get(0);
    }

    @Override
    public User register(String username, String password, String type) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (!users.isEmpty()) {
            throw new BussinessException("用户名已存在");
        }

        User user = new User();
        user.setName(username);
        user.setPassword(password);
        user.setType(type);
        user.setCreateTime(new Date());
        user.setIsDelete((byte)0);
        return user;
    }

}
