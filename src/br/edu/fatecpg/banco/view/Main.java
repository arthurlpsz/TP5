package br.edu.fatecpg.banco.view;
import br.edu.fatecpg.banco.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Nome do titular da conta:");
        String titular = ler.nextLine();
        ContaBancaria contabancaria = new ContaBancaria(titular);
        System.out.println("Escolha uma opção:\n 1 - Depositar \n 2 - Sacar \n 3 - Ver saldo");
        int op = ler.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite o valor para ser depositado: ");
                double depositovalor = ler.nextDouble();
                contabancaria.depositar(depositovalor);
                break;
            
            case 2: 
            System.out.println("Digite o valor para ser sacado: ");
            double saquevalor = ler.nextDouble();
            contabancaria.sacar(saquevalor);

            case 3: 
            System.out.println("Seu saldo atual é: "+contabancaria.getSaldo());
                break;
        }
        ler.close();
    }

}
