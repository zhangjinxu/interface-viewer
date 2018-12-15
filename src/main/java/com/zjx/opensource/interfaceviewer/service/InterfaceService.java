package com.zjx.opensource.interfaceviewer.service;

import com.zjx.opensource.interfaceviewer.model.InterfaceAddOrModifyParam;
import com.zjx.opensource.interfaceviewer.model.InterfaceVO;
import com.zjx.opensource.interfaceviewer.model.User;

import java.util.List;

public interface InterfaceService {
    List<InterfaceVO> listInterface(User user, int pageNum, int projectId, String nameLike, long start, long end);

    void insertInterface(User user, InterfaceAddOrModifyParam param);

    void deleteInterface(User user, int interfaceId);

    InterfaceVO selectById(User user, int interfaceId);

    void updateInterface(User user, InterfaceAddOrModifyParam param);
}
