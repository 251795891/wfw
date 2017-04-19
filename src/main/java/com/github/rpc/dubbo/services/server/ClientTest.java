package com.github.rpc.dubbo.services.server;


import com.github.asa.base.util.OSInfo;
import com.github.rpc.dubbo.services.HelloService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

public class ClientTest {
    protected static Logger log = LogManager.getLogger(ClientTest.class);
    public static void main(String[] args) throws Exception {
        PropertyConfigurator.configure(ClientTest.class.getClassLoader().getResource("config/log4j.properties"));
        ClassPathXmlApplicationContext ct = new ClassPathXmlApplicationContext("config/spring-dubbo-client.xml");
        HelloService helloService = (HelloService) ct.getBean("helloService");
        String result = helloService.hello("wtd--------123");
        log.info(result);
        result = helloService.hello("wtd--------124");
        log.info(result);
        result = helloService.hello("wtd--------125");
        log.info(result);
    }
}
