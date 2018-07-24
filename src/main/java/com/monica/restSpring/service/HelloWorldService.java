package com.monica.restSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monica.restSpring.model.HelloWorldBean;
import com.monica.restSpring.repository.HelloWorldRepository;

@Service
public class HelloWorldService {

	@Autowired
	public HelloWorldRepository repo;
	
	public HelloWorldBean createMsg(HelloWorldBean bean) {
		return repo.save(bean);
	}
}
