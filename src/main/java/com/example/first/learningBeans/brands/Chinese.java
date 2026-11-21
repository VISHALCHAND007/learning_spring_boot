package com.example.first.learningBeans.brands;

import com.example.first.learningBeans.CarBrands;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "user.likes.env", havingValue = "chinese")
public class Chinese implements CarBrands {
    @Override
    public String getBrands() {
        return "Morris Garage, Xiaomi, BYD etc.";
    }
}
