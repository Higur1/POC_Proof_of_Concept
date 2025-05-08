import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class InsertCustomers {
    public static void main(String[] args) throws Exception{

        Properties props = new Properties();
        props.load(InsertCustomers.class.getResourceAsStream("/db.properties"));

        try ( Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            System.out.println("Connected Successfully!");

           /* try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("INSERT INTO customers (name, email, age) VALUES ('Pedro', 'pedro@email.com', '20')");
            }*/
            try (PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO customers (name, email, age) VALUES (?,?,?)")) {
                preparedStatement.setString(1, "John");
                preparedStatement.setString(2, "John@email.com");
                preparedStatement.setInt(3, 25);
                preparedStatement.executeUpdate();
            }

            System.out.println("Customer inserted!");
        }
    }
}
