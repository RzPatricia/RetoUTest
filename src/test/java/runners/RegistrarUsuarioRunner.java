package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registrar_usuario.feature",
snippets = SnippetType.CAMELCASE, 
glue = "definitions", 
tags = "@RegistrarUsuario")
public class RegistrarUsuarioRunner {

}
