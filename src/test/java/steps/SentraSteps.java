package steps;

import io.cucumber.java.en.*;
//import fredpit.CrearUsuario;
import fredpit.PaginaHome;
import fredpit.PaginaClave;
import fredpit.PaginaPerfil;
import fredpit.PaginaPrincipal;
import fredpit.Salir;
 
public class SentraSteps {
 
   
  /*CrearUsuario landingPage = new CrearUsuario();
   
  @Given("Ingreso a web")
    public void web() {
        landingPage.ingresarAweb();
    }
 
  @When("presiono boton CREAR USUARIO")
      public void ingresaWeb0() {
          landingPage.ClickCrear();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

  @Then("ingreso datos USUARIO")
    public void ingresoCredenciales0() {
        landingPage.credenciales0();
    }
 
  @Then("Then presiono boton GRABAR USUARIO")
    public void creaUser() {
        landingPage.clickNew();
        try { 
          Thread.sleep(5000);
      } catch (InterruptedException e) { 
          Thread.currentThread().interrupt(); // Restablece el estado de interrupción
          e.printStackTrace();
      }
    }
      */
    
    PaginaPrincipal landingPage1 = new PaginaPrincipal();
   
    @Given("Ingreso a url")
      public void navegar() {
          landingPage1.navegarSentra();
      }
   
    @When("Ingreso credenciales")
      public void ingresoCredenciales() {
        landingPage1.credenciales();
      }
   
    @When("Presiono boton INGRESAR")
      public void ingresaWeb() {
          landingPage1.ClickIngresar();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }
      
      PaginaHome landingPage2 = new PaginaHome();
   

      @Given("Seleccionar boton Home")
        public void btnHome() {
            landingPage2.ClickIngHome();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }
       
      @Then("Presiono boton NUEVA TAREA")
        public void btntarea() {
            landingPage2.ClickIngTarea();
        }

        @Then("Ingreso nueva tarea de Home")
        public void ingresoTarea() {
            landingPage2.ingNvaTarea();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }

        @Then("Presiono boton CREAR TAREA")
        public void GrabarTarea() {
            landingPage2.ClickGrbTarea();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }         
  
  

    PaginaPerfil landingPage3 = new PaginaPerfil();
   

    @Given("Presiono el boton PERFIL")
      public void btnPerfil() {
          landingPage3.ClickIngPerfil();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }
     
    @When("Presiono el boton EDITAR DATOS USUARIO")
      public void editUsr() {
          landingPage3.EditarUsuario();
      }

      @Then("Modifico los datos del usuario")
      public void modifUsr() {
          landingPage3.modifUsuario();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

      @Then("Presiono boton GRABAR USUARIO")
      public void GrabarUser() {
          landingPage3.ClickGrbUsr();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }
    
    

    PaginaClave landingPage4 = new PaginaClave();
    
    @Given("Presiono el boton CAMBIAR CONTRASEÑA")
      public void cambioPass() {
          landingPage4.ClickCamPass();
      }

      @When("Ingreso contraseña nueva")
      public void modifClave() {
          landingPage4.ingresoClave();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

      @Then("Presiono el boton GUARDAR CONTRASEÑA")
      public void ClickGrClave() {
          landingPage4.ClickGrClave();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

      Salir landingPage5 = new Salir();
    
      @Given("Presiono boton SALIR")
        public void SalirWeb() {
          landingPage5.ClickSalir();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        }
  
      }
    