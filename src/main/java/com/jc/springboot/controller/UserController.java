package com.jc.springboot.controller;

import com.jc.springboot.dao.model.User;
import com.jc.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/1/31 17:29
 * @Version 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    @ResponseBody
    public User user(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

}
