public class LambdaNumberTransformer {
    public static void main(String[] args) {
        //transformAndPrint(n -> String.valueOf(n), 100);

        //another way
        transformAndPrint(String::valueOf, 100);
    }
    private static void transformAndPrint(NumberTransformer numberTransformer, int number ){
        System.out.println(numberTransformer.transformer(number));
    }
}
