package com.ouke.ouke.mapper;

import com.ouke.ouke.po.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface UserMapper {
    List<User> selectUserList();
    User getUserByPassword(User user);
    Integer isExistUser(User user);
    int insert(User user);
}
