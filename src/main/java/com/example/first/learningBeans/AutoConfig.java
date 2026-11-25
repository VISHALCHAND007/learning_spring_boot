package com.example.first.learningBeans;

import com.example.first.learningBeans.interfaces.Frosting;
import com.example.first.learningBeans.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class AutoConfig {
    @Autowired
    Frosting frosting;

    @Autowired
    Syrup syrup;

    @Bean
    CakeBaker getCakeBaker() {
        return new CakeBaker(frosting, syrup);
    }
}
