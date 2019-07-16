package com.a6000.springaop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {


    @Test
    public void testUserByProxy(){
        String xml = "spring.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
        UserService userService = (UserService)applicationContext.getBean("proxySerivceId");
        userService.addUser();
    }

    @Test
    public void testUserBySpring(){
        String xml = "spring.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
        UserService userService = (UserService)applicationContext.getBean("userServiceId");
        userService.addUser();
        userService.deleteUser();
    }


}
