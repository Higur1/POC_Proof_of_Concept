package staticInnerClass;

public class StaticNested {
    public static void main(String[] args) {
        Operation operation = new Operation(7,7);
        int result = operation.sum();
        operation.sum();

        //reference Outer class and Static Inner class
        Operation.Counter counter = operation.getCounter();

        System.out.println(result);
        System.out.println(counter.getValue());
    }
}
