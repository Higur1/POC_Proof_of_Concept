package applications;

import core.DAO;
import core.DAOException;
import core.DBConn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends DAO<Customer, Integer> {
    public CustomerDAO(DBConn dbConn) {
        super(dbConn);
    }

    @Override
    public Integer insert(Customer obj) {
        try (PreparedStatement preparedStatement = dbConn.statement("INSERT INTO customers (name, email, age) VALUES (?,?,?)")) {
            preparedStatement.setString(1, obj.name());
            preparedStatement.setString(2, obj.email());
            preparedStatement.setInt(3, obj.age());
            preparedStatement.executeUpdate();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {
                resultSet.next();
                return resultSet.getInt(1);
            }

        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public List<Customer> list() {
        List<Customer> customersList = new ArrayList<>();
        try (PreparedStatement preparedStatement = dbConn.statement("SELECT id, name, email, age FROM customers")) {
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    customersList.add(createCustomerObjectFromResultSet(resultSet));
                }
            }
            return customersList;
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void deleteById(Integer id) {
        try (PreparedStatement preparedStatement = dbConn.statement("DELETE FROM customers WHERE id = ?")) {
            preparedStatement.setInt(1, id);
            if (preparedStatement.executeUpdate() != 1) {
                throw new DAOException("id not found "+id);
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    public Customer createCustomerObjectFromResultSet(ResultSet resultSet) throws SQLException {

        Integer id = resultSet.getInt(1);
        String name = resultSet.getString(2);
        String email = resultSet.getString(3);
        Integer age = resultSet.getInt(4);

        return new Customer(id, name, email, age);

    }
}
