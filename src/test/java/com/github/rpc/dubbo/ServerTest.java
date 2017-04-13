package com.github.rpc.dubbo;


import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.ConcurrentHashMap;

public class ServerTest {
    public static void main(String[] args) throws Exception{
        String dir =Class.class.getClass().getResource("/").getPath().substring(1)+"log4j.properties";
        PropertyConfigurator.configure(dir);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/spring-dubbo-server.xml");
        context.start();

        System.in.read(); // 按任意键退出
    }
}
