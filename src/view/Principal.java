package view;

import model.ContaBancaria;

public class Principal {

	    public static void main(String[] args) {

	        ContaBancaria conta = new ContaBancaria(546789, "Lucas R O", 10000.0);
	        conta.exibirInformacoes();

	        conta.realizarDeposito(500);
	        conta.exibirInformacoes();

	        conta.realizarSaque(200);
	        conta.exibirInformacoes();

	        conta.realizarSaque(900);
	        conta.exibirInformacoes();
	    }
	}
