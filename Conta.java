package src;

public abstract class Conta {

    private double numero;
    private int numbank;
    private double saldo;

    public double getNumero(){
        return numero;

    }

    public int getNumbank(){
        return numbank;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumero(double numero){
        this.numero = numero;
    }

    public void setNumbank(int numbank){
        this.numbank = numbank;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
