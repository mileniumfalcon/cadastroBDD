package DAO;
import java.sql.Connection;
import static DAO.DbConnectionDAO.openConnection;

/**
 *
 * @author Victor
 */
public class testeDAO {

    //Elemento para armazenamento da conexão
    private static Connection con = null;
    
    //Método de execução principal
    public static void main(String[] args) {
        //Tratamento de erros de conexão com o banco
        try {
            //Tenta obter uma conexão com o banco
            con = openConnection();
            System.out.println("Conectado!");
            
            //SEU COMANDO SQL AQUI!
            
            
        }
        catch(Exception e) {
            //Imprime erros de conexão
            e.printStackTrace();
        }
        finally {
            //Trata erros do fechamento de conexão com o banco de dados
            try {
                //Tenta fechar a conexão com o banco
                con.close();
            }
            catch(Exception e) {
                //Imprime erros de fechamento de conexão
                e.printStackTrace();
            }
        }
    }
}
    

