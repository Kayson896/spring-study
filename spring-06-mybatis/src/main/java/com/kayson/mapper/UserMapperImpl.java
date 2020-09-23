package com.kayson.mapper;

import com.kayson.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author
 * @date 2020/9/22 - 21:31
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate session;

    public void setSession(SqlSessionTemplate session) {
        this.session = session;
    }

    public List<User> getUser() {
        UserMapper mapper = session.getMapper(UserMapper.class);
        return mapper.getUser();
    }
}
