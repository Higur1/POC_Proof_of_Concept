import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class SelectCustomers {
    public static void main(String[] args) throws Exception {

        Properties props = new Properties();
        props.load(DeleteCustomers.class.getResourceAsStream("/db.properties"));

        try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            System.out.println("Connection Ok");
            try (PreparedStatement preparedStatement = conn.prepareStatement("SELECT id, name, email, age FROM customers ORDER BY name")) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        String email = resultSet.getString("email");
                        int age = resultSet.getInt("age");

                        System.out.format("ID: %d, name = %s, email = %s, age = %d\n", id, name, email, age);
                    }
                }
            }
        }
    }
}
