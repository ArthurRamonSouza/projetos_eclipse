package model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private int id;
	private String nome;
	private List<Produto> produtos = new ArrayList<>();;
	
	public Categoria (int id, String nome){
		this.id = id;
		this.nome = nome;
	}
	
	public List<Categoria> listaProdutos(){
		
	}
	
}
