package com.zaine.myapp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("this is laptop");
    }
}
