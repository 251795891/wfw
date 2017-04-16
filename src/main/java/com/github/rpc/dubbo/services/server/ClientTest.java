package com.github.rpc.dubbo.services.server;


import com.github.rpc.dubbo.services.HelloService;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class ClientTest {
    public static void main(String[] args) throws Exception {
        String dir =Class.class.getClass().getResource("/").getPath().substring(1)+"config/log4j.properties";
        PropertyConfigurator.configure("/".equals(File.separator)?"/":""+dir);
        ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("config/spring-dubbo-client.xml");
        HelloService helloService= (HelloService) ct.getBean("helloService");
        String result = helloService.hello("wtd--------123");
        System.out.println(result);
    }
}
