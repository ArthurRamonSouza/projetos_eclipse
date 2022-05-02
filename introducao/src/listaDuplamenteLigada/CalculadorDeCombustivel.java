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
		System.out.println("Quantas voltas ao total ter� o Grande Pr�mio?");
		int voltasCorrida = teclado.nextInt();
		System.out.println("Certo, mas quantos Km/L o motor do carro faz?");
		float consumoMotor = teclado.nextFloat();
		System.out.println("Quantos reabastecimentos pretende que fa�amos?");
		int reabastecimentosDesejados = teclado.nextInt();

		float combustivelLitros = (voltasCorrida * comprimentoPista / 1000) / consumoMotor;
		float litrosAteReabastecimento = (combustivelLitros / reabastecimentosDesejados);

		System.out.println("Precisaremos de " + combustivelLitros + " litros de combust�vel para completar todo o percurso.");
		System.out.println("Por�m, ser�o necess�rios apenas " + litrosAteReabastecimento + " litros para que o carro fa�a o reabastecimento,"
				+ " baseando-se no n�mero de reabastecimentos desejados.");
		System.out.println("Deseja refazer o desafio? (S/N)");
		resposta = teclado.next();
		}
		System.out.println("Obrigado pela prefer�ncia, nos v�mos em breve!");
		teclado.close();
	}
}
