package br.com.kafka.exception;

import org.springframework.http.HttpStatus;

public class BaseException extends Exception {
	private static final long serialVersionUID = 6668394757725432020L;

	private ErrorCodes errorCode;
	private HttpStatus httpStatus;

	
	public BaseException(String message) {
		super(message);
	}
	
	
	/* Getters and setters */
	public ErrorCodes getErrorCode() { return errorCode; }
	public void setErrorCode(ErrorCodes errorCode) { this.errorCode = errorCode; }

	public HttpStatus getHttpStatus() {	return httpStatus; }
	public void setHttpStatus(HttpStatus httpStatus) { this.httpStatus = httpStatus; }
}