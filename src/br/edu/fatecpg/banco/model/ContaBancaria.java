package br.edu.fatecpg.banco.model;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular){
        this.titular = titular;
        this.saldo = 100;
    }

        public String getTitular(){
             return this.titular;
        }

        public void setTitular(String titular){
             this.titular = titular;
        }
        public double getSaldo(){
            return this.saldo;
        }

        public void setSaldo(double saldo){
            this.saldo = saldo;
        }

        public void depositar(double valor){
            if(valor > 0){
                this.saldo+=valor;
                System.out.println("Valor de R$"+valor+" depositado com sucesso!");
                System.out.println("Seu saldo atual é: "+this.saldo);
            } else{
                System.out.println("Valor Inválido, deposite outro valor");
            }
        }

        public void sacar(double valor){
            if (valor > 0){
                if(valor <= saldo)
                this.saldo -= valor;
                System.out.println("Saque de R$"+ valor + " realizado com sucesso.");
            } else{System.out.println("Saldo insuficiente para a realização do saque");}
        }
    }


