import core.DBConn;

import static core.ConnectionFactory.getConnection;

public class TestDAOConn {
    public static void main(String[] args) throws Exception {
        /*Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "password");
        System.out.println("Connection successfully!");
        conn.close();*/

        /*DBConn dbConn = ConnectionFactory.getConnection();
        System.out.println("Connected successfully!");
        dbConn.close();*/

        /*try (DBConn dbConn = ConnectionFactory.getConnection()) {
            System.out.println("Connected successfully!");
        }*/

        //with static import
        try (DBConn dbConn = getConnection()) {
            System.out.println("Connected successfully!");
        }
    }
}
