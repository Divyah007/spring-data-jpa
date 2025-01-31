package com.divya.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.divya.spring_data_jpa.dao.UserDetailsDao;
import com.divya.spring_data_jpa.model.UserDetails;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class SpringDataJpaApplication {
    
    

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
		
		
	}
	
	

}
