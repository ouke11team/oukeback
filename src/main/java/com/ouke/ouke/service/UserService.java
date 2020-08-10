package com.ouke.ouke.service;
import com.ouke.ouke.po.User;
import java.util.List;
public interface UserService {
    List<User> selectUserList();
    User getUserByPassword(User user);
    Integer isExistUser(User user);
    int insert(User user);
}
