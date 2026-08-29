package src;

public class Corrente extends Conta {

    private String nomeclien;
    private String cpfclien;


    public double saldo() {
        return this.getSaldo();
    } 

    public double depositar(double valordep) {
        return valordep;
    }
    
    public double sacar(double valorsac){
        return valorsac;
    }

    public void abrirConta(){
        this.setNumbank(001);
        this.setNumero(10115);

        //Dados do cliente


        System.out.println("Seu banco é :" + this.getNumbank() +
                       "\n Sua conta corrente é: " + this.getNumero() +
                       "\n Nome do cliente: " + this.getNomeclien() +
                       "\n CPF do cliente: " + this.getCpfclien());
        
    }

    //Getters e Setters

    public String getNomeclien() {
        return nomeclien;
    }

    public void setNomeclien(String nomeclien) {
        this.nomeclien = nomeclien;
    }

    public String getCpfclien() {
        return cpfclien;
    }

    public void setCpfclien(String cpfclien) {
        this.cpfclien = cpfclien;
    }
}
