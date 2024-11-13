package model;
//@author leticia

public class ContaCorrente {
    
    public String nome;
    public String numeroConta;
    public String agencia;
    public double saldo;
    
    public void sacarValor(double valor){
        saldo -= valor;
    }
    
    public void depositarValor(double valor){
        saldo += valor;
    }
    
    public String toString(){
        return "O saldo e: " + saldo;
    }
    
}
