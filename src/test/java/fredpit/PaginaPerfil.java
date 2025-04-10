package fredpit;


public class PaginaPerfil extends BasePage {
 
    private String btnIngPerfil = "//span[normalize-space()='Perfil']";
    private String ClickEdtUsr = "//button[normalize-space()='Editar Datos Usuario']";
    private String nombre = "//input[@id='firstname']";
    private String apellido = "//input[@id='lastname']";
    private String email = "//input[@id='email']";
    private String btnGrbUser = "//button[normalize-space()='Modificar Usuario']";


    public PaginaPerfil() {
        super(driver);
    }

    public void ClickIngPerfil() {;
        clickElement(btnIngPerfil);
    }

    public void EditarUsuario() {;
        clickElement(ClickEdtUsr);
    }

    public void modifUsuario(){     
        clear(nombre); 
        write(nombre, "");
        clear(apellido);
        write(apellido,"");
        clear(email);
        write(email,  "");
    }

    public void ClickGrbUsr() {;
        clickElement(btnGrbUser);
    }    
}