package fredpit;


public class PaginaPrincipal extends BasePage {
 
    private String botonIngresar = "//button[@type='submit']";
    private String usuario = "//input[@id='email']";
    private String password = "//input[@id='password']";


    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar 
    public void navegarSentra() {
        navigateTo("http://192.168.80.43:10100/");
    }
 
    //escribir credenciales user y pass
    public void credenciales(){
        write(usuario, "fparraguezmunoz@gmail.com");
        write(password, "mayo1979");
    }

    //boton grabar credenciales
    public void ClickIngresar() {
        clickElement(botonIngresar);  
    }
}