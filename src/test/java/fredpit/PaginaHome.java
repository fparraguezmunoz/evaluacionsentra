package fredpit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

    //ordena por titulo
    public void btnEnTarea8() {;
        WebElement tituloHeader = driver.findElement(By.xpath("//th[.//span[contains(text(),'Título')]]"));
        tituloHeader.click();
    }  

    //ordena por prioridad
    public void btnEnTarea88() {;
        WebElement prioridadHeader = driver.findElement(By.xpath("//th[.//span[contains(text(),'Prioridad')]]"));
        prioridadHeader.click();
    }  

    //ordena por fecha creacion
    public void btnEnTarea888() {;
        WebElement fcreacionHeader = driver.findElement(By.xpath("//th[.//span[contains(text(),'Fecha Creación')]]"));
        fcreacionHeader.click();
    }  

    //ordena por fecha vencimiento
    public void btnEnTarea8888() {;
        WebElement fvencimientoHeader = driver.findElement(By.xpath("//th[.//span[contains(text(),'Fecha Vencimiento')]]"));
        fvencimientoHeader.click();
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