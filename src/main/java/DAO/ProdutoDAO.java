package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.Produto;
import com.sun.istack.internal.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author beatriz.silva19
 */
public class ProdutoDAO {

    private DbConnectionDAO dbConnection = new DbConnectionDAO();

    public void inserir(Produto p) throws SQLException, ClassNotFoundException {
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

    
    public List<Produto> listar() throws SQLException, ClassNotFoundException {

        Connection con = dbConnection.openConnection();
        
        PreparedStatement stmt = null;
        ResultSet resultSet = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                Produto produto = new Produto();

                produto.setNome(resultSet.getString("NOME"));
                produto.setDescricao(resultSet.getString("DESCRICAO"));
                produto.setPrecoCompra(resultSet.getFloat("PRECO_COMPRA"));
                produto.setPrecoVenda(resultSet.getFloat("PRECO_VENDA"));
                produto.setQuantidade(resultSet.getInt("QUANTIDADE"));
                //produto.setDisponivel(true);
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbConnection.closeConnection(con);
        }

        return produtos;

    }
    
    
    public void atualizar(Produto p){
        Connection con = dbConnection.openConnection();
        
        PreparedStatement stmt = null;

        /* Atualizarf método */
        try {
            stmt = con.prepareStatement("UPDATE produto SET NOME = ?, DESCRICAO = ?, PRECO_COMPRA = ?, PRECO_VENDA = ? QUANTIDADE = ?, DISPONIVEL = ? WHERE ID = ?");

            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setFloat(3, p.getPrecoCompra());
            stmt.setFloat(4, p.getPrecoVenda());
            stmt.setInt(5, p.getQuantidade());
            stmt.setBoolean(6, true);
            /* O que colocar no tipo data?
                    stmt.setDate(7, p);
             */
            stmt.setInt(8, p.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            dbConnection.closeConnection(con);
        }

    }
}
