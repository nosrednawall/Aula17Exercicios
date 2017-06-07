package Exercicio1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerarConta {

	public GerarConta() {

		
		 //apenas para numerar a saída
		int indice = 1;
		//limite de contas no for do array
		int limite = 10;
		// gera o array de conta Simples
		List<Conta> contaSimples = new ArrayList<Conta>(); 
		//formato de saída de datas
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");

		
		for (int i = 0; i < limite; i++) {
			// gerador de nomes aleatorios
			GeradorNomesAleatorios gerador = new GeradorNomesAleatorios();
			
			// gerador de datas
			GeradorDatasAleatorias datasAleatorias = new GeradorDatasAleatorias();
			
			//método de gerar saldo aleatório
			GeradorSaldo saldoAleatorio = new GeradorSaldo();
			
			// instanciando o objeto tipo conta
			Conta conta = new Conta(); 
			
			/*
			 * Abaixo adicionando valores ao objeto tipo conta, juntamente com
			 * as classes geradoras
			 */
			conta.setNome(gerador.nome);
			conta.setData(datasAleatorias.calendar);
			conta.setType("Conta Simples");
			conta.setSaldo(saldoAleatorio.saldo);
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