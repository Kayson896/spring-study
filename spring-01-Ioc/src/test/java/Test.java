import com.kayson.service.UserService;
import com.kayson.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @date 2020/9/20 - 13:36
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         UserService serviceImpl = (UserServiceImpl)context.getBean("serviceImpl");
         serviceImpl.getUser();
    }
}
