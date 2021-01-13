package questions;

import component.PaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UsuarioRegistrado implements Question<Boolean> {

	private String mensaje;
	public UsuarioRegistrado(String mensaje) {
		this.mensaje=mensaje;
 	}
	@Override
	public Boolean answeredBy(Actor actor) {
		return PaginaPrincipal.MENSAJE_REGISTRO_CORRECTO.resolveFor(actor).containsText(mensaje);
	}
	public static UsuarioRegistrado correctamente(String mensaje) {
		return new UsuarioRegistrado(mensaje);
	}

}
