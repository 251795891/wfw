package com.github.rpc.dubbo.services;

import org.springframework.stereotype.Service;

public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello! "+name;
    }
}