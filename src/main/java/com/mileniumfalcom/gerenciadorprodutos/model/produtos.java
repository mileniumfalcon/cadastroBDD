
package model;

/**
 *
 * @author Victor
 */
public class produtos {
    final int idProduto;
    private String nome;
    private String descricao;
    private boolean flagProduto;
    private float precoVenda;
    private float precoCompra;
  
    

    public produtos(int idProduto, String nome, String descricao, boolean flagProduto, float precoVenda, float precoCompra) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.flagProduto = flagProduto;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
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

    public boolean isFlagProduto() {
        return flagProduto;
    }

    public void setFlagProduto(boolean flagProduto) {
        this.flagProduto = flagProduto;
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
    
    
    
    
}
