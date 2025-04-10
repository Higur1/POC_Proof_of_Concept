import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Function;

public class Buffer<T> {
    private final LinkedList<T> elements;

    public Buffer() {
        this(new LinkedList<>());
    }

    private Buffer(LinkedList<T> elements) {
        this.elements = elements;
    }

    public void add(T element) {
        elements.add(element);
    }

    public Optional<T> remove() {
        if (elements.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(elements.removeFirst());
    }

    //Defining a specific parameter <K> for the method context.
    //telling the class that there is a new parameterized type just for this method
    //Function that maps from type <T> to <K>
    public <K> Buffer<K> transform(Function<T, K> function){
        return new Buffer<>(new LinkedList<>(elements.stream().map(function).toList()));
    }
}
