package steps;

import io.cucumber.java.en.*;
import fredpit.CrearUsuario;
import fredpit.PaginaHome;
import fredpit.PaginaClave;
import fredpit.PaginaPerfil;
import fredpit.PaginaPrincipal;
import fredpit.Salir;
import org.testng.asserts.SoftAssert;



public class SentraSteps {
   SoftAssert soft = new SoftAssert();
   
  //pasos para crear nuevo usuario
  CrearUsuario nuevouser = new CrearUsuario();
   
  //ingresar a la web
  @Given("Ingreso a web")
    public void web() {
      nuevouser.ingresarAweb();
    }
 
    //presionar boton crear usuario
  @When("presiono boton CREAR USUARIO")
      public void ingresaWeb0() {
        nuevouser.ClickCrear();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

      //ingresar datos usuario
  @Then("ingreso datos USUARIO")
    public void ingresoCredenciales0() {
      nuevouser.credenciales0();
        try { 
          Thread.sleep(5000);
      } catch (InterruptedException e) { 
          Thread.currentThread().interrupt(); // Restablece el estado de interrupción
          e.printStackTrace();
      }
    }
 
    //boton grabar usuario
  @Then("presiono boton GRABAR USUARIO")
    public void creaUser() {
      nuevouser.clickNew();
        try { 
          Thread.sleep(5000);
      } catch (InterruptedException e) { 
          Thread.currentThread().interrupt(); // Restablece el estado de interrupción
          e.printStackTrace();
      }
    }
  
   //validar mensaje crear usuario correctamente o erroneamente
    @Then("validar mensaje crear usuario correctamente")
    public void validaUser1() {
      nuevouser.validaCrear();
  }

    //pasos para ingresar credenciales
    PaginaPrincipal pantallaInicio = new PaginaPrincipal();
   
    //ingresar a la web de sentra
    @Given("Ingreso a url")
      public void navegar() {
          pantallaInicio.navegarSentra();
      }
   
      //validar que usuario ingrese credenciales
    @When("validar que usuario ingrese credenciales")
      public void ingresoCredenciales() {
        pantallaInicio.credenciales();
        try { 
          Thread.sleep(5000);
      } catch (InterruptedException e) { 
          Thread.currentThread().interrupt(); // Restablece el estado de interrupción
          e.printStackTrace();
      }
    }
   
    //Presiono boton INGRESAR
    @When("Presiono boton INGRESAR")
      public void ingresaWeb() {
        pantallaInicio.ClickIngresar();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

      //pasos para navegar en Home
      PaginaHome pantallaHome = new PaginaHome();
   

      //"Seleccionar boton Home"
      @Given("Seleccionar boton Home")
        public void btnHome() {
          pantallaHome.ClickIngHome();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }
       
        //Presiono boton NUEVA TAREA
      @Then("Presiono boton NUEVA TAREA")
        public void btntarea() {
          pantallaHome.ClickIngTarea();
        }

        //Ingreso nueva tarea de Home
        @Then("Ingreso nueva tarea de Home")
        public void ingresoTarea() {
          pantallaHome.ingNvaTarea();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }

        //Presiono boton CREAR TAREA
        @Then("Presiono boton CREAR TAREA")
        public void GrabarTarea() {
          pantallaHome.ClickGrbTarea();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }         


      //validar mensaje de tarea creada correctamente
        @Then("validar mensaje de tarea creada correctamente")
        public void validaUser4() {
        pantallaHome.validaCrear3();
 }
        
  
        //Presiono una tarea para editarla
        @Then("Presiono una tarea para editarla")
        public void clickenTareas() {
          pantallaHome.ClickEnTarea1();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }         

        //Presiono boton EDITAR TAREA
        @Then("Presiono boton EDITAR TAREA")
        public void clickenTarea2() {
          pantallaHome.btnEnTarea1();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }      
        
                //editar la tarea
                @Then("editar la tarea")
                public void editarTarea() {
                  pantallaHome.editLaTarea();
                    try { 
                      Thread.sleep(5000);
                  } catch (InterruptedException e) { 
                      Thread.currentThread().interrupt(); // Restablece el estado de interrupción
                      e.printStackTrace();
                  }
                }

        //Presiono MODIFICAR TAREA para guardar cambios
        @Then("Presiono MODIFICAR TAREA para guardar cambios")
        public void clickenTarea3() {
          pantallaHome.btnEnTarea2();
            try { 
              Thread.sleep(5000);
          } catch (InterruptedException e) { 
              Thread.currentThread().interrupt(); // Restablece el estado de interrupción
              e.printStackTrace();
          }
        }         

   //validar mensaje de tarea creada correctamente
   @Then("validar mensaje de tarea modificada correctamente")
   public void validaUser2() {
    pantallaHome.validaCrear2();
 }


        //pasos para actualizar datos del perfil del usuario
    PaginaPerfil pantallaPerfil = new PaginaPerfil();
   
        //boton ingreso al perfil
    @Given("Presiono el boton PERFIL")
      public void btnPerfil() {
        pantallaPerfil.ClickIngPerfil();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }
     
      //boton editar datos del usuario
    @When("Presiono el boton EDITAR DATOS USUARIO")
      public void editUsr() {
        pantallaPerfil.EditarUsuario();
      }

      //modificar datos del usuario
      @Then("Modifico los datos del usuario")
      public void modifUsr() {
        pantallaPerfil.modifUsuario();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

      //boton grabar datos del usuario
      @Then("Presiono boton GRABAR USUARIO")
      public void GrabarUser() {
        pantallaPerfil.ClickGrbUsr();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }
    
    
      //pasos para cambiar password
    PaginaClave pantallaClave = new PaginaClave();


    //boton cambiar contraseña
    @Given("Presiono el boton CAMBIAR CONTRASEÑA")
      public void cambioPass() {
        pantallaClave.ClickCamPass();
      }

      //ingrasar nueva password
      @When("Ingreso contraseña nueva")
      public void modifClave() {
        pantallaClave.ingresoClave();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

      //boton guardar contraseña
      @Then("Presiono el boton GUARDAR CONTRASEÑA")
      public void ClickGrClave() {
        pantallaClave.ClickGrClave();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
      }

      //pasos para salir de la web
      Salir pantallaSalir = new Salir();
    
      @Given("Presiono boton SALIR")
        public void SalirWeb() {
          pantallaSalir.ClickSalir();
          try { 
            Thread.sleep(5000);
        } catch (InterruptedException e) { 
            Thread.currentThread().interrupt(); // Restablece el estado de interrupción
            e.printStackTrace();
        }
        }
  

        //ejemplo para verificar
        public void Ejemplulis() {
          String palabraEsperada = "Pepe";
          String palabraEncontrada = "Papa";
   
          // Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
          // muchas cosas pequeñas a la vez.
          soft.assertEquals(palabraEsperada, palabraEncontrada);
          soft.assertTrue(palabraEncontrada.contains(palabraEsperada));
          soft.assertNotEquals(palabraEncontrada,palabraEsperada);
   
          soft.assertAll();
   
      }

      }
    