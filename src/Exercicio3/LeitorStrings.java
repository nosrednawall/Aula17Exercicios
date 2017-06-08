package Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorStrings {
	public static String palavra;
	public LeitorStrings() {
		List<String> listaStrings = new ArrayList<String>();

		while (palavra !="FIM") {
			Scanner sc = new Scanner(System.in);
			palavra = sc.nextLine();
			System.out.println("A palavra digitada foi"+palavra);
		}

		
		
		
	}
}
