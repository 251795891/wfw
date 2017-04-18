package com.github.rpc.dubbo.services.server;


import com.github.asa.base.util.OSInfo;
import com.github.rpc.dubbo.services.HelloService;
import com.github.rpc.dubbo.services.HelloServiceImpl;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class ServerTest {
    public static void main(String[] args) throws Exception{
        String dir = (OSInfo.isLinux() ? "/" : "")+Class.class.getClass().getResource("/").getPath().substring(1) + "config/log4j.properties";
        PropertyConfigurator.configure(dir);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/spring-dubbo-server.xml");
        context.start();
        System.out.println("启动成功");
        System.in.read(); // 按任意键退出
    }
}
