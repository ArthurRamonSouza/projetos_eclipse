package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException /*FileNotFoundException*/ {
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		PrintStream ps = new PrintStream("loremCopia.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println();
		ps.print("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
		
		ps.close();
		br.close();
		
	}

}
