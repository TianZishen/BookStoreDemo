import im.zishen.study.bookstore.bookstore_springmvc.model.User;
import im.zishen.study.bookstore.bookstore_springmvc.service.LoginService;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        LoginService loginService = (LoginService) ctx.getBean("loginService");
        User user = new User();
        user.setName("username");
        user.setPassword("123456");
        loginService.login(user);
    }
}
