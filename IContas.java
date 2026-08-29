package src;

public interface IContas {
    
    public abstract double saldo();

    public abstract double depositar(double valor);

    public abstract double sacar(double valor);

}
