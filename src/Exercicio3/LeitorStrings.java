package Exercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LeitorStrings {
	public static String palavra;
	private Scanner sc;

	public LeitorStrings() {
		List<String> listaStrings1 = new ArrayList<String>();
		List<String> listaStrings2 = new ArrayList<String>();
		sc = new Scanner(System.in);
		System.out.println("\tprimeira lista: ");
		while (true) {
			sc.nextLine();
			palavra = sc.next();
			if (!palavra.toUpperCase().equals("FIM")) {
				listaStrings1.add(palavra);
			}else {
				System.out.println("Achou String FIM\nSaindo");
				break;
			}
		}
		System.out.print("\n------------------------------------------\n" + "\tsegunda lista\n");
		while (true) {
			palavra = sc.next();
			if (!palavra.toUpperCase().equals("FIM")) {
				listaStrings2.add(palavra);
			}else {
				System.out.println("Achou String FIM\nSaindo");
				break;
			}
		}

		System.out.println("\n-----------------------------------------\n" + "Comparando lista 1 com lista 2: \n");
		try {
			Iterator<String> itrLista1 = listaStrings1.iterator();
			while (itrLista1.hasNext()) {
				String palavraLista1 = itrLista1.next();
				Iterator<String> itrLista2 = listaStrings2.iterator();
				while (itrLista2.hasNext()) {
					String palavraLista2 = itrLista2.next();
					if (palavraLista1.equals(palavraLista2)) {
						System.out.println(palavraLista1 + " localizado");
					}
				}
			}

		} catch (Exception e) {
			System.out.println("Loop finalizado");
		}
	}

}
