package com.example.first.learningBeans;

import org.springframework.stereotype.Service;

@Service
public class GetBrandSuggestionService {
    final CarBrands carBrands;

    //constructor injection
    GetBrandSuggestionService(CarBrands carBrands) {
        this.carBrands = carBrands;
    }

    public String getSuggestion() {
        return carBrands.getBrands();
    }
}
