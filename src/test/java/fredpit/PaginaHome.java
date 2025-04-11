package fredpit;

import org.testng.asserts.SoftAssert;

public class PaginaHome extends BasePage {
 
    private String btnIngHome = "//span[normalize-space()='Home']";
    private String ClickCrearTarea = "//button[normalize-space()='Nueva Tarea']";
    private String titulo = "//input[@id='title']";
    private String descripcion = "//textarea[@id='title']";                          
    private String prioridad = "//input[@type='number']";
    private String btnGrbTarea = "//button[normalize-space()='Crear Tarea']";
    private String btnEnTarea1 = "//tbody/a[2]/td[2]";
    private String btnEnTarea2 = "//button[normalize-space()='Editar Tarea']";
    private String btnEnTarea3 = "//button[normalize-space()='Modificar Tarea']";
    private String validaCrear2 = "//div[@class='MuiAlert-message css-1xsto0d']";
    private String validaCrear3 = "//div[@class='MuiAlert-message css-1xsto0d']";
    private String arriba = "//span[@class='MuiButtonBase-root MuiTableSortLabel-root Mui-active css-7fdmwy']//*[name()='svg']//*[name()='path' and contains(@d,'M20 12l-1.')]";
    private String abajo = "//span[@class='MuiButtonBase-root MuiTableSortLabel-root Mui-active css-7fdmwy']//*[name()='svg']";
    private String errorperfil1 = "//div[@class='MuiAlert-message css-1xsto0d']";


    SoftAssert revisa = new SoftAssert();


    public PaginaHome() {
        super(driver);
    }
 
    //funcion boton ingresar a Home
    public void ClickIngHome() {;
        clickElement(btnIngHome);
    }

             //ordena ascendente
             public void btnEnTarea8() {;
                clickElement(arriba);
            }  
                       
            //ordena descendente
            public void btnEnTarea9() {;
            clickElement(abajo);
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


        // Se produjo un error al obtener información de Tarea.
        public void errorperfil4() {
            revisa.assertNotEquals("Se produjo un error al obtener información de Tarea.",obtenerTexto(errorperfil1));
            revisa.assertAll();
        }  
        
        
        // Request failed with status code 400
        public void errorperfil5() {
            revisa.assertNotEquals("Request failed with status code 400",obtenerTexto(errorperfil1));
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
    public void validaCrear4() {
        revisa.assertEquals("Tarea modificada correctamente",obtenerTexto(validaCrear2));
        revisa.assertAll();

        
    }
    


}