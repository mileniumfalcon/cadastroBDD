package Model;

import java.util.ArrayList;

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
    private ArrayList<Categoria> categorias = new ArrayList<Categoria>();

    public Produto(long id, String nome, String descricao, boolean disponivel,
                   int quantidade, float precoVenda, float precoCompra, ArrayList<Categoria> categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.disponivel = disponivel;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.categorias = categoria;
    }
    
    public long getId() {
        return id;
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
    
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    
    public void setCategorias(ArrayList<Categoria> categorias) {
        this.categorias = categorias;
    }

}
