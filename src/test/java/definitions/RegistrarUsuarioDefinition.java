package definitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import drivers.Driver;
import exceptions.UsuarioNoRegistrado;
import models.Datos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import questions.UsuarioRegistrado;
import tasks.Registrar;

public class RegistrarUsuarioDefinition {

	@Before
	public void setStage() {
		setTheStage(Cast.ofStandardActors());
	}

	@Dado("^que el (.*) se encuentra en la pagina principal de uTest$")
	public void queElUsuarioFinalSeEncuentraEnLaPaginaPrincipalDeUTest(String usuario) {
		theActorCalled(usuario).can(BrowseTheWeb.with(Driver.chrome().pagina()));
	}

	@Cuando("^se registra el usuario$")
	public void seRegistraElUsuario(List<Datos> datos) {
		theActorInTheSpotlight().attemptsTo(Registrar.usuario(datos));
	}

	@Entonces("^el usuario final debe visualizar el mensaje (.*)$")
	public void elUsuarioFinalDebeVisualizarElMensajeWelcomeToTheWorldSLargestCommunity(String mensaje) {
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(UsuarioRegistrado.correctamente(mensaje))
				.orComplainWith(UsuarioNoRegistrado.class));
	}
}
