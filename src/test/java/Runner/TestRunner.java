package Runner;
 
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import fredpit.BasePage;
import fredpit.PaginaPrincipal;

 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", // Directorio de nuestros archivos .feature
                glue = "steps", // Paquete donde tenemos nuestras clases definiendo los steps
                plugin = { "pretty", "html:target/cucumber-reports" })
 
public class TestRunner {
        @AfterClass
        public static void cleanDriver() {
                BasePage.closeBrowser();
        }

    @Test
    public void testLoginExitoso() {
        PaginaPrincipal pagina = new PaginaPrincipal();

        pagina.navegarSentra();
        pagina.credenciales();
        pagina.ClickIngresar();

        // Esperas que después del login, por ejemplo, aparezca un botón de cerrar sesión
        String botonLogout = "//button[@id='logout']"; // Esto es un ejemplo

        boolean estaVisible = pagina.isElementVisible(botonLogout); // Este método lo tendrías que tener en BasePage
        assertTrue("El login falló, no se encontró el botón de logout", estaVisible);
    }
}

