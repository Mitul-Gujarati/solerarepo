package p1.exception;

public class EquationInCompleteException extends Exception{

	public EquationInCompleteException() {
		super();
	}

	public EquationInCompleteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EquationInCompleteException(String message, Throwable cause) {
		super(message, cause);
	}

	public EquationInCompleteException(String message) {
		super(message);
	}

	public EquationInCompleteException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}


}
