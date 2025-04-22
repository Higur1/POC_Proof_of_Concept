package injection;

public class InjectionInitReflection {
    public static void main(String[] args) {
        Circle circle = Factory.create(Circle.class);
        circle.setRadius(10);
        System.out.println(circle.calculateSurface());

        RandomGenerator randomGenerator = Factory.create(RandomGenerator.class);

        for (int i = 0; i < 10; i++) {
            System.out.println( randomGenerator.next());
        }
    }
}
