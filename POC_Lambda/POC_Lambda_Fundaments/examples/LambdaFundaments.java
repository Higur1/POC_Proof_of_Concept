public class LambdaFundaments {
    public static void main(String[] args) {

        Operation sum = new Operation() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        };

        //Anonymous class
        /*Operation mult = new Operation() {
            @Override
            public int calculate(int number1, int number2) {
                return number1*number2;
            }
        };*/

        //Lambda
       /* Operation mult = (int n1, int n2) -> {
            return n1*n2;
        };*/

        //Lambda another way - When implementing an interface it is not necessary to inform the types
        Operation mult = (n1, n2) -> {
            return n1 * n2;
        };
        //Lambda another way - If the code only has the return it is possible to omit it too
        Operation div = (n1, n2) -> n1 / n2;

        //Lambda another way - expression translated as an object of an anonymous class that implements the "Operation" interface
        run((n1, n2) -> n1 / n2);


        run(mult);
        run(sum);
    }

    private static void run(Operation operation) {
        int r = operation.calculate(8, 8);
        System.out.println(r);
    }
}
