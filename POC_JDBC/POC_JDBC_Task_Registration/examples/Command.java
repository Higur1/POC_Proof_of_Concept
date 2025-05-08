import java.util.List;

public record Command(Action action, List<String> params) {
}
