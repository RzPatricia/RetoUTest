package component;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {

	public static final Target BOTON_REGISTAR = Target.the("Boton registrar")
			.locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
	public static final Target CAMPO_NOMBRE = Target.the("Campo nombre").located(By.id("firstName"));
	public static final Target CAMPO_APELLIDO = Target.the("Campo apellido").located(By.id("lastName"));
	public static final Target CAMPO_EMAIL = Target.the("Campo email").located(By.id("email"));
	public static final Target CAMPO_MES = Target.the("Campo mes").locatedBy("//select[@id='birthMonth']");
	public static final Target CAMPO_DIA = Target.the("Campo dia").locatedBy("//select[@name='birthDay']");
	public static final Target CAMPO_AÑO = Target.the("Campo año").locatedBy("//select[@name='birthYear']");
	public static final Target CAMPO_IDIOMA = Target.the("Campo idioma").locatedBy("//input[@type='search']");
	public static final Target BOTON_SIGUIENTE = Target.the("Boton siguiente")
			.locatedBy("//span[contains(text(),'Next: ')]//parent::a");
	public static final Target CAMPO_PASSWORD = Target.the("Campo password").located(By.id("password"));
	public static final Target CAMPO_CONFIRM_PASSWORD = Target.the("Campo confirmPassword")
			.located(By.id("confirmPassword"));
	public static final Target CHECK_TERMINO_CONDICIONES = Target.the("Campo TerminoCondiciones")
			.located(By.id("termOfUse"));
	public static final Target CHECK_PRIVACIDAD = Target.the("Campo Privacidad").located(By.id("privacySetting"));
	public static final Target BOTON_COMPLETADO = Target.the("Boton completado")
			.locatedBy("//span[contains(text(),'Complete Setup')]//parent::a");
	public static final Target MENSAJE_REGISTRO_CORRECTO = Target.the("Mensaje registro correcto")
			.locatedBy("//h1[contains(text(),\"Welcome to the world's largest community\")]");

}
