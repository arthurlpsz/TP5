package br.edu.fatecpg.veiculo.view;
import br.edu.fatecpg.veiculo.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a capacidade do tanque: ");
        double capacidade = ler.nextDouble();
        carro.setCapacidadeTanque(capacidade);

        System.out.print("Digite o valor da gasolina: ");
        double valorGasolina = ler.nextDouble();

        double valorTotal = carro.calcularValorTotal(valorGasolina);

        System.out.println("O valor total para encher o tanque é: R$ " + valorTotal);
        
        ler.close();
    }
}
