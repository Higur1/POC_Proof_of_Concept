import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

public class MetadataTableColumns {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(MetadataTableColumns.class.getResourceAsStream("/db.properties"));

        try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            System.out.println("Connected Successfully!");
            DatabaseMetaData databaseMetaData = conn.getMetaData();

            try (ResultSet rs = databaseMetaData.getColumns(null, null, "customers", null )) {
                while (rs.next()) {
                    String columnName = rs.getString("COLUMN_NAME");
                    String columnSize =  rs.getString("COLUMN_SIZE");
                    String dataType = rs.getString("DATA_TYPE");
                    String isNullable = rs.getString("IS_NULLABLE");
                    String isAutoIncrement =  rs.getString("IS_AUTOINCREMENT");

                    System.out.format("%s, %s, %s, %s, %s\n", columnName, columnSize, dataType, isNullable, isAutoIncrement);
                }
            }
        }
    }
}
