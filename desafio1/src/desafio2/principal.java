package desafio2;

import java.util.ArrayList;
import java.util.List;

public class principal {

	public static void main(String[] args) {
		List<String> resultados = new ArrayList<>();

		resultados.add("3: 1");
		resultados.add("2: 2");
		resultados.add("0: 1");
		resultados.add("1: 1");
		resultados.add("1: 3");
		resultados.add("2: 1");
		resultados.add("1: 2");
		resultados.add("1: 1");
		resultados.add("3: 1");
		resultados.add("0: 0");
		
		contagemDePontos(resultados);
	}
		public static void contagemDePontos(List<String> resultados) {
			int pontosDoTime = 0;
			sair:
			for (String string : resultados) {
				
				String[] elementos = string.split(": ");
				int x = Integer.parseInt(elementos[0]);
				int y = Integer.parseInt(elementos[1]);
				if(x > y) {
					pontosDoTime += 3;
					break sair;
				}if(x == y) {
					pontosDoTime++;
				}
			}
			System.out.println("Os pontos da equipe no campeonato são: " + pontosDoTime);
	}
}