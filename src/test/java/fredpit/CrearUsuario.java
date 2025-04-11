package fredpit;

import org.testng.asserts.SoftAssert;



public class CrearUsuario extends BasePage {
    
    //declarar
    private String btnCrearUser = "//button[normalize-space()='Crear Nuevo Usuario']";
    private String nombre = "//input[@id='firstname']";
    private String apellido = "//input[@id='lastname']";
    private String correo = "//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl css-3289sj']//input[@id='email']";
    private String pass = "//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl css-3289sj']//input[@id='password']";
    private String repitepass = "//input[@id='repeat_password']";
    private String btnRegUser = "//button[normalize-space()='Registrar Usuario']";
    private String creadoOk = "//div[@class='MuiAlert-message css-1xsto0d']";
    
    SoftAssert revisa = new SoftAssert();


    public CrearUsuario() {
        super(driver);
    }
 
    // se declara funcion  navegar web
    public void ingresarAweb() {
        navigateTo("http://192.168.80.43:10100/");
    }

    // funcion click boton crear usuario nuevo
    public void ClickCrear() {
        clickElement(btnCrearUser);
    }

    //funcion con datos del usuario a escribir
    public void credenciales0(){
        write(nombre, "Fred");
        write(apellido, "Parra");
        write(correo, "fparraguezmunoz@gmail.com");
        write(pass, "mayo1979");
        write(repitepass, "mayo1979");
    }

    //funcion click grabar usuario
    public void clickNew() {
        clickElement(btnRegUser);
    }

     
    // valida mensaje de creacion de usuario correcta
    public void validaCrear() {
        revisa.assertEquals("Usuario creado correctamente",obtenerTexto(creadoOk));
        revisa.assertAll();
    }
     

}