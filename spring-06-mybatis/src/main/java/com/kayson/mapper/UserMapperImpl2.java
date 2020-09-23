package com.kayson.mapper;

import com.kayson.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author
 * @date 2020/9/23 - 9:17
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getUser() {
        return getSqlSession().getMapper(UserMapper.class).getUser();
    }
}
