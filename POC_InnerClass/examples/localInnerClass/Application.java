package localInnerClass;

public class Application {
    private final String message = "hi";
    public void gret(String name){
        //name = name.toUpperCase(); //it is not possible to use name because its value is being changed
        String upperName = name.toUpperCase(); //it is possible because the upperName variable is immutable
        // Local Inner class
        class Greeter {
            public void sayHi(){
                System.out.format("%s, %s", message, upperName);
            }
        }
        Greeter greeter = new Greeter();
        greeter.sayHi();
    }
}
