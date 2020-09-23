import com.kayson.mapper.UserMapper;
import com.kayson.mapper.UserMapperImpl;
import com.kayson.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author
 * @date 2020/9/23 - 16:42
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        //使用了JDK动态代理，则getBean时必须使用其接口形式，且接口不能强转为其实现类，否则为报错。
        UserMapper usermapperimpl = context.getBean("usermapperimpl", UserMapper.class);
        List<User> users = usermapperimpl.updateAndQuery(null,0);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
