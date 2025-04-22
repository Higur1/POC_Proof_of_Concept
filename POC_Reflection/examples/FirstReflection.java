import java.util.Arrays;

public class FirstReflection {
    public static void main(String[] args) {
        Class<String> c = String.class;

        String name = c.getName();
        System.out.println("Fully qualified name: " + name);

        String classPackage = c.getPackageName();
        System.out.println("Package name: " + classPackage);

        String simplesName = c.getSimpleName();
        System.out.println("Simple name: " + simplesName);

        Class<FirstReflection> c2 = FirstReflection.class;
        System.out.println("All methods: " + (Arrays.toString(c2.getMethods())));


        String s = "abc";
        //Class<String> c3 = s.getClass(); // not possible
        Class<? extends String> c3 = s.getClass(); // need use wildcard
        System.out.println(c3);
    }
}
