package Exercicio1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerarConta {

	public GerarConta() {

		int limite = 10;
		List<Conta> contaSimples = new ArrayList<Conta>(); // gera o array de
															// conta Simples

		for (int i = 0; i < limite; i++) {
			GeradorNomesAleatorios gerador = new GeradorNomesAleatorios();// gerador
																			// de
																			// nomes
																			// aleatorios
			GeradorDatasAleatorias datasAleatorias = new GeradorDatasAleatorias(); // gerador
																					// de
																					// datas
			GeradorSaldo saldoAleatorio = new GeradorSaldo(); // gerador de
																// saldo
																// aleatorio
			Conta conta = new Conta(); // instanciando o objeto tipo conta
			/*
			 * Abaixo adicionando valores ao objeto tipo conta, juntamente com
			 * as classes geradoras
			 */
			conta.setNome(gerador.nome);
			conta.setData(datasAleatorias.calendar);
			conta.setType("Conta Simples");
			conta.setSaldo(saldoAleatorio.saldo);
			contaSimples.add(i, conta);// adicionando o objeto ao Array
		}
		int i = 1;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		Iterator<Conta> it = contaSimples.iterator();
		while (it.hasNext()) {
			Conta conta = (Conta) it.next();
			System.out.println(conta.type+ " numero "+i+", titular "+conta.nome+"\t,\t"
			+sdf.format(conta.data.getTime())+", saldo"+conta.saldo);
			i++;
		}
	}
}