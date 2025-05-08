package core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

public class DBConn implements AutoCloseable {
    private final Connection connection;

    public DBConn(Connection connection) {
        this.connection = connection;
    }

    public PreparedStatement statement(String sql) {
        try {
            return connection.prepareStatement(sql, RETURN_GENERATED_KEYS);
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new DAOException("Error closing connection", e);
        }
    }

    public void beginTransaction() {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    public void commitTransaction() {
        try {
            connection.commit();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    public void rollbackTransaction() {
        try {
            connection.rollback();
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }
}
