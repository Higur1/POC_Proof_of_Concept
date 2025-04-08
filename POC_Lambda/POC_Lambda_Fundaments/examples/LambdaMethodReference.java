public class LambdaMethodReference {
    public static void main(String[] args) {
        //lambda expression
        //transformAndPrint(s -> s.toUpperCase(), "java");

        //Lambda Reference
        transformAndPrint(String::toUpperCase, "java"); // only if the function has a parameter and a line and uses that parameter in the line


    }
    private static void transformAndPrint(TextTransform transform, String text){
        System.out.println(transform.transform(text));
    }
}
