package com.divya.spring_data_jpa.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.divya.spring_data_jpa.dao.UserDetailsDao;
import com.divya.spring_data_jpa.model.UserDetails;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class StartupRunner  implements CommandLineRunner  {

   @Autowired
    private UserDetailsDao userDetailsDao;
	@Override
	public void run(String... args) throws Exception {
	    Long id=  userDetailsDao.insertUserDetails(UserDetails.builder().name("Aishwariya Rai").build());
		   log.info("===id==={}",id);
	    
	}

}
