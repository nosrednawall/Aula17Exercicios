package Exercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LeitorStrings {
	public static String palavra;

	public LeitorStrings() {
		List<String> listaStrings1 = new ArrayList<String>();
		List<String> listaStrings2 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPor favor insira as palavra da primeira sequecia: ");
		int cont = 1;
		while (true) {

			palavra = sc.next();
			System.out.println("A palavra digitada foi: " + palavra + " " + cont + " vez");
			listaStrings1.add(palavra);
			cont++;
			if (palavra.toUpperCase().equals("FIM")) {
				System.out.println("Achou String FIM\nSaindo");
				cont = 0;
				break;
			}
		}
		System.out.print("\n------------------------------------------\n" + "Agora informa a segunda lista");
		while (true) {
			++cont;
			palavra = sc.next();
			System.out.println("A palavra digitada foi: " + palavra + " " + cont + " vez");
			listaStrings2.add(palavra);
			if (palavra.toUpperCase().equals("FIM")) {
				System.out.println("Achou String FIM\nSaindo");
				cont = 0;
				break;
			}
		}

		System.out.println("\n-----------------------------------------\n" + "Comparando lista 1 com lista 2: \n");
		try {

			Iterator<String> itrLista1 = listaStrings1.iterator();

			while (itrLista1.hasNext()) {
				// cont1++;
				String palavraLista1 = itrLista1.next();

				Iterator<String> itrLista2 = listaStrings2.iterator();
				while (itrLista2.hasNext()) {
					String palavraLista2 = itrLista2.next();
					// cont2++;

					if (palavraLista1.equals(palavraLista2)) {
						System.out.println("A palavra " + palavraLista1 + " foi lida anteriormente na lista1");
					}

				}
			}

		} catch (Exception e) {
			System.out.println("Loop finalizado");
		}
	}

}
