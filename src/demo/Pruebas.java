package demo;

import controller.Controlador;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Automata;
import modelo.Estado;
import vista.VistaPrincipal;

/**
 * Teoria de la Computacion 
 * 2022 - I
 */
public class Pruebas{

    public static void main(String[] args) {
        Automata x = new Automata("a,b,c", "0,1,2", "a", "b");
        String transcripcion = "a;a,c;b;"
                            + "b;c;c,a;"
                            + "a,b;c;b;";
        x.llenarTabla(transcripcion);
        Automata afd = x.convertirToAfd();
        System.out.println(afd.toString());
        System.out.println(x.getProceso());
    }
}