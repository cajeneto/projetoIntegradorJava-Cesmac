//import java.util.Scanner;

/**
 * Main
 */
public class Main {
    
    public static void main(String[] args) {
        
        MenuController menuInicial = new MenuController(null, 0, null);
        MenuController menuIngresso = new MenuController(null, 0, null);
        menuInicial.menuInicial();
        menuIngresso.tipoIngresso();
        
        
    }

}