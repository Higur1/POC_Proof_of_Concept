package core;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//final to preventing it from being inherited
public final class ConnectionFactory {
    private static final String url;
    private static final String username;
    private static final String password;

    //constructor used to disallow instances
    private ConnectionFactory(){}

    static{
        Properties props = new Properties();
        try {
            props.load(ConnectionFactory.class.getResourceAsStream("/db.properties"));
            url = props.getProperty("url");
            username = props.getProperty("username");
            password = props.getProperty("password");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static DBConn getConnection(){
        try {
            return new DBConn(DriverManager.getConnection(url, username, password));
        } catch (SQLException e) {
            throw new DAOException("Error connecting to database", e);
        }
    }
}
