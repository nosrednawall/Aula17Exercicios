package Exercicio1;

import java.util.Random;

public class GeradorNomesAleatorios {
	
	String nome;

	public GeradorNomesAleatorios() {
		String [] primeiroNome = {"Anderson", "José", "Maria", "Alexandre", "Jesus",
			"Moisés", "Pedro", "João", "Calíope", "Dandara","Ricardo", "Link",
			"Zelda", "Marciana", "Jurema", "Douglas","Geraldo", "Fernando", "Everton",
			"Alice", "Otávio", "Jonas"}; //05/06/2017 código conta atualmente com 22 nomes
		String [] segundoNome = {"Souza", "Inácio", "Costa", "Pereira","Silva","Carvalho",
				"Oak", "Meneguel"};
		int primeiroNomeAleatorio = new Random().nextInt(primeiroNome.length) + 0;
		int segundoNomeAleatorio = new Random().nextInt(segundoNome.length) +0;
		nome  = primeiroNome[primeiroNomeAleatorio]+ " "+segundoNome[segundoNomeAleatorio];
		return;
	}
}
