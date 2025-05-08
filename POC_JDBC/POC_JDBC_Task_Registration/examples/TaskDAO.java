import core.DAO;
import core.DAOException;
import core.DBConn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TaskDAO extends DAO<Task, Integer> {
    public TaskDAO(DBConn dbConn) {
        super(dbConn);
    }

    @Override
    public List<Task> list() {
        try (PreparedStatement statement = dbConn.statement("SELECT id, description FROM tasks ORDER by id")) {
            List<Task> tasks = new ArrayList<>();
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    tasks.add(extractFromResultSet(resultSet));

                }
            }
            return tasks;
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public Integer insert(Task obj) {
        try (PreparedStatement statement = dbConn.statement("INSERT INTO tasks (description) VALUES(?)")) {
            statement.setString(1, obj.description());
            statement.executeUpdate();

            try (ResultSet resultSet = statement.getGeneratedKeys()) {
                resultSet.next();
                return resultSet.getInt(1);
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void deleteById(Integer id) {
        try (PreparedStatement statement = dbConn.statement("DELETE FROM tasks WHERE id = ?")) {
            statement.setInt(1, id);
            if (statement.executeUpdate() != 1) {
                throw new DAOException("Record does not exists");
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    @Override
    public void update(Task obj) {
        try (PreparedStatement statement = dbConn.statement("UPDATE tasks SET description = ? WHERE id = ?")) {
            statement.setString(1, obj.description());
            statement.setInt(2, obj.id());
            if (statement.executeUpdate() != 1) {
                throw new DAOException("Record does not exists");
            }
        } catch (SQLException e) {
            throw new DAOException(e);
        }
    }

    private Task extractFromResultSet(ResultSet resultSet) throws SQLException {
        return new Task(resultSet.getInt("id"), resultSet.getString("description"));
    }
}
