package com.github.rpc.dubbo.services;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
public class HelloServiceImpl implements HelloService {
    protected Logger log = LogManager.getLogger(this.getClass());
    public String hello(String name)
    {
        log.info("hello 收到："+name);
        return "Hello! "+name;
    }
}