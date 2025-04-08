public class NumberProvider {
    private int n;

    public void setN(int n){
        this.n = n;
    }

    public Number provide(){
        int v = n; //transform attribute in final variable
        return () -> v; //now the value is a definition value and not a runtime value
    }

    @FunctionalInterface
    public interface Number{
        int get();
    }
}
