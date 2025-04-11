package fredpit;

import org.testng.asserts.SoftAssert;

public class PaginaHome extends BasePage {
 
    private String btnIngHome = "//span[normalize-space()='Home']";
    private String ClickCrearTarea = "//button[normalize-space()='Nueva Tarea']";
    private String titulo = "//input[@id='title']";
    private String descripcion = "//textarea[@id='title']";                          
   // private String fecvcto = "//input[@value='2025-04-10T16:11:53']";
    private String prioridad = "//input[@type='number']";
    private String btnGrbTarea = "//button[normalize-space()='Crear Tarea']";
    private String btnEnTarea1 = "//tbody/a[2]/td[2]";
    private String btnEnTarea2 = "//button[normalize-space()='Editar Tarea']";
    private String btnEnTarea3 = "//button[normalize-space()='Modificar Tarea']";
    private String validaCrear2 = "//div[@class='MuiAlert-message css-1xsto0d']";
    private String validaCrear3 = "//div[@class='MuiAlert-message css-1xsto0d']";
    SoftAssert revisa = new SoftAssert();


    public PaginaHome() {
        super(driver);
    }
 
    //funcion boton ingresar a Home
    public void ClickIngHome() {;
        clickElement(btnIngHome);
    }

    //boton crear nueva tarea
    public void ClickIngTarea() {;
        clickElement(ClickCrearTarea);
    }

    //llenar datos de tarea nueva
    public void ingNvaTarea(){
        
        write(titulo, "Nuevo Titulo");
        write(descripcion,"Nueva descripcion");
        write(prioridad, "2");
    }

    //boton grabar nueva tarea
    public void ClickGrbTarea() {;
        clickElement(btnGrbTarea);
    }  
    

        // valida mensaje de creacion de usuario correcta
    public void validaCrear3() {
        revisa.assertEquals("Tarea creada correctamente",obtenerTexto(validaCrear3));
        revisa.assertAll();
    }  
   
    public void ClickEnTarea1() {;
        clickElement(btnEnTarea1);
    }  
    
    public void btnEnTarea1() {;
        clickElement(btnEnTarea2);
    }  
  
    

        //llenar datos de tarea editada
        public void editLaTarea(){       
            write(titulo, "");
            write(descripcion,"");
            write(prioridad, "");
        }
    

        public void btnEnTarea2() {;
            clickElement(btnEnTarea3);
        }  

            // valida mensaje de modificacion de usuario correcta
    public void validaCrear2() {
        revisa.assertEquals("Tarea modificada malo",obtenerTexto(validaCrear2));
        revisa.assertAll();
    }       
}