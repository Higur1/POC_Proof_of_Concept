package LambdaPersonCreator;

public class LambdaCreator {
    public static void main(String[] args) {
        //lambda expression
        createAndPrint(n -> new Person(n), "Jon");

        //Method reference
        createAndPrint(Person::new, "Jon");
    }
    private static void createAndPrint(LambdaPersonCreator lambdaPersonCreator, String name){
        System.out.println(lambdaPersonCreator.create(name));
    }
}
