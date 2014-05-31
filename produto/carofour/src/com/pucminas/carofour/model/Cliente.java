package com.pucminas.carofour.model;

import com.pucminas.carofour.dao.ClienteDAOImpl;

/**
 * @version 0.2
 */
public class Cliente {
	private int id;
	private String nomeCompleto;
	private String email;
	private String senha;
	private String dataNascimento;
	private char sexo;
	private String endereco;
	private String telefone;
	
	public Cliente() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSexo() {
		return (this.sexo == 'm') ? "M" : "F";
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void gravarDados() {
		new ClienteDAOImpl().save(this);
	}
        
    public static Cliente localizarCliente(int id) {
        return new ClienteDAOImpl().find(id);
    }

}
