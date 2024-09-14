package br.edu.fatecpg.veiculo.model;
public class Carro {
    private double capacidadeTanque;
    

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public double calcularValorTotal(double valorGasolina) {
        return capacidadeTanque * valorGasolina;
    }
}

