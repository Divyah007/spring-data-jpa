package com.divya.spring_data_jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.divya.spring_data_jpa.model.UserDetails;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Repository
@Transactional//--> this applies to each methods in the class
public class UserDetailsDao {
    
   @PersistenceContext
    //@Autowired
    private EntityManager entityManager;
  
    public Long insertUserDetails(UserDetails user) {
	log.info("----------------------------------");
	    entityManager.persist(user);
	    //now user object is in persistence context, 
	    //i.e user object is now being managed by the entity manager
	    
	   // entityManager.persist(user) --> it saves user to the 
	    //database and also starts tracking it.
	     return user.getId();
	}

}
