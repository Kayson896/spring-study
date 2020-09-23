package com.kayson.service;

import com.kayson.dao.UserDao;
import com.kayson.dao.UserDaoImpl;

/**
 * @author
 * @date 2020/9/20 - 13:33
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
