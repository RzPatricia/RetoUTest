package exceptions;

public class UsuarioNoRegistrado extends AssertionError{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UsuarioNoRegistrado (String message, Throwable cause) {
		super(message, cause);
	}

}
