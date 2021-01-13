package tasks;

import static component.PaginaPrincipal.BOTON_COMPLETADO;
import static component.PaginaPrincipal.BOTON_REGISTAR;
import static component.PaginaPrincipal.BOTON_SIGUIENTE;
import static component.PaginaPrincipal.CAMPO_APELLIDO;
import static component.PaginaPrincipal.CAMPO_AÑO;
import static component.PaginaPrincipal.CAMPO_CONFIRM_PASSWORD;
import static component.PaginaPrincipal.CAMPO_DIA;
import static component.PaginaPrincipal.CAMPO_EMAIL;
import static component.PaginaPrincipal.CAMPO_IDIOMA;
import static component.PaginaPrincipal.CAMPO_MES;
import static component.PaginaPrincipal.CAMPO_NOMBRE;
import static component.PaginaPrincipal.CAMPO_PASSWORD;
import static component.PaginaPrincipal.CHECK_PRIVACIDAD;
import static component.PaginaPrincipal.CHECK_TERMINO_CONDICIONES;
import static org.openqa.selenium.Keys.ENTER;

import java.util.List;

import models.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Registrar implements Task {

	private List<Datos> datos;

	public Registrar(List<Datos> datos) {
		this.datos = datos;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_REGISTAR), Enter.theValue(datos.get(0).getNombre()).into(CAMPO_NOMBRE),
				Enter.theValue(datos.get(0).getApellido()).into(CAMPO_APELLIDO),
				Enter.theValue(datos.get(0).getEmail()).into(CAMPO_EMAIL),
				SelectFromOptions.byVisibleText(datos.get(0).getMes()).from(CAMPO_MES),
				SelectFromOptions.byVisibleText(datos.get(0).getDia()).from(CAMPO_DIA),
				SelectFromOptions.byVisibleText(datos.get(0).getAño()).from(CAMPO_AÑO),
				Enter.theValue(datos.get(0).getIdioma()).into(CAMPO_IDIOMA).thenHit(ENTER), Click.on(BOTON_SIGUIENTE),
				Click.on(BOTON_SIGUIENTE), Click.on(BOTON_SIGUIENTE),
				Enter.theValue(datos.get(0).getPassword()).into(CAMPO_PASSWORD),
				Enter.theValue(datos.get(0).getPassword()).into(CAMPO_CONFIRM_PASSWORD),
				Click.on(CHECK_TERMINO_CONDICIONES), Click.on(CHECK_PRIVACIDAD), Click.on(BOTON_COMPLETADO));
	}

	public static Registrar usuario(List<Datos> datos) {
		return Tasks.instrumented(Registrar.class, datos);
	}

}
