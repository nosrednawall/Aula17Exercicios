package Exercicio1;

import java.util.Random;


public class GeradorSaldo{
	int saldo;
	
	GeradorSaldo(){
		saldo = new Random().nextInt(10000)+0;
		return;
	}
}