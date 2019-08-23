package DAO;
import java.util.ArrayList;
import java.util.List;
import Model.Produto;

public class Mockproduto {
    

    // armazena a lista de produtos
    private static List<Produto> listaprodutos = new ArrayList<Produto>();
    //controle de quantidade de produtos
    private static int totalprodutos = 0;

    public static void inserir(Produto pro)
            throws Exception {
        //define ID para o produto atual
        pro.setId(totalprodutos++);
        listaprodutos.add(pro);

    }

    /**
     * Altera os dados do produto informado
     *
     * @param produto
     * @throws Exception
     */
    public static void atualizarproduto(Produto buscaproduto)
            throws Exception {
        if (buscaproduto != null && buscaproduto.getId() != null && !listaprodutos.isEmpty()) {

            for (Produto produtoLi : listaprodutos) {
                if (produtoLi != null && produtoLi.getId() == buscaproduto.getId()) {
                    //esse if atribui os valores do produto a ser procurado na lista (produtoProcura) para o objeto produtoLi
                    produtoLi.setNome(buscaproduto.getNome());
                    produtoLi.setSobrenome(buscaproduto.getSobrenome());
                    produtoLi.setGenero(buscaproduto.getGenero());
                    produtoLi.setDataNascimento(buscaproduto.getDataNascimento());
                    produtoLi.setRua(buscaproduto.getRua());
                    produtoLi.setBairro(buscaproduto.getBairro());
                    produtoLi.setCep(buscaproduto.getCep());
                    produtoLi.setCidade(buscaproduto.getCidade());
                    produtoLi.setComplemento(buscaproduto.getComplemento());
                    produtoLi.setCpf(buscaproduto.getCpf());
                    produtoLi.setEstado(buscaproduto.getEstado());                    
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
    public static void excluir(Integer id) throws Exception {
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
                    if (produtoLi.getNome().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(produtoLi);
                    }else if(produtoLi.getNome().toUpperCase().contains(valor.toUpperCase())){
                        listaResultado.add(produtoLi);
                    }else if(produtoLi.getDescricao().toUpperCase().contains(valor.toUpperCase())){
                        listaResultado.add(produtoLi);
                    }else if(produtoLi.getCategorias().contains(valor.toUpperCase())){
                        listaResultado.add(produtoLi);
        }

        return listaResultado;
    }

    /**
     * Obtem um produto da lista
     *
     * @param id
     * @return
     * @throws Exception
     */
    public static Produto obter(Long id)throws Exception {
        if (id != null && !listaprodutos.isEmpty()) {
            for (int i = 0; i < listaprodutos.size(); i++) {
                if (listaprodutos.get(i) != null && listaprodutos.get(i).getId() == id) {
                    return listaprodutos.get(i);
                }
            }
        }
        return null;
    }
}


    
    
    
    
    

