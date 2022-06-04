package demo;

import controller.Controlador;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.Automata;
import vista.VistaPrincipal;

/**
 * Teoria de la Computacion 
 * 2022 - I
 */
public class PruebaConversor {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
        }
        
        Automata modelo = new Automata();
        VistaPrincipal vista = new VistaPrincipal();
        Controlador controlador = new Controlador(vista, modelo);
        controlador.iniciarMain();
    }
}