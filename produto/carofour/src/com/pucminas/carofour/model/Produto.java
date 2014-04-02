package com.pucminas.carofour.model;

/**
 * @version 1.0
 */

public class Produto {
	private String nome; 
	private String descricao;
	private String enderecoImagem;
	private Double preco;
	
	public Produto(String nome, String descricao, String enderecoImagem,Double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.enderecoImagem = enderecoImagem;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getEnderecoImagem() {
		return enderecoImagem;
	}
	
	public void setEnderecoImagem(String enderecoImagem) {
		this.enderecoImagem = enderecoImagem;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco ) {
		this.preco = preco;
	}
}
