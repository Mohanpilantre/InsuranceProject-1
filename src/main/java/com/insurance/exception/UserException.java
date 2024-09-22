package com.insurance.exception;

public class UserException {

	private final String message;

	public UserException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
