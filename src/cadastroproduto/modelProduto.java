package cadastroproduto;

/**
 *
 * @author Victor
 */
public class modelProduto {
    String nome;
    String descricao;
    float precoCompra;
    int qtde;

    public modelProduto(String nome, String descricao, float precoCompra, int qtde) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoCompra = precoCompra;
        this.qtde = qtde;
    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private float getPrecoCompra() {
        return precoCompra;
    }

    private void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    private int getQtde() {
        return qtde;
    }

    private void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
    
}
