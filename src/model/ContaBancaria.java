package model;



public class ContaBancaria {
 private int numeroConta;
 private String nome;
 private double saldo;

 
 public ContaBancaria(int numeroConta, String nome, double saldo) {
     this.numeroConta = numeroConta;
     this.nome = nome;
     this.saldo = saldo;
 }


 public void realizarDeposito(double valor) {
     saldo += valor;
     System.out.println("Depósito de " + valor + " realizado com sucesso.");
     System.out.println("Saldo Atualizado: " + saldo);
     System.out.println("--------------------------------------------------------------------------");

 }


 public void realizarSaque(double valor) {
     if (valor <= saldo) {
         saldo -= valor;
         System.out.println("Saque de " + valor + " realizado com sucesso.");
         System.out.println("Saldo Atualizado: " + saldo);
         System.out.println("--------------------------------------------------------------------------");
     } else {
         System.out.println("Saldo insuficiente para realizar o saque.");
         System.out.println("Saldo Atualizado: " + saldo);
         System.out.println("--------------------------------------------------------------------------");
     }
 }


 public void exibirInformacoes() {
     System.out.println("Número da Conta: " + numeroConta);
     System.out.println("Nome do Titular: " + nome);
     System.out.println("Saldo: " + saldo);
 }
}
