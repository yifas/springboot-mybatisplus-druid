package com.bin.service;


import com.bin.domain.TbUser;

public interface UserService {

    TbUser findById(String id);

    TbUser findByUsername(String username);
}
