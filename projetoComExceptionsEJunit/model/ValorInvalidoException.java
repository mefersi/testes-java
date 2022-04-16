package model;

public class ValorInvalidoException extends RuntimeException {
	private static final long serialVersionUID = 2579125713361471330L;

	public ValorInvalidoException(String msg) {
		super(msg);
	}
}
