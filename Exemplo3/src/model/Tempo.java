package model;
//@author Camila

public class Tempo {
    public int hora;
    public int minuto;
    public int segundo;
    
    @Override
    public String toString(){
        return hora+":"+minuto+":"+segundo;
    }
    
}
