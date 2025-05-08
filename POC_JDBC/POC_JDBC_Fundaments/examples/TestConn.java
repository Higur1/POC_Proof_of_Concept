import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestConn {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(DeleteCustomers.class.getResourceAsStream("/db.properties"));

        Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"));
        System.out.println("Connected successfully!");
        conn.close();
    }
}
