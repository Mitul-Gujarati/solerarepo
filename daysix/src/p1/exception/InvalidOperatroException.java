package p1.exception;

public class InvalidOperatroException extends Exception {
	private String message;

	public InvalidOperatroException() {
		super();

	}

	public InvalidOperatroException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public InvalidOperatroException(String message, Throwable cause) {
		super(message, cause);

	}

	public InvalidOperatroException(String message) {
		super(message);

	}

	public InvalidOperatroException(Throwable cause) {
		super(cause);
	}
	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
