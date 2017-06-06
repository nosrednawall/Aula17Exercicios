package Exercicio1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class GeradorDatasAleatorias {
	
	Calendar calendar;


	public GeradorDatasAleatorias() {
		
		int dia = new Random().nextInt(31) + 1;
		int mes = new Random().nextInt(12) + 1;
		int ano = new Random().nextInt(67) + 1950;
		calendar = new GregorianCalendar(ano,mes,dia);
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
		//System.out.println(sdf.format(calendar.getTime())); apenas para teste
		return;
	}
}
