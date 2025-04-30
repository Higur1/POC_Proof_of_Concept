import java.util.List;
import java.util.concurrent.Callable;

//if callable not return - use Callable<Void>
public class StringJoinerCallable implements Callable<String> {
    private final List<String> strings;

    public StringJoinerCallable(List<String> strings) {
        this.strings = strings;
    }

    @Override
    public String call() throws Exception {
        return String.join("", strings);
    }

}
