package br.com.goldenbank.banco.teste;

public class TesteArray {

	public static void main(String[] args) {
		
		int[] banco = new int[10];
		banco[0] = 10;
		banco[1] = 38;
		banco[2] = 23;
		banco[3] = 44;
		banco[4] = 18;
		banco[5] = 76;
		banco[6] = 60;
		banco[7] = 22;
		banco[8] = 55;
		banco[9] = 34;
		
		System.out.println(banco.length);
		
		for(int array = 0; array < banco.length; array++ ) {
			System.out.println("Banco [" + array + "]: " + banco[array] + " <- valor." );
			
			
		}
		
		
	}

}
