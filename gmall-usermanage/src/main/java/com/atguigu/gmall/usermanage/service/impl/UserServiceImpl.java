package com.atguigu.gmall.usermanage.service.impl;

import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import com.atguigu.gmall.usermanage.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    // 必须引用通用mapper
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
