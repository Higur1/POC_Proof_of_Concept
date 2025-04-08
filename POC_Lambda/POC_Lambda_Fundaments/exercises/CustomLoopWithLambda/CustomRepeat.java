package CustomLoopWithLambda;

public class CustomRepeat {
    public static void main(String[] args) {
        loop(5, i -> System.out.println("Number " + i));
    }

    private static void loop(int n, RepeatCode repeatCode) {
        for (int i = 0; i < n; i++) {
            repeatCode.repeat(i);
        }
    }

    @FunctionalInterface
    interface RepeatCode {
        void repeat(int index);
    }
}
