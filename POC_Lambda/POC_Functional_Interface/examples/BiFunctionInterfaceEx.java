import java.util.function.BiFunction;

//Combine a elements
public class BiFunctionInterfaceEx {
    public static void main(String[] args) {
        System.out.println(combine(5,2, Integer::sum));
        System.out.println(combine(3,1, (x,y) -> x * y));
    }

    private  static int combine(int n1, int n2, BiFunction<Integer, Integer, Integer> biFunction){
        return biFunction.apply(n1, n2);
    }
}
