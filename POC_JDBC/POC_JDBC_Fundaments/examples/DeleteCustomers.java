import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class DeleteCustomers {
    public static void main(String[] args) throws Exception{

        Properties props = new Properties();
        props.load(DeleteCustomers.class.getResourceAsStream("/db.properties"));

        try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            System.out.println("Connected Successfully!");

            /*try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("DELETE FROM customers WHERE id = 1");
            }*/
            try (PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM customers WHERE id = ?")) {
                preparedStatement.executeUpdate();
            }

            System.out.println("Customer deleted!");
        }
    }
}
