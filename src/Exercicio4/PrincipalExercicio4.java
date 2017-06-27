package Exercicio4;

//imports java
import java.util.ArrayList; //para armazenar as informacoes em um array de objetos/ou de strings
import java.util.Iterator;//para percorrer o array
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;//para ler as informacoes digitadas no teclado

public class PrincipalExercicio4 {// inicio da classe

	public static void main(String[] args) {
		List arrayNumeros = new ArrayList<>();
		List numerosOrdenados = new ArrayList<>();
		// dados = (List) new TreeMap();

		Scanner sc = new Scanner(System.in);
		System.out.println("\nInforme algum número, se não informe fim\n");
		String algo = sc.next();
		while (true) {
			if (!algo.toUpperCase().equals("FIM")) {
				int numero = Integer.parseInt(algo);
			//	System.out.println(numero);
				arrayNumeros.add(numero);
				sc.nextLine();
				algo = sc.next();
			} else {
				System.out.println("\nFinal\n");
				int aux;
				Iterator lista1 = arrayNumeros.iterator();
				while (lista1.hasNext()) {
					int valor1 = (int) lista1.next();
					ListIterator lista2 = arrayNumeros.listIterator();
					while (lista2.hasNext()) {
						int valor2 = (int) lista2.next();

						if (valor1 < valor2) {
							aux = valor1;
							numerosOrdenados.add(aux);
							break;
						} else if (valor1 > valor2) {
							aux = valor2;
							numerosOrdenados.add(aux);
							break;
						}
					}
				}
				break;
			}
		}

		Iterator listaFinal = numerosOrdenados.iterator();
		while (listaFinal.hasNext()) {
			int valorFinal = (int) listaFinal.next();
			System.out.println(valorFinal);
		}

	}
}
