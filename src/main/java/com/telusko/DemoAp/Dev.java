package com.telusko.DemoAp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer c;

//    public Dev(Laptop l) {
//        this.l = l;
//    }

//    @Autowired
//    public void setLaptop(Laptop l) {
//        this.l = l;
//    }

    public void build() {
        System.out.println("Working on Awesome project with");
        c.compile();
    }
}
