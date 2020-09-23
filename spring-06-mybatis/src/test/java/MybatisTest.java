import com.kayson.mapper.UserMapper;
import com.kayson.mapper.UserMapperImpl;
import com.kayson.mapper.UserMapperImpl2;
import com.kayson.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author
 * @date 2020/9/22 - 16:28
 */
public class MybatisTest {
    @Test
    public void test() throws IOException {
        InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.getUser();
        for (User user1 : user) {
            System.out.println(user1);
        }
        sqlSession.close();
    }
//    @Test
//    public void test1(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
//        UserServiceImpl userserviceimpl = (UserServiceImpl) context.getBean("userserviceimpl");
//        List<User> users = userserviceimpl.getUser();
//        for (User user : users) {
//            System.out.println(user);
//        }
//    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl usermapperimpl = (UserMapperImpl) context.getBean("usermapperimpl");
        List<User> users = usermapperimpl.getUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapperImpl2 usermapperimpl = (UserMapperImpl2) context.getBean("usermapperimpl2");
        List<User> users = usermapperimpl.getUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
