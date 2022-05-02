package br.com.alura.java.io.teste;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TetsteSerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente clienteOutput = new Cliente();
		clienteOutput.setCpf("010.646.644-58");
		clienteOutput.setNome("Shana"); 
		clienteOutput.setProfissao("Gerente");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
		oos.writeObject(clienteOutput);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente clienteInput = (Cliente) ois.readObject();
		ois.close();
		System.out.println(clienteInput.getCpf());
				
	}

}
