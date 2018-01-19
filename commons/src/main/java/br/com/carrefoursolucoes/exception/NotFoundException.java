package br.com.carrefoursolucoes.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException {
	private static final long serialVersionUID = -8064092693212995764L;

	public NotFoundException(String message) {
		super(message);

		setErrorCode(ErrorCodes.NOT_FOUND);
		setHttpStatus(HttpStatus.NOT_FOUND);
	}
}
