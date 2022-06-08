package modelo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;


/**
 * Teoria de la Computacion 
 * 2022 - I
 */
public class Automata
{
    private final List<String> simbolos;
    private List<Estado> estados;
    private boolean deterministico;
    private String proceso;
    
    //Constructor por Defecto
    public Automata(){
        this.simbolos = new ArrayList<>();
        this.estados = new ArrayList<>();
    }
    
    public Automata(String estados, String simbolos, String inicial, String terminal)
    {
         this.proceso = "PROCESO:\n\n";
        //Se inicializan los contenedores
        this.estados = new ArrayList<>();
        this.simbolos = new ArrayList<>();
        
        //Se establecen los simbolos
        this.simbolos.addAll(Arrays.asList(simbolos.split(",")));
        
        //Se crea el estado inicial
        Estado estadoInicial = new Estado(inicial.toUpperCase(), this.simbolos.size());
        estadoInicial.setInicial();
        this.estados.add(estadoInicial);
        
        //Se crea el estado terminal
        Estado estadoTerminal = new Estado(terminal.toUpperCase(), this.simbolos.size());
        estadoTerminal.setTerminal();
        this.estados.add(estadoTerminal);
                
        //Se crean los estados NO iniciales y NO terminales
        String restantes [] = estados.split(",");
        for(String i : restantes)
            if(!i.toUpperCase().equals(inicial.toUpperCase()) && !i.toUpperCase().equals(terminal.toUpperCase()))
                this.estados.add(new Estado(i.toUpperCase(), this.simbolos.size()));
        
        //Se establece por defecto como deterministico
        this.deterministico = true;        
    }   
    
    //Asigna valores a la tabla
    public void llenarTabla(String transcripcion)
    {
        if(transcripcion.isBlank()) return;
        
        String elementos [] = transcripcion.split(";");
        int cnt = 0;
        
        for(Estado i: estados){
            for(int j = 0; j<this.simbolos.size(); j++)
                i.set(j, ordenar(elementos[cnt++].toUpperCase()));            
        }
    }
    
    private String ordenar(String data)
    {
        String [] aux = data.split(",");
        //Se evalua la condicion de deterministico
        if(aux.length == 1)
            return data;
        
        this.deterministico = false;
        Arrays.sort(aux);
        String valor = aux[0];
        for(int i = 1; i<aux.length; i++)
            valor += "," + aux[i];
        
        return valor;
    }
    
    public Automata convertirToAfd(){
        if(this.isDeterministico())
            return this;
        Automata afd = this;
        List<Estado> nuevosEstados = new ArrayList<>();
        
        //Se empieza la conversion con el estado inicial
        Estado inicial = this.estados.get(0);
        Queue<String> cola = new ArrayDeque<>();
        Queue<String> historial = new ArrayDeque<>();
        
        historial.add(inicial.getNombre() + ",");
        cola.add(inicial.getNombre() + ",");
        
        while(!cola.isEmpty())
        {
            String nombre = cola.poll();
            String estadosCombinados [] = nombre.split(",");
            Estado nuevo = new Estado(getNombre(estadosCombinados), this.simbolos.size());
            List<Estado> temp = getEstados(estadosCombinados);
                       
            agregarProceso(nuevo.getNombre(), temp);
            
            for(int cnt = 0; cnt<this.simbolos.size(); cnt++){
               HashSet<String> estadosOrdenados = new HashSet<>();
                for(Estado i : temp){
                    if(i.isTerminal()) nuevo.setTerminal();
                    String [] valores = i.get(cnt).split(",");
                    estadosOrdenados.addAll(Arrays.asList(valores));
                }                
                String nuevoEstado = "", nuevoValor = "";
                for(String i : estadosOrdenados){
                    nuevoEstado += i + ",";
                    nuevoValor += i;
                }
                
                nuevo.set(cnt, nuevoValor);
                if(!historial.contains(nuevoEstado)){
                    cola.add(nuevoEstado); historial.add(nuevoEstado);
                }
            }
            nuevosEstados.add(nuevo);
        }
        nuevosEstados.get(0).setInicial();
        afd.setEstados(nuevosEstados);
        afd.deterministico = true;
        return afd; 
    }
    
    private void agregarProceso(String nombre, List<Estado> x){
        this.proceso += "Estado " + nombre + ":\n";
        x.forEach((i) -> {
            this.proceso += i.toString();
        });
        
        this.proceso += "\n";
    }
    
    private Estado getEstado(String x){
        for(Estado i : estados){
            if(i.getNombre().equals(x)){
                return i;
            }
        }
        return null;
    }
    
    public boolean existeEstado(String otro){
        return estados.stream().anyMatch((i) -> (i.getNombre().equals(otro.toUpperCase())));
    }
    
    private String getNombre(String [] data){
        String nombre = "";
        for(String i : data)
            nombre += i;
        return nombre;
    }
    
    private List<Estado> getEstados(String [] data)
    {
        List<Estado> nuevosEstados = new ArrayList<>();
        for(String i : data){
            for(Estado estado : this.estados){
                if(i.equals(estado.getNombre())){
                    nuevosEstados.add(estado); break;
                }
            }
        }
        return nuevosEstados;
    }
    
    public List<String> getSimbolos(){
        return this.simbolos;
    }
    
    public List<Estado> getEstados(){
        return this.estados;
    }

    public boolean isDeterministico() {
        return deterministico;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public String getProceso() {
        return proceso;
    }
    
    @Override
    public String toString(){
        String ans = "\t";
        ans += "Q";
        ans = simbolos.stream().map((i) -> "\t\t" + i).reduce(ans, String::concat);
        ans += "\n";
        ans = estados.stream().map((i) -> i.toString()).reduce(ans, String::concat);
        
        return ans;
    }
}