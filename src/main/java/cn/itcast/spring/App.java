package cn.itcast.spring;


import cn.itcast.a_hello.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

    @Test
    public void testIOC(){
        Resource resource  = new ClassPathResource("cn/itcast/spring/applicationContext.xml");
        //
        BeanFactory factory = new XmlBeanFactory(resource);
        User user = (User) factory.getBean("user");
        System.out.println(user.getId());
    }

    @Test
    public void testIOC2(){
        ApplicationContext ac  = new ClassPathXmlApplicationContext("cn/itcast/spring/applicationContext.xml");
        System.out.println("====容器创建========");
//       User user2 = (User) ac.getBean("user2");
//       User user4 = (User) ac.getBean("user4");
         //User user3 = (User) ac.getBean("user3");
         User user5 = (User) ac.getBean("user5");
         System.out.println(user5.toString());
    }
}
