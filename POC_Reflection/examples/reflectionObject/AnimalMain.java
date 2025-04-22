package reflectionObject;

import java.lang.reflect.InvocationTargetException;

public class AnimalMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Normal instance
        Animal a1 = new Cat();
        a1.speak();

        //Reflection
        var c= Cat.class;
        var constructor = c.getConstructor(); //NoSuchMethodException - This constructor no have parameters
        Cat cat = constructor.newInstance(); //InvocationTargetException, InstantiationException, IllegalAccessException
        cat.speak();
    }
}
