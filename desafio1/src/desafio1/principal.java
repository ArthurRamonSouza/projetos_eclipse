package desafio1;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Digite o ano para saber o s�culo correspondente:");
			int ano = scanner.nextInt();
			int seculo = 0;
			
			if(ano < 0) {
				if(ano % -100 >= 1) {
					seculo = ano / -100;
					seculo ++;
					
				}else {
					seculo = ano / -100;
					
				}
				System.out.println("O s�culo correspondente ao ano " + ano + " � " + seculo + " a.c");
				
			}else {
				if(ano % 100 >= 1) {
					seculo = ano / 100;
					seculo ++;
					
				}else {
					seculo = ano / 100;
					
				}
				System.out.println("O s�culo correspondente ao ano " + ano + " � " + seculo);
			}
			
			System.out.println("Deseja digitar outro ano ?");
			System.out.println("S/N:");
			String resposta = scanner.next();
			
			if(resposta.toUpperCase().equals("N")) {
				scanner.close();
				break;
			}
		}
	}
}