package classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String email;
	private List<Produto> itens;

	
	public Cliente() {
		
	}
	
	public Cliente(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
		this.itens= new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	public Cliente cadastrarCliente(String nome, String email) {
		
		Cliente clienteNovo = new Cliente(nome,email);
	
		return clienteNovo;
	}
	*/
	public void adicionarProduto(Produto produto) {
		itens.add(produto);
	}

	public void removerProduto(Produto produto) {
		itens.remove(produto);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}
