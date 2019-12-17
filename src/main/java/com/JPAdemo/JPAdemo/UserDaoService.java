package com.JPAdemo.JPAdemo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.JPAdemo.*;


//-- Enity manager is used when we want to store store data into table 
//--  @Repository - this annotation represnt that this class is used to store and modify the data 
//--when we need to modify database we need to open the transaction and close the transaction
//in JPA this is handelled by @Transactional annotation - this(@Transactional annotation) says 
//each method is involved in transaction
// -- relation of entityManager with persistenceContext -- Eg(If we have created two obj, one 
// we are managing with persistnce context and another without persistence context then entity manager 
//wont be able to made changes two another object) - if we have modified obj using persistne conte
//then entity manager starts tracking it  - To overcome this we can use @PersistenceContext
//-- CommandLineRunner  - it is executed when application starts up 


@Repository
@Transactional
public class UserDaoService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(User user){
		System.out.println("************here");
		 entityManager.persist(user);
		return user.getId();
	}

}
