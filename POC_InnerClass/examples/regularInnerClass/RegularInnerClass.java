package regularInnerClass;

public class RegularInnerClass {
    public static void main(String[] args) {
        Operation operation = new Operation(7,8);
        int result = operation.execute();
        System.out.println(result);
    }
}
