package fredpit;

public class CrearUsuario extends BasePage {
    
    private String btnCrearUser = "//button[normalize-space()='Crear Nuevo Usuario']";
    private String nombre = "//input[@id='firstname']";
    private String apellido = "//input[@id='lastname']";
    private String correo = "//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl css-3289sj']//input[@id='email']";
    private String pass = "//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl css-3289sj']//input[@id='password']";
    private String repitepass = "//input[@id='repeat_password']";
    private String btnRegUser = "//button[normalize-space()='Registrar Usuario']";


    public CrearUsuario() {
        super(driver);
    }
 
    public void ingresarAweb() {
        navigateTo("http://192.168.80.43:10100/");
    }

    public void ClickCrear() {
        clickElement(btnCrearUser);
    }

    public void credenciales0(){
        write(nombre, "Fred");
        write(apellido, "Parra");
        write(correo, "fparraguezmunoz@gmail.com");
        write(pass, "mayo1979");
        write(repitepass, "mayo1979");
    }

    public void clickNew() {
        clickElement(btnRegUser);
    }
}