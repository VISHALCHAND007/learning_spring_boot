package com.example.first.learningBeans.brands;

import com.example.first.learningBeans.CarBrands;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "user.likes.env", havingValue = "unitedStates")
public class UnitedStates implements CarBrands {
    @Override
    public String getBrands() {
        return "Ford, Tesla etc.";
    }
}
