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

    public int addUser(User user) {
        if (user!=null)
        return session.getMapper(UserMapper.class).addUser(user);
        return 0;
    }

    public int deleteUser(int id) {
        if (id != 0){
            return session.getMapper(UserMapper.class).deleteUser(id);
        }
        return 0;
    }
    //事务
    public List<User> updateAndQuery(User user,int id){
        addUser(user);
//        int a=1/0;
        deleteUser(id);
        return getUser();
    }
}
