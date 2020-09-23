package com.kayson.mapper;

import com.kayson.pojo.User;

import java.util.List;

/**
 * @author
 * @date 2020/9/22 - 16:22
 */
public interface UserMapper {
    public List<User> getUser();
    public int addUser(User user);
    public int deleteUser(int id);
    public List<User> updateAndQuery(User user,int id);
}
