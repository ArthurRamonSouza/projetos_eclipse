package desafio2;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int soma =0;
	    if(y > x){
	      int z = x;
	      x = y;
	      y= z;
	    }
	    int proximo = y;
	    proximo++;
	    while(proximo < x){
	      
	      if(proximo % 2 == 0){
	        proximo++;
	        
	      }else{
	        soma = soma + proximo; 
	        proximo++;
	      }
	    }
	    sc.close();
	    System.out.println(soma);
		
		
//		Scanner sc = new Scanner(System.in);
//		
//	    int n = sc.nextInt();
//	    double conta1 = Math.sqrt(5);
//	    double conta2 = Math.pow(((1 + conta1) /2), n);
//	    double conta3 = Math.pow(((1 - conta1) /2), n);
//	    double fibonacci = (conta2 - conta3) / conta1;
//
//	    System.out.format("%.1f", fibonacci);
//	    sc.close();
		
//		Scanner in = new Scanner(System.in);
//		int fatorial = in.nextInt();
//		int cont = fatorial;
//		
//		while(cont>=3) {
//			cont--;
//			fatorial *= cont;
//			System.out.println("espera");
//		}
//		in.close();
//		System.out.print(fatorial);
		
//		int num = 5, count = 1;
//        while(count <= 3) {
//            ++count;
//            num += count;
//        }
//        System.out.println(num);
		
//		Scanner sc = new Scanner(System.in);
//
//		int n, aux = 1, cont = 0;
//		n = sc.nextInt();
//
//		while (cont < n) {
//			System.out.println((aux) + " " + (aux += 1) + " " + (aux += 1) + " PUM");
//			aux += 2;
//			cont++;
//		}

//		String[][] matriz = new String[3][3];
//		matriz[0][1] = "x";
//		for (String[] strings : matriz) {
//			System.out.print(strings[0]);
//			System.out.print(strings[1]);
//			System.out.println(strings[2]);
//
//		}

	}
}
