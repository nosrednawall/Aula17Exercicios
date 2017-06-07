package Exercicio2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class CriarConta {

	CriarConta() {

		
		 //apenas para numerar a saída
		int indice = 1;
		//limite de contas no for do array
		int limite = 2;
		// gera o array de conta Simples
		List<Conta> contaSimples = new ArrayList<Conta>(); 
		//formato de saída de datas
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		
		for (int i = 0; i < limite; i++) {
			// gerador de nomes aleatorios
			GeradorNomesAleatorios gerador = new GeradorNomesAleatorios();
			
			// gerador de datas
			GeradorDatasAleatorias datasAleatorias = new GeradorDatasAleatorias();
						
			// instanciando o objeto tipo conta
			Conta conta = new Conta(); 
			
			/*
			 * Abaixo adicionando valores ao objeto tipo conta, juntamente com
			 * as classes geradoras
			 */
			conta.setNome(gerador.nome);
			System.out.println("Titular: "+conta.nome);
			conta.setData(datasAleatorias.calendar);
			conta.setType("Conta Simples");
			System.out.print("Informe o valor do saldo em R$: ");
			while(sc.hasNext()){
				conta.setSaldo(sc.nextInt());
				System.out.println("\n--------------------------");
				break;
			}			
			contaSimples.add(i, conta);// adicionando o objeto ao Array
		}// fim do for e criação e alocação de objetos no array
		
		//instanciando iterator do tipo conta no array de contaSimples
		Iterator<Conta> it = contaSimples.iterator();
		//percorrendo o array através do while
		while (it.hasNext()) {
			//instanciando o objeto e alocando os dados do array nele
			Conta conta = (Conta) it.next();
			//imprimindo o objeto com seus valores
			System.out.println(conta.type+ " numero "+indice+", titular "+conta.nome+", "
			+sdf.format(conta.data.getTime())+", saldo R$"+conta.saldo+",00"); 
			indice++; //apenas para numerar
		}
	}
}