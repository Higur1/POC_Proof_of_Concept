import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class CountCostumers {

    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(CountCostumers.class.getResourceAsStream("/db.properties"));

        try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            {
                System.out.println("Connections Successfully!");
                try (PreparedStatement preparedStatement = conn.prepareStatement("SELECT COUNT(*) FROM customers")) {
                    ResultSet resultSet = preparedStatement.executeQuery();
                    resultSet.next();
                    int count = resultSet.getInt(1);
                    System.out.println(count);
                }
            }
        }
    }
}