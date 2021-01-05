package com.bin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bin.domain.TbUser;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<TbUser> {

    /**
     * 根据名字查询对象
     * @param username 用户名
     * @return user对象
     */
    TbUser findByUsername(@Param("username") String username);
}
