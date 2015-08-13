package nooradiana.skripsi.app.ticketapp.backend.helper;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class KoneksiDatabase {
    
    private static Connection connection;
    
    public static DataSource getMysqlDataSource(){
        MysqlDataSource mysqlDataSource = null;
        try {
            mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setURL("jdbc:mysql://localhost/skripsidb");
            mysqlDataSource.setUser("root");
            mysqlDataSource.setPassword("Password123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return mysqlDataSource;
    }

    public static Connection getConnection() {
        try {
            if(connection.isClosed()){
                connection = getMysqlDataSource().getConnection();
            }            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        return connection;
    }
}
