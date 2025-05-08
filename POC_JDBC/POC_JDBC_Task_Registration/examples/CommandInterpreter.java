import core.DAO;
import core.DAOException;

import java.util.List;
import java.util.stream.Collectors;

public class CommandInterpreter {
    private final TaskDAO dao;

    public CommandInterpreter(TaskDAO dao) {
        this.dao = dao;
    }

    public String interpret(Command command) {
        var params = command.params();
        return switch (command.action()) {
            case LIST -> list();
            case QUIT -> quit();
            case INSERT -> insert(params);
            case DELETE -> delete(params);
            case UPDATE -> update(params);
        };
    }

    private String list() {
        var tasks = dao.list();

        String tasksStr = tasks.stream().map(t -> String.format("%-4d%s", t.id(), t.description()))
                .collect(Collectors.joining("\n"));

        return String.format("%s\n\n%d task found", tasksStr, tasks.size());
    }

    private String quit() {
        System.exit(0);
        return null;
    }

    private String insert(List<String> params) {
        if (params.isEmpty()) {
            return "You must provide a description";
        }
        dao.insert(new Task(params.get(0)));

        return "Task added successfully";
    }

    private String delete(List<String> params) {
        if (params.isEmpty()) {
            return "You must provide ID";
        }
        try {
            dao.deleteById(Integer.parseInt(params.getFirst()));
        } catch (NumberFormatException e) {
            return "ID is not valid";
        } catch (DAOException e) {
            return "Task does not exists";
        }

        return "Task deleted successfully";
    }

    private String update(List<String> params) {
        if (params.size() < 2) {
            return "You must provide a Id and a description";
        }
        try{
            dao.update(new Task(Integer.parseInt(params.get(0)), params.get(1)));
        } catch (NumberFormatException e) {
            return "ID is not valid";
        } catch (DAOException e) {
            return "Task does not exists";
        }
        return "Task added successfully";
    }
}
