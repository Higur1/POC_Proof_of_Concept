import core.DBConn;
import core.ConnectionFactory;

public class TasksApp {
    private CommandInterpreter interpreter;
    private DBConn conn;

    public static void main(String[] args) {
        new TasksApp().start();
    }

    public void start() {
        setup();
        while (true) {
            try {
                Command command = UI.nextCommand();
                String text = interpreter.interpret(command);
                UI.show(text);
            } catch (InvalidCommandException e) {
                UI.show(e.getMessage());
            }
        }
    }

    private void setup() {
        conn = ConnectionFactory.getConnection();
        interpreter = new CommandInterpreter(new TaskDAO(conn));

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            conn.close();
            UI.show("Bye!");
        }));
    }
}
