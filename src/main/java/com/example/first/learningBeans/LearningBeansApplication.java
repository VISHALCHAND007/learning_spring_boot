package com.example.first.learningBeans;

import com.example.first.learningBeans.interfaces.Frosting;
import com.example.first.learningBeans.interfaces.Syrup;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearningBeansApplication  implements CommandLineRunner {
	@Autowired
	CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(LearningBeansApplication.class, args);
	}

	@Override
	public void run(String @NonNull ... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
