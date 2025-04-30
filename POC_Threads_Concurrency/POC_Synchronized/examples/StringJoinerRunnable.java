import java.util.List;

public class StringJoinerRunnable implements Runnable{
    private final List<String> strings;
    private String result;

    public StringJoinerRunnable(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public void run() {
        result = String.join("",strings);
    }

    public String getResult() {
        return result;
    }
}
