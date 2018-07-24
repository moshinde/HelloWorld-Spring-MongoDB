package com.monica.restSpring.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="HelloWorldBean")
public class HelloWorldBean {
	public String msg;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HelloWorldBean() {
	}
	public HelloWorldBean(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [msg=" + msg + "]";
	}
	

}
