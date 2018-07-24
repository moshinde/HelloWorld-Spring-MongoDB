package com.monica.restSpring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.monica.restSpring.model.HelloWorldBean;

@Repository
public interface HelloWorldRepository extends MongoRepository<HelloWorldBean, String>{
	
}
