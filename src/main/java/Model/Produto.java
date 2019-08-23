/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Victor
 */
public class Produto {

    private long id;
    private String nome;
    private String descricao;
    private boolean disponivel;
    private int quantidade;
    private float precoVenda;
    private float precoCompra;
    private Categoria categoria;

    public Produto(int idProduto, String nome, String descricao, boolean disponivel,
                   int quantidade, float precoVenda, float precoCompra, Categoria categoria) {
        this.id = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.disponivel = disponivel;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.categoria = categoria;
    }

    public Produto() {
        
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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

}
