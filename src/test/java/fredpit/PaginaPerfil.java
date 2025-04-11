package fredpit;

import org.testng.asserts.SoftAssert;

public class PaginaPerfil extends BasePage {
 
    
    private String btnIngPerfil = "//span[normalize-space()='Perfil']";
    private String ClickEdtUsr = "//button[normalize-space()='Editar Datos Usuario']";
    private String nombre = "//input[@id='firstname']";
    private String apellido = "//input[@id='lastname']";
    private String email = "//input[@id='email']";
    private String btnGrbUser = "//button[normalize-space()='Modificar Usuario']";
    private String perfilok = "//div[@class='MuiAlert-message css-1xsto0d']";

    SoftAssert revisa = new SoftAssert();

    public PaginaPerfil() {
        super(driver);
    }

    //boton ingresar a perfil
    public void ClickIngPerfil() {;
        clickElement(btnIngPerfil);
    }

    //boton editar usuario
    public void EditarUsuario() {;
        clickElement(ClickEdtUsr);
    }

    //modificar datos del usuario
    public void modifUsuario(){ 
        clear(nombre); 
        write(nombre, "");
        clear(apellido);
        write(apellido,"");
        clear(email);
        write(email,  "");
    }

    //boton grabar usuario actualizado
    public void ClickGrbUsr() {;
        clickElement(btnGrbUser);
    } 
    
       // valida Datos de usuario modificados correctamente
       public void validaCrear5() {
        revisa.assertEquals("Datos de usuario modificados correctamente",obtenerTexto(perfilok));
        revisa.assertAll();
    } 

    

}