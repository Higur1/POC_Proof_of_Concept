public class ClosureNumberProvider {
    public static void main(String[] args) {
        NumberProvider numberProvider = new NumberProvider();

        numberProvider.setN(1);
        var n1 = numberProvider.provide();

        numberProvider.setN(2);
        var n2 = numberProvider.provide();

        System.out.println(n1.get()); //if no have a final value = runtime - not a definition
        System.out.println(n2.get()); //after transforming the numberProvider class attribute into final.
    }
}
