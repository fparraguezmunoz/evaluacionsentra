package fredpit;


public class Salir extends BasePage {
 
    private String btnSalir = "//*[@id=\"root\"]/div/div/div/ul/div/div[2]/span";

    public Salir() {
        super(driver);
    }
 
    //boton para salir de la web
    public void ClickSalir() {;
        clickElement(btnSalir);
    }

}