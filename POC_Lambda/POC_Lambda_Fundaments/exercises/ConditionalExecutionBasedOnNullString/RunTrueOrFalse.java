package ConditionalExecutionBasedOnNullString;

public class RunTrueOrFalse {
    public static void main(String[] args) {
        run(null, s -> System.out.println("My language is " + s),
                () -> System.out.println("My language is none"));
    }

    private static void run(String s, CodeWithParam codeIfNotNull, CodeWithoutParam codeIfNull) {
        if (s != null) {
            codeIfNotNull.execute(s);
        }else{
            codeIfNull.execute();
        }
    }

    @FunctionalInterface
    interface CodeWithParam {
        void execute(String s);
    }

    @FunctionalInterface
    interface CodeWithoutParam {
        void execute();
    }
}
