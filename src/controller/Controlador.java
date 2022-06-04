package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelo.*;
import vista.*;

/**
 * Teoria de la Computacion 
 * 2022 - I
 */
public class Controlador implements ActionListener
{
    private VistaPrincipal main;
    private VistaTabla tabla;
    private VistaSalida salida;
    private Automata afnd;
    
    public Controlador(VistaPrincipal main, Automata afnd){
        this.main = main;
        this.afnd = afnd;
        this.tabla = new VistaTabla();
        this.salida = new VistaSalida();
    }
    
    public void iniciarMain()
    {
        main.setTitle("Conversion de Automatas");
        main.pack();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        
        main.btnEstados.addActionListener(this);
        main.btnSimbolos.addActionListener(this);
        main.btnInicial.addActionListener(this);
        main.btnTerminal.addActionListener(this);
        main.btnCrear.addActionListener(this);
    }
    
    public void iniciarTabla(DefaultTableModel modelo)
    {
        tabla.setTitle("Conversion de Automatas");
        tabla.pack();
        tabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tabla.setLocationRelativeTo(null);
        tabla.tbTabla.setModel(modelo);
        tabla.setVisible(true);
        
        tabla.btnConvertir.addActionListener(this);
        tabla.btnVolver.addActionListener(this);
        
        main.setVisible(false);
    }
    
    public void iniciarSalida()
    {
        salida.setTitle("Conversion de Automatas");
        salida.pack();
        salida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        salida.setLocationRelativeTo(null);
        salida.txtAFD.setText(afnd.toString()+ "\n" + afnd.proceso);
        salida.setVisible(true);
        salida.btnVolver.addActionListener(this);
        
        tabla.setVisible(false);
    }
        
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        //Registro de estados
        if(main.btnEstados == e.getSource()){
            String estados = ingresarEstados();
            main.txtEstados.setText(estados.toUpperCase());
            main.btnInicial.setEnabled(true);
        }
        
        //Registro de simbolos
        if(main.btnSimbolos == e.getSource()){
            String simbolos = ingresarSimbolos();
            main.txtSimbolos.setText(simbolos.toUpperCase());
            if(!main.txtTerminal.getText().isBlank())
                main.btnCrear.setEnabled(true);
        }
        
        //Registro de estado inicial
        if(main.btnInicial == e.getSource()){
            String aux [] = main.txtEstados.getText().split(",");
            String inicial = String.valueOf(JOptionPane.showInputDialog(null,"Seleccione el estado inicial", "Estado inicial", JOptionPane.QUESTION_MESSAGE,null,aux, aux[0]));
            main.txtInicial.setText(inicial);
            main.btnTerminal.setEnabled(true);
        }
        
        //Registro de estado terminal
        if(main.btnTerminal == e.getSource()){
            String terminal = main.txtEstados.getText().replace(main.txtInicial.getText(), ",").replace(",,", "");
            String aux [] = terminal.split(",");
            terminal = String.valueOf(JOptionPane.showInputDialog(null,"Seleccione el estado terminal", "Estado terminal", JOptionPane.QUESTION_MESSAGE,null,aux, aux[0]));
            main.txtTerminal.setText(terminal);
            if(!main.txtSimbolos.getText().isBlank())
                main.btnCrear.setEnabled(true);
        }
        
        //Creacion de Automata
        if(main.btnCrear == e.getSource()){
            afnd = new Automata(main.txtEstados.getText(), main.txtSimbolos.getText(), main.txtInicial.getText(), main.txtTerminal.getText());
            List<String> columna = afnd.getSimbolos();
            List<Estado> fila = afnd.getEstados();
            
            DefaultTableModel modelo = crearModelo(columna, fila);
            iniciarTabla(modelo);            
        }
        
        if(salida.btnVolver == e.getSource()){
            main.setVisible(true);
            salida.setVisible(false);            
        }
        
        if(tabla.btnVolver == e.getSource()){
            main.setVisible(true);
            tabla.setVisible(false);            
        }
        
        if(tabla.btnConvertir == e.getSource()){
            tabla.tbTabla.clearSelection();
            String transcripcion = getTranscripcion();
            if(transcripcion == null) return;
            afnd.llenarTabla(transcripcion);
            afnd.convertirToAfd();
            iniciarSalida();
        }
    }
    
    private String ingresarEstados(){
        boolean valido = false;
        String estados = "";
        do {
            String opcionalEstados = JOptionPane.showInputDialog("Ingrese los estados separados por comas");
            if(opcionalEstados.isBlank())
                JOptionPane.showMessageDialog(null, "Ingrese un valor", "Error", JOptionPane.ERROR_MESSAGE);
            else{
                estados = opcionalEstados.replaceAll(" ", "");
                if(estados.split(",").length == 1)
                    JOptionPane.showMessageDialog(null, "Debe ingresar dos (2) estados como minimo", "Error", JOptionPane.ERROR_MESSAGE);
                else valido = true;
            }
        } while (!valido);
        
        return estados;
    }
    
    private String ingresarSimbolos(){
        boolean valido = false;
        String simbolos = "";
        do {
            simbolos = JOptionPane.showInputDialog("Ingrese los simbolos separados por comas");
            if(simbolos.isBlank())
                JOptionPane.showMessageDialog(null, "Ingrese un valor", "Error", JOptionPane.ERROR_MESSAGE);
            else valido = true;
        } while (!valido);
        
        return simbolos;
    }
    
    private DefaultTableModel crearModelo(List<String> columna, List<Estado> fila){
        DefaultTableModel modelo;
        
        int cnt = 0;
        String [] column = new String[columna.size()+1];
        column[cnt++] = "Q";
        
        for(String i: columna)
            column[cnt++] = i;
        
        String [][] data = new String [fila.size()][columna.size()];
        for(int i = 0; i<fila.size(); i++)
            data[i][0] = fila.get(i).getNombre();
        
        modelo = new DefaultTableModel(data, column){
            @Override 
            public boolean isCellEditable(int row, int column) {
                return column != 0;
            }            
        };
        
        return modelo;
    }
    
    private String getTranscripcion()
    {
        String transcripcion = "";
        for(int i = 0; i<afnd.getEstados().size(); i++){
            for(int j = 1; j<=afnd.getSimbolos().size(); j++){
                String celda = String.valueOf(tabla.tbTabla.getModel().getValueAt(i, j));
                if(celda.isBlank()){
                    JOptionPane.showMessageDialog(null, "Faltan datos", "Error", JOptionPane.ERROR_MESSAGE);
                    return null;
                }
                celda = celda.replace(" ", "");
                String aux [] = celda.split(",");
                for(String k : aux){
                    if(!afnd.existeEstado(k)){
                        JOptionPane.showMessageDialog(null, "Hay estados que no existen", "Error", JOptionPane.ERROR_MESSAGE);
                        return null;
                    }                        
                }
                transcripcion += celda.toUpperCase() + ";";
            }
        }
        return transcripcion;
    }
}