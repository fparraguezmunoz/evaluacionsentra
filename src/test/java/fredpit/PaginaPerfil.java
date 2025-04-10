package fredpit;


public class PaginaPerfil extends BasePage {
 
    private String btnIngPerfil = "//*[@id=\"root\"]/div/div/div/ul/a[2]/div";
    private String ClickEdtUsr = "//*[@id=\"root\"]/div/main/div[2]/button[1]";
    private String nombre = "//*[@id=\"firstname\"]";
    private String apellido = "//*[@id=\"lastname\"]";
    private String email = "//*[@id=\"email\"]";
    private String btnGrbUser = "/html/body/div[2]/div[3]/div/div[2]/button[2]";


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