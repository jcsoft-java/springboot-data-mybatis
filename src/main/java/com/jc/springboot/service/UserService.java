package com.jc.springboot.service;

import com.jc.springboot.dao.model.User;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/1/31 17:29
 * @Version 1.0
 */
public interface UserService {
    User getUserById(Integer id);
}
