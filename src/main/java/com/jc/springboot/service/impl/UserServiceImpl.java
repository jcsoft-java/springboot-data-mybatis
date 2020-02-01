package com.jc.springboot.service.impl;

import com.jc.springboot.dao.mapper.UserMapper;
import com.jc.springboot.dao.model.User;
import com.jc.springboot.dao.model.UserExample;
import com.jc.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/1/31 17:30
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        userMapper.selectByExample(new UserExample());
        return  userMapper.selectByPrimaryKey(id);
    }
}
