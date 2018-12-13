package com.zjx.opensource.interfaceviewer.service;

import com.zjx.opensource.interfaceviewer.model.User;

public interface UserService {
    User login(String username, String password);
}
