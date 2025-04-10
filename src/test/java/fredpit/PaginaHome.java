package fredpit;


public class PaginaHome extends BasePage {
 
    private String btnIngHome = "//span[normalize-space()='Home']";
    private String ClickCrearTarea = "//button[normalize-space()='Nueva Tarea']";
    private String titulo = "//input[@id='title']";
    private String descripcion = "//textarea[@id='title']";                          
   // private String fecvcto = "//input[@value='2025-04-10T16:11:53']";
    private String prioridad = "//input[@type='number']";
    private String btnGrbTarea = "//button[normalize-space()='Crear Tarea']";


    public PaginaHome() {
        super(driver);
    }
 
    public void ClickIngHome() {;
        clickElement(btnIngHome);
    }

    public void ClickIngTarea() {;
        clickElement(ClickCrearTarea);
    }

    public void ingNvaTarea(){
        
        write(titulo, "Nuevo Titulo");
        write(descripcion,"Nueva descripcion");
     //   write(fecvcto,  "\"01:06:2025\" + Keys.ARROW_RIGHT + \"20:50\"");
        write(prioridad, "2");
    }

    public void ClickGrbTarea() {;
        clickElement(btnGrbTarea);
    }    
}