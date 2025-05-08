import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class MultipleInserts {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(MultipleInserts.class.getResourceAsStream("/db.properties"));

        try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            try {
                conn.setAutoCommit(false);

                int customerId;

                try (PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO customers(name, email, age) VALUES (?,?,?)", RETURN_GENERATED_KEYS)) {
                    preparedStatement.setString(1, "Maria");
                    preparedStatement.setString(2, "maria@email.com");
                    preparedStatement.setInt(3, 30);
                    preparedStatement.executeUpdate();

                    try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                        resultSet.next();
                        customerId = resultSet.getInt(1);
                    }
                }
                try (PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO phones (customer_id, description, number) VALUES(?,?,?)")) {
                    preparedStatement.setInt(1, customerId);
                    preparedStatement.setString(2, "Phone");
                    preparedStatement.setString(3, "(555)123-4567");
                    preparedStatement.executeUpdate();
                }
                conn.commit();
                System.out.println("Insert Successfully!");
            } catch (Exception e) {
               conn.rollback();
               throw e;
            }
        }
    }
}
