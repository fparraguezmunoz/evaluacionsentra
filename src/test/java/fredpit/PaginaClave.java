package fredpit;


public class PaginaClave extends BasePage {
 
    private String btnCambClave = "//button[normalize-space()='Cambiar Contraseña']";
    private String clave = "//input[@id='password']";
    private String repiteclave = "//input[@id='repeat_password']";
    private String btngrabarclave = "/html/body/div[2]/div[3]/div/div[2]/button[2]";


    public PaginaClave() {
        super(driver);
    }
 
    public void ClickCamPass() {;
        clickElement(btnCambClave);
    }

    public void ingresoClave() {;
        clear(clave); 
        clear(repiteclave); 
        write(clave, "mayo1979");
        write(repiteclave,"mayo1979");   
    }

    public void ClickGrClave(){
        clickElement(btngrabarclave);
    }

}