package br.com.kafka.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseError {

	private Integer code;
	private String message;
	private String description;

	public ResponseError(Integer code, String message, String description) {
		this.code = code;
		this.message = message;
		this.description = description;
	}

	public ResponseError(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ResponseError [code=" + code + ", message=" + message + ", description=" + description + "]";
	}

}
