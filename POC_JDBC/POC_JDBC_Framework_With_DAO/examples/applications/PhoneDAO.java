package applications;

import core.DAO;
import core.DAOException;
import core.DBConn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PhoneDAO extends DAO<Phone, Integer> {
    public PhoneDAO(DBConn dbConn) {
        super(dbConn);
    }

    @Override
    public Integer insert(Phone obj) {
        try (PreparedStatement preparedStatement = dbConn.statement("INSERT INTO phones (customer_id, description, number) VALUES (?,?,?)")) {
            preparedStatement.setInt(1, obj.customerId());
            preparedStatement.setString(2, obj.description());
            preparedStatement.setString(3, obj.number());
            preparedStatement.executeUpdate();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                resultSet.next();
                return resultSet.getInt(1);
            }

        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
}
