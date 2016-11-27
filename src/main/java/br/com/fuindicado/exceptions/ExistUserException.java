package br.com.fuindicado.exceptions;

public class ExistUserException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ExistUserException() {
		super();
	}

	public ExistUserException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExistUserException(String message) {
		super(message);
	}

	public ExistUserException(Throwable cause) {
		super(cause);
	}
}
