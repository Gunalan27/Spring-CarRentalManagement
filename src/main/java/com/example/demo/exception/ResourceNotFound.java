package com.example.demo.exception;

public class ResourceNotFound extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFound(String message){
		System.out.println(message);
	}

}
