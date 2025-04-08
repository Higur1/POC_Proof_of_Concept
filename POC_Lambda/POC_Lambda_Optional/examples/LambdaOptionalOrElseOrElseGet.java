import java.util.Optional;

public class LambdaOptionalOrElseOrElseGet {
    public static void main(String[] args) {
        //is called even if the Optional is not empty - the value is always evaluated
        String s1 = Optional.of("A").orElse(get());
        System.out.println(s1);

        //Only checks if optional is empty
        //String s2 = Optional.of("A").orElseGet(() -> get());

        //Another way - only checks if optional is empty
        String s2 = Optional.of("A").orElseGet(LambdaOptionalOrElseOrElseGet::get);
        System.out.println(s2);
    }
    private static String get(){
        System.out.println("Calling get()...");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return "B";
    }
}
