package com.example.first.learningBeans.brands;

import com.example.first.learningBeans.CarBrands;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "user.likes.env", havingValue = "german")
public class German implements CarBrands {
    @Override
    public String getBrands() {
        return "Audi, Volkswagen, BMW etc.";
    }
}
