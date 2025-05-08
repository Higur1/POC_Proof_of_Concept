import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Random;

public class BatchInsert {
    public static void main(String[] args) throws Exception{
        Random random = new Random();
        Properties props = new Properties();
        props.load(BatchInsert.class.getResourceAsStream("/db.properties"));

        try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            conn.setAutoCommit(false); //with transaction
            try (PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO customers (name, email, age) VALUES (?,?,?)")) {
                for (int i = 0; i <= 100; i++) {
                    preparedStatement.setString(1, String.format("Customer %03d", i));
                    preparedStatement.setString(2, String.format("c%03d@gmail.com", i));
                    preparedStatement.setInt(3, random.nextInt(10, 80));
                    preparedStatement.addBatch();
                }
                preparedStatement.executeBatch();
                conn.commit();
            }
        }
    }
}
