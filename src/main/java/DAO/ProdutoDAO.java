package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Produto;
import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author beatriz.silva19
 */
public class ProdutoDAO {
    
    private DbConnectionDAO dbConnection = new DbConnectionDAO();
    
    public void inserir(Produto p) throws SQLException, ClassNotFoundException{
        Connection con = dbConnection.openConnection();
        PreparedStatement stmt = null;

                stmt = con.prepareStatement("INSERT INTO produto (NOME, DESCRICAO, PRECO_COMPRA, PRECO_VENDA, QUANTIDADE, DISPONIVEL, DT_CADASTRO) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?)");
                stmt.setString(1, p.getNome());
                stmt.setString(2, p.getDescricao());
                stmt.setFloat(3, p.getPrecoCompra());
                stmt.setFloat(4, p.getPrecoVenda());
                stmt.setInt(5, p.getQuantidade());
                stmt.setBoolean(6, true);
                /* O que colocar no tipo data?
                stmt.setDate(7, p);
                */

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Salvo com sucesso");
                
                dbConnection.closeConnection(con);
    }
}
