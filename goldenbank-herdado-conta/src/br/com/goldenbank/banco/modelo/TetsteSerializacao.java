package br.com.goldenbank.banco.modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TetsteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Cliente cliente = new Cliente();
		cliente.setCpf("010.646.644-58");
		cliente.setNome("Shana"); 
		cliente.setProfissao("Gerente");
		
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.setTitular(cliente);
		cc.deposita(10000);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente ccInput = (ContaCorrente) ois.readObject();
		ois.close();
		System.out.println(ccInput.getSaldo() + ", " + cliente.getCpf());
		
	}

}
