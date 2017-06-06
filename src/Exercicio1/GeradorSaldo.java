package Exercicio1;

import java.util.Random;


public class GeradorSaldo{
	Double saldo;
	
	GeradorSaldo(){
		saldo = new Random().nextDouble();
		saldo = saldo * 1000* saldo;
		return;
	}
}