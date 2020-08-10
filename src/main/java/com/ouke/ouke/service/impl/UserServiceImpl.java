package com.ouke.ouke.service.impl;

import com.ouke.ouke.mapper.UserMapper;
import com.ouke.ouke.po.User;
import com.ouke.ouke.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectUserList() {
        try {
            return userMapper.selectUserList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User getUserByPassword(User user) {
        return userMapper.getUserByPassword(user);
    }

    @Override
    public Integer isExistUser(User user) {
        return userMapper.isExistUser(user);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
