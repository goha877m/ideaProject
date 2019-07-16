package com.a6000;

import com.a6000.springAop.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAopTest {

    @Test
    public void testUserByProxy() throws Exception {
        String xml = "spring.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
        UserServiceImpl userService = (UserServiceImpl)applicationContext.getBean("userServiceId");
        userService.addUser();
    }
}
