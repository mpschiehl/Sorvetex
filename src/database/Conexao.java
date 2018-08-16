package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Márcio Pedro Schiehl
 */
public class Conexao{
    private static final String DRIVER ="com.mysql.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://127.0.0.1/sorvetex";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
    public static Connection conectar(){
        try{
        Class.forName(DRIVER);
    
        connection =DriverManager
                .getConnection(HOST,USER,PASSWORD);
                return connection;
        }catch (ClassNotFoundException e){
                e.printStackTrace();
                }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    public static void desconectar(){
        if(connection!= null){
            try {
                connection.close();
            }
         catch(SQLException e) {
             e.printStackTrace();
         }
        }
    }

}
