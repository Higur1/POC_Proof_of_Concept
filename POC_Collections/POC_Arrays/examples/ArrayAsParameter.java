public class ArrayAsParameter {
    public static void main(String[] args) {
        int sum = sum(new int[] {5,6,7});
        System.out.println(sum);

        // no need to pass the array
        int sum2 = anotherSum(5,6,7);
        System.out.println(sum2);
    }
    //var args,
    private static int anotherSum(int... numbers){
        int sum = 0;
        for (int n: numbers){
            sum += n;
        }

        return sum;
    }
    //var args must be the last one to be received
    //private static void errorVarArgs(int... numbers, String ex){} wrong
    //private static void validVarArgs(String ex, int... numbers){} right

    private static int sum(int[] numbers){
        int sum = 0;
        for (int n: numbers){
            sum += n;
        }

        return sum;
    }


}
