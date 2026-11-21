package com.example.first.learningBeans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//import org.springframework.stereotype.Component;
//
//@Component
public class Dog {
    String makesSound() {
        return "Dog barks.";
    }

    @PostConstruct
    void postWork() {
        System.out.println("Prepare the house for dog.");
    }

    @PreDestroy
    void afterWork() {
        System.out.println("Say good bye!");
    }
}
