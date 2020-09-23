import com.kayson.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @date 2020/9/22 - 15:15
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //注意：动态代理的是接口，而不是某一个单纯的类
        UserService userserviceimpl = (UserService) context.getBean("userserviceimpl");
        userserviceimpl.add();
    }
}
