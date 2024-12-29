package com.rishith.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired // it automatically connects it behind the scene (field injection)
    private Laptop laptop;

    // public Dev(Laptop laptop){
    //     this.laptop = laptop;
    // }
    
    // @Autowired
    // public void setLaptop(Laptop laptop){
    //     this.laptop = laptop;
    // }

    public void build(){
        laptop.compile();
        System.out.println("working on Awesome Project");
    }
}