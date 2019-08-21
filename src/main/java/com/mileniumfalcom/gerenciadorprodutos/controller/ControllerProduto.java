package com.mileniumfalcom.gerenciadorprodutos.Controller;
import com.mileniumfalcom.gerenciadorprodutos.Exception.DataException;
import com.mileniumfalcom.gerenciadorprodutos.Exception.ProdutoException;
import java.util.List;
import java.util.List;
import com.mileniumfalcom.gerenciadorprodutos.Model.Produto;
/**
 *
 * @author Victor
 */
public class ControllerProduto {
 
   //Insere um produto na fonte de dados
    public static void cadastrarProduto(Produto produto)
            throws ProdutoException, DataException {

        //Chama o validador para verificar o produto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de inserção na fonte de dados
            DaoProduto.Inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }

    //Atualiza um produto na fonte de dados
    public static void atualizarProduto(Produto produto)
            throws ProdutoException, DataException {
        
        //Chama o validador para verificar o produto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de atualização na fonte de dados
            DaoProduto.Atualizar(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um produto por nome na fonte de dados
    public static List<Produto> procurarProduto(String nome)
            throws ProdutoException, DataException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (nome == null || "".equals(nome)) {
                return DaoProduto.listar();
            } else {
                return DaoProduto.Pesquisar(nome);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }

    //Obtem o produto com ID informado do mock
    public static Produto obterProduto(Integer id)
            throws ProdutoException, DataException {
        try {
            //Retorna o produto obtido com o DAO
            return DaoProduto.Obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }

    //Exclui o produto com ID informado do mock
    public static void excluirProduto(Integer id)
            throws ProdutoException, DataException {
        try {
            //Solicita ao DAO a exclusão do produto informado
            DaoProduto.Excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataException("Erro na fonte de dados", e);
        }
    }
}



