package modelo;

import java.util.Objects;

/**
 * Teoria de la Computacion 
 * 2022 - I
 */
public class Estado 
{
    private String nombre;
    private String [] valores;
    private int size;
    private boolean terminal;
    private boolean inicial;
    
    public Estado(){}
    
    public Estado(String nombre, int size)
    {
        this.nombre = nombre;
        this.size = size;
        this.valores = new String[size];
        this.terminal = false;
        this.inicial = false;
    }
    
    public void set (int i, String data){
        this.valores[i] = data;
    }
    
    public String get (int i){
        return this.valores[i];
    }
    
    public void setValores(String[] valores) {
        this.valores = valores;
    }
    
    public String[] getValores() {
        return this.valores;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public int size(){
        return this.size;
    }
    
    public boolean isTerminal() {
        return this.terminal;
    }

    public void setTerminal() {
        this.terminal = true;
        this.inicial = false;
    }
    
    public boolean isInicial() {
        return this.inicial;
    }

    public void setInicial() {
        this.terminal = false;
        this.inicial = true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        
        if (obj == null)
            return false;
        
        if (getClass() != obj.getClass())
            return false;
        
        final Estado other = (Estado) obj;
        return this.getNombre().equals(other.getNombre());
    }
    
    @Override
    public String toString(){
        String ans = this.inicial ? "--->\t" : this.terminal ? "-- T\t" : "\t";
        
        ans += this.nombre;
        
        for(String i : valores)
            ans+="\t\t" + i;
        ans += "\n";
        
        return ans;
    }
}