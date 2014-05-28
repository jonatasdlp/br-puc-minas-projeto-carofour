package com.pucminas.carofour.model;

import com.pucminas.carofour.dao.CategoriaDAOImpl;
import com.pucminas.carofour.dao.ProdutoDAOImpl;

import java.util.List;

/**
 * @version 0.2
 */
public class Categoria {

    private int id;
    private String nome;
    private String urlImagem;
    private List<Produto> produtos;

    public Categoria() {
    	
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlImagem() {
        return this.urlImagem;
    }
    
    public void setUrlImagem(String url) {
        this.urlImagem = url;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return new ProdutoDAOImpl().listProdutosByCategoria(this.id);
    }

    public static List<Categoria> listarCategorias() {
        CategoriaDAOImpl categorias = new CategoriaDAOImpl();
        return categorias.listCategorias();
    }
    
    public static Categoria localizar(int id) {
        CategoriaDAOImpl categorias = new CategoriaDAOImpl();
        return categorias.find(id);
    }
}
