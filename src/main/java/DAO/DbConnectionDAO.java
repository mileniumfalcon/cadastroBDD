package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author erick.ogurian
 */
public class DbConnectionDAO {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String SERVER = "localhost:3306";
    private static final String DATABASE = "";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "produtobd";
    private static final String URL = "jdbc:mysql://" + SERVER + "/" + DATABASE + "?useTimezone=true&serverTimezone=UTC";

    public Connection openConnection() throws SQLException, ClassNotFoundException {
         try {
             Class.forName(DRIVER);
             Connection connection = DriverManager.getConnection(URL,LOGIN,PASSWORD);
             return connection;

         } catch(SQLException | ClassNotFoundException e) {
             return null;
         }
    }
    
    public boolean closeConnection(Connection connection) {
        try {
            connection.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}
