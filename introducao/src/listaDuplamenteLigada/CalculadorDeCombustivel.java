package listaDuplamenteLigada;

import java.util.Scanner;

public class CalculadorDeCombustivel {

	public static void main(String[] args) {
		String resposta = "S";
		Scanner teclado = new Scanner(System.in);
		
		while(resposta.equals("S")) {
		System.out.println("Para nos preparar-mos para a corida, primeiro precisamos saber alguns dados.");
		System.out.println("Qual o comprimento em metros da pista? ");
		int comprimentoPista = teclado.nextInt();
		System.out.println("Quantas voltas ao total terá o Grande Prêmio?");
		int voltasCorrida = teclado.nextInt();
		System.out.println("Certo, mas quantos Km/L o motor do carro faz?");
		float consumoMotor = teclado.nextFloat();
		System.out.println("Quantos reabastecimentos pretende que façamos?");
		int reabastecimentosDesejados = teclado.nextInt();

		float combustivelLitros = (voltasCorrida * comprimentoPista / 1000) / consumoMotor;
		float litrosAteReabastecimento = (combustivelLitros / reabastecimentosDesejados);

		System.out.println("Precisaremos de " + combustivelLitros + " litros de combustível para completar todo o percurso.");
		System.out.println("Porém, serão necessários apenas " + litrosAteReabastecimento + " litros para que o carro faça o reabastecimento,"
				+ " baseando-se no número de reabastecimentos desejados.");
		System.out.println("Deseja refazer o desafio? (S/N)");
		resposta = teclado.next();
		}
		System.out.println("Obrigado pela preferância, nos vêmos em breve!");
		teclado.close();
	}
}
