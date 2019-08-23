package DAO;

import java.util.ArrayList;
import java.util.List;
import Model.Produto;
import java.math.BigInteger;

public class Mockproduto {

    // armazena a lista de produtos
    private static List<Produto> listaprodutos = new ArrayList<Produto>();
    //controle de quantidade de produtos
    private static BigInteger totalprodutos;

    public static void inserir(Produto pro)
            throws Exception {
        //define ID para o produto atual
        pro.setId(totalprodutos.add(totalprodutos));
        listaprodutos.add(pro);

    }

    /**
     * Altera os dados do produto informado
     *
     * @param produto
     * @throws Exception
     */
    public static void atualizarProduto(Produto buscaproduto) throws Exception {

        if (buscaproduto != null && buscaproduto.getId() != null && !listaprodutos.isEmpty()) //&& buscaproduto.getId() != null && !listaprodutos.isEmpty()
        {

            for (Produto produtoLi : listaprodutos) {
                if (produtoLi != null && produtoLi.getId() == buscaproduto.getId()) {
                    //esse if atribui os valores do produto a ser procurado na lista (produtoProcura) para o objeto produtoLi
                    produtoLi.setNome(buscaproduto.getNome());
                    produtoLi.setCategorias(buscaproduto.getCategorias());
                    produtoLi.setDescricao(buscaproduto.getDescricao());
                    produtoLi.setDisponivel(buscaproduto.getDisponivel());
                    produtoLi.setPrecoCompra(buscaproduto.getPrecoCompra());
                    produtoLi.setPrecoVenda(buscaproduto.getPrecoVenda());
                    produtoLi.setQuantidade(buscaproduto.getQuantidade());

                    break;
                }
            }
        }
    }

    /**
     * Realiza A exclusão de um produto
     *
     * @param id
     * @throws Exception
     */
    public static void excluir(BigInteger id) throws Exception {
        if (id != null && !listaprodutos.isEmpty()) {

            for (int i = 0; i < listaprodutos.size(); i++) {

                Produto cli = listaprodutos.get(i);
                // Compara o objeto cli com o id do produto existente na lista quando encontrado exclui o mesmo
                if (cli != null && cli.getId() == id) {
                    listaprodutos.remove(i);
                    break;
                }
            }
        }
    }

    /**
     * lista todos os produtos presentes na lista
     *
     * @return
     * @throws Exception
     */
    public static List<Produto> listar()
            throws Exception {
        //Retorna a lista de produtos
        return listaprodutos;
    }

    /**
     * busca um produto pelo nome informado ou sobrenome
     *
     * @param nome
     * @return
     * @throws Exception
     */
    public static List<Produto> procurar(String valor)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();

        if (valor != null && !listaprodutos.isEmpty()) {
            for (Produto produtoLi : listaprodutos) {
                if (produtoLi != null && produtoLi.getNome() != null) {
                    if (produtoLi.getNome().toUpperCase().contains(valor.toUpperCase().trim())) {
                        listaResultado.add(produtoLi);
                    }

                    return listaResultado;
                }

            }
        }
        return null;

    }
}
