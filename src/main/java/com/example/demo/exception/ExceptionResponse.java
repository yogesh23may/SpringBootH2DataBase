package com.example.demo.exception;

public class ExceptionResponse {
	
	private int errorCode;
	
	private String errorMessage;
	
	private String exceptionHandlingLevel;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getExceptionHandlingLevel() {
		return exceptionHandlingLevel;
	}

	public void setExceptionHandlingLevel(String exceptionHandlingLevel) {
		this.exceptionHandlingLevel = exceptionHandlingLevel;
	}	
	
}
