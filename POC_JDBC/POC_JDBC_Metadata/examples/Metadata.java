import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

public class Metadata {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(Metadata.class.getResourceAsStream("/db.properties"));

        try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            System.out.println("Connected Successfully!");
            DatabaseMetaData databaseMetaData = conn.getMetaData();

            try (ResultSet rs = databaseMetaData.getTables(null, null, "%", new String[]{"TABLE"})) {
                while (rs.next()) {
                    String tableName = rs.getString("TABLE_NAME");
                    System.out.println(tableName);
                }
            }
        }
    }
}

