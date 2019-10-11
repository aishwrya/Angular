package com.cts.MicroService.client.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String token;
private UserEntity user;

public UserEntity getUser() {
	return user;
}

public void setUser(UserEntity user) {
	this.user = user;
}

public JwtResponse(String token, UserEntity user) {
	super();
	this.token = token;
	this.user = user;
}

public String getToken() {
	return token;
}
	
	
}