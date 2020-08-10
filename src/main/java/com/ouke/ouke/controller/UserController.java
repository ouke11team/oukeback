package com.ouke.ouke.controller;

import com.ouke.ouke.po.User;
import com.ouke.ouke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/list")
    public List<User> selectUserList(){
        return userService.selectUserList();
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public User getUserByPassword(User user){
        return userService.getUserByPassword(user);
    }

    @RequestMapping(value = "/isexistuser")
    public Integer isExistUser(User user){
        return userService.isExistUser(user);
    }
    @RequestMapping(value = "/insert")
    public int insert(User user){
        return userService.insert(user);
    }
}
