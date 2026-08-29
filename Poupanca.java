package src;

public class Poupanca extends Conta implements IContas, ICliente {

    private String nomeclien;
    private String cpfclien;

    @Override
    public double saldo() {
        return this.getSaldo();
    }

    @Override
    public double depositar(double valor) {
        return valor;
    }

    @Override
    public double sacar(double valor) {
        return valor;
    }

    @Override
    public void abrirConta() {

        Corrente c1 = new Corrente();
        c1.setNumbank(001);
        c1.setNumero(10.115);

        // Dados do cliente
        this.nomeclien = "Cliente Poupança";
        this.cpfclien = "000.000.000-00";

        System.out.println("Seu banco é :" + this.getNumbank() +
                       "\n Sua conta corrente é: " + this.getNumero() +
                       "\n Nome do cliente: " + this.getNomeclien() +
                       "\n CPF do cliente: " + this.getCpfclien());
    }

    @Override
    public String getNomeclien() {
        return nomeclien;
    }

    @Override
    public void setNomeclien(String nomeclien) {
        this.nomeclien = nomeclien;
    }

    @Override
    public String getCpfclien() {
        return cpfclien;
    }

    @Override
    public void setCpfclien(String cpfclien) {
        this.cpfclien = cpfclien;
    }
}

