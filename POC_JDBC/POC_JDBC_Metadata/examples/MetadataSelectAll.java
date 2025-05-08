import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MetadataSelectAll {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(MetadataSelectAll.class.getResourceAsStream("/db.properties"));

        try (Connection conn = DriverManager.getConnection(props.getProperty("url"), props.getProperty("username"), props.getProperty("password"))) {
            System.out.println("Connected Successfully!");
            DatabaseMetaData databaseMetaData = conn.getMetaData();

            List<String> columns = new ArrayList<>();

            try (ResultSet rs = databaseMetaData.getColumns(null, null, "customers", null)) {
                while (rs.next()) {
                    columns.add(rs.getString("COLUMN_NAME"));
                }
            }
            try (PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM customers")) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    for (String column : columns) {
                        System.out.format("%-17s", column);
                    }
                    System.out.println();
                    while (resultSet.next()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        for (String column : columns) {
                            String value = resultSet.getString(column);
                            stringBuilder.append(String.format("%-17s", value));
                        }
                        System.out.println(stringBuilder);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
