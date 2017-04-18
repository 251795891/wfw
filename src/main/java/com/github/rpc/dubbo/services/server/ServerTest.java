package com.github.rpc.dubbo.services.server;


import com.github.asa.base.util.OSInfo;
import com.github.rpc.dubbo.services.HelloService;
import com.github.rpc.dubbo.services.HelloServiceImpl;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;

public class ServerTest {
    //log日志记录
    protected static Logger log = LogManager.getLogger(ServerTest.class);

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                String dir = (OSInfo.isLinux() ? "/" : "") + Class.class.getClass().getResource("/").getPath().substring(1) + "config/log4j.properties";
                PropertyConfigurator.configure(dir);
                ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/spring-dubbo-server.xml");
                context.start();
                log.info("启动成功");

                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
    }
}
