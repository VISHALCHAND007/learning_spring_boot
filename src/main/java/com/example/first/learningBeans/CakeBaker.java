package com.example.first.learningBeans;


import com.example.first.learningBeans.interfaces.Frosting;
import com.example.first.learningBeans.interfaces.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CakeBaker {
    final Frosting frosting;
    final Syrup syrup;

    CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    void bakeCake() {
        System.out.println("Baking the cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType() + " .");
    }
}
