package fredpit;

public class PaginaPrincipal extends BasePage {
 
    private String botonIngresar = "//button[@type='submit']";
    private String usuario = "//input[@id='email']";
    private String password = "//input[@id='password']";
    private String btnCancelar = "/html/body/div[2]/div[3]/div/div[2]/button[1]";

    

    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar 
    public void navegarSentra() {
        navigateTo("http://192.168.80.43:10100/");
    }
 
    public void credenciales(){
        write(usuario, "fparraguezmunoz@gmail.com");
        write(password, "mayo1979");
    }

    public void ClickIngresar() {
        clickElement(botonIngresar);
    }

    public void ClickCancelar() {
        clickElement(btnCancelar);
    }
    
}