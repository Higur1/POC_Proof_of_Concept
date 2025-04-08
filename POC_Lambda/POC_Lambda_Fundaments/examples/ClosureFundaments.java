public class ClosureFundaments {
    public static void main(String[] args) {
        int mult = 2; //is necessary final var
        //mult = 3; Variable used in lambda expression should be final or effectively final

        Operation sum = (n1, n2) -> (n1+n2) * mult;

        System.out.println(sum);


    }
}
