//Type erasure - erase the data type information after compilation
//The compiler adds everything necessary for the code to work without the generic.
//This helps with compatibility with older code
public class HolderGenerics<T> {
    private final T obj;

    public HolderGenerics(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
