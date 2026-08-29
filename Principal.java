package src;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        
        //Iniciando o objeto de classe Corrente
        Corrente c1 = new Corrente();

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        c1.setNomeclien(nome);

        System.out.println("Digite seu CPF:");
        String cpf = teclado.nextLine();
        c1.setCpfclien(cpf);

        c1.abrirConta();
        
    }
}