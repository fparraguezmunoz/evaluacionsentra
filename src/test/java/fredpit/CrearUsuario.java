package fredpit;

public class CrearUsuario extends BasePage {
    
    private String btnCrearUser = "//*[@id=\"root\"]/div/form/div/div[3]/div/button[2]";
    private String nombre = "//*[@id=\"firstname-label\"]";
    private String apellido = "//*[@id=\"lastname-label\"]";
    private String correo = "//*[@id=\"email-label\"]";
    private String pass = "//*[@id=\"password-label\"]";
    private String repitepass = "//*[@id=\"repeat_password-label\"]";
    private String btnRegUser = "/html/body/div[2]/div[3]/div/div[2]/button[2]";


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
        write(correo, "fparraguez@sentra.cl");
        write(pass, "fparraguez01");
        write(repitepass, "fparraguez01");
    }

    public void clickNew() {
        clickElement(btnRegUser);
    }
}