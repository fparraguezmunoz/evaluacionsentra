package fredpit;


public class PaginaHome extends BasePage {
 
    private String btnIngHome = "//*[@id=\"root\"]/div/div/div/ul/a[1]/div/div[2]/span";
    private String ClickCrearTarea = "//*[@id=\"root\"]/div/main/div[2]/button";
    private String titulo = "//*[@id=\"title\"]";
  //  private String descripcion = "//*[@id=\"title-label\"]";
  //  private String fecvcto = "/html/body/div[2]/div[3]/div/div[1]/div[4]/div";
    private String prioridad = "//*[@id=\"dueDate\"]";
    private String btnGrbTarea = "/html/body/div[2]/div[3]/div/div[2]/button[2]";


    public PaginaHome() {
        super(driver);
    }
 
    public void ClickIngHome() {;
        clickElement(btnIngHome);
    }

    public void ClickIngTarea() {;
        clickElement(ClickCrearTarea);
    }

    public void ingNvaTarea(){
        write(titulo, "Titulo1");
       // write(descripcion,"Descripcion");
      //  write(fecvcto,  "\"01:06:2025\" + Keys.ARROW_RIGHT + \"20:50\"");
        write(prioridad, "5");
    }

    public void ClickGrbTarea() {;
        clickElement(btnGrbTarea);
    }    
}