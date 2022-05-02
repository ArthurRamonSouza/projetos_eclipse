package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "ç";
		System.out.println(s.codePointAt(0));

		Charset charset = Charset.defaultCharset();		
		System.out.println(charset);
		
		byte[] bytes = s.getBytes("Windows-1252");
		System.out.print(bytes.length + " Windows-1252, ");
		String sNovo = new String(bytes, "Windows-1252");
		System.out.println(sNovo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + " UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);
		
		bytes = s.getBytes("ASCII");
		System.out.print(bytes.length + " ASCII, ");
		sNovo = new String(bytes, "ASCII");
		System.out.println(sNovo);
		
		
		
		
	}

}
