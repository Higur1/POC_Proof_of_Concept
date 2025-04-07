package anonymousInnerClass;

public class AnonymousInnerClassFood {

    public static void main(String[] args) {
        Food food = new Food();
        food.eat();

        //Anonymous class
        Food food1 = new Food(){
            @Override
            public void eat(){
                System.out.println("Eating fish");
            }
        };
        food1.eat();
    }
}
