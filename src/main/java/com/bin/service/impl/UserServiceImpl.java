package com.bin.service.impl;

import com.bin.dao.UserMapper;
import com.bin.domain.TbUser;
import com.bin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public TbUser findById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public TbUser findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
