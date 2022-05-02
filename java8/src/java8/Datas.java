package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Datas {

	public static void main(String[] args) {

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futuro);
		
		Period periodo = Period.between(futuro, hoje);
		System.out.println(periodo);
		
//		Duration duracao = Duration.between(futuro, hoje);
//		System.out.println(duracao);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada = formatador.format(hoje);
		System.out.println(dataFormatada);
				
				
				
	
	}
}
