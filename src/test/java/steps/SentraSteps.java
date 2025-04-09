package steps;

import io.cucumber.java.en.*;
import fredpit.PaginaPrincipal;
 
public class SentraSteps {
 
   
    PaginaPrincipal landingPage = new PaginaPrincipal();
   
    @Given("Ingreso a url")
      public void navegar() {
          landingPage.navegarSentra();
      }
   
    @When("Ingreso credenciales")
      public void ingresoCredenciales() {
          landingPage.credenciales();
      }
   
    @When("Presiono boton INGRESAR")
      public void ingresaWeb() {
          landingPage.ClickIngresar();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }
        
      


      
    }
    /*
    


    @Then("presiono boton CREAR USUARIO")
    public void LoginPage() {
    }
/
    @Then("presiono boton REGISTRAR USUARIO")
    public void LoginPage() {
    }

    @Then("presiono boton CREAR USUARIO")
    public void LoginPage() {
    }

    @Then("Presiono boton CANCELAR")
    public void LoginPage() {
    }



    @Given("Presiono el boton HOME")
    public void LoginPage() {
    }

    @Then("Presiono boton NUEVA TAREA")
    public void LoginPage() {
    }

    @Then("Ingreso los datos de nueva tarea")
    public void LoginPage() {
    }

    @Then("Presiono boton CREAR TAREA")
    public void LoginPage() {
    }

    @Then("Presiono boton NUEVA TAREA")
    public void LoginPage() {
    }

    @Then("Presiono boton CANCELAR")
    public void LoginPage() {
    }




    @Given("Presiono el boton PERFIL")
    public void LoginPage() {
    }

    @Then("Presiono el boton EDITAR DATOS USUARIO")
    public void LoginPage() {
    }

    @Then("Modifico los datos del usuario")
    public void LoginPage() {
    }

    @Then("Presiono boton MODIFICAR USUARIO")
    public void LoginPage() {
    }

    @Then("Presiono el boton Editar datos usuario")
    public void LoginPage() {
    }

    @Then("Presiono boton CANCELAR")
    public void LoginPage() {
    }

    @Then("Presiono el boton CAMBIAR CONTRASEÑA")
    public void LoginPage() {
    }

    @Then("Ingreso contraseña nueva")
    public void LoginPage() {
    }

    @Then("Presiono boton CAMBIAR CONTRASEÑA")
    public void LoginPage() {
    }

    @Then("Presiono el boton CAMBIAR CONTRASEÑA")
    public void LoginPage() {
    }

    @Then("Presiono boton CANCELAR")
    public void LoginPage() {
    }


    @Given("Presiono boton SALIR")
    public void LoginPage() {
    }

    @Then("Redirecciona al inicio del sitio web")
    public void LoginPage() {
    }

    @Then("Limpia credenciales")
    public void LoginPage() {
    }

}
  */  
