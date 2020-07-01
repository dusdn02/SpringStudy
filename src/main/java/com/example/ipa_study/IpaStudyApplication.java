package com.example.ipa_study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IpaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpaStudyApplication.class, args);
		
		LombokTest lt = new LombokTest();
		LombokTest lt2 = new LombokTest("asdf", 1234);
		lt2.setValue2(5678);
		System.out.println(lt2);
		
	}

}
