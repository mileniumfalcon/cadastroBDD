package Controller;
import Model.Produto;
import Controller.ProdutoException;
/**
 *
 * @author Victor
 */
class ValidadorProduto {
    
    
    
        



    public static void validar(Produto produto) throws ProdutoException {
        //Realização de validações de negócio
        if (produto == null) {
            throw new ProdutoException("Não foi informado um produto");
        }
        if (produto.getNome() == null || "".equals(produto.getNome())) {
            throw new ProdutoException("É necessário informar "
                    + "o nome do produto");
        }
        if (produto.getQuantidade() <= 0 || produto.getQuantidade() == 0) {
            throw new ProdutoException("É necessário informar uma "
                    + "quantidade a ser cadastrada do produto");
        }
        if (produto.getPrecoCompra()<= 0 || produto.getPrecoCompra()== 0) {
            throw new ProdutoException("É necessário informar o "
                    + "valor do produto");
        }

        if (produto.getDescricao() == null || "".equals(produto.getDescricao())) {
            throw new ProdutoException("É necessário informar a "
                    + "descrição do produto");
        }
        
     
        }
     
}
    
