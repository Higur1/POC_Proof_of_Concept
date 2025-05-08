import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateCustomers {
    public static void main(String[] args) throws Exception{
        Properties props = new Properties();
        props.load(DeleteCustomers.class.getResourceAsStream("/db.properties"));

        try ( Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            System.out.println("Connected Successfully!");

           /* try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("UPDATE customers SET name = 'Higor' Where id = 2");
            }*/
            try (PreparedStatement preparedStatement = conn.prepareStatement("UPDATE customers SET name = ? Where id = ?")) {
                preparedStatement.executeUpdate();
            }

            System.out.println("Customer updated!");
        }
    }
}
