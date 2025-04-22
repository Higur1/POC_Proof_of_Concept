package reflectionObject;

import reflectionObject.reflecton.OnCreated;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Factory {
    public static Animal newAnimal(String className/*Class<? extends Animal> theClass*/) throws Exception {

        //basic mode reflection with theClass wildcard
        /*
        var constructor = theClass.getConstructor();
        Animal animal = constructor.newInstance();
        return animal;
        */

        /*another way without create animal with theClass wildcard
         var constructor = theClass.getConstructor();
        return constructor.newInstance();*/

        //Another way
        /*
        Class<?> theClass = Class.forName(className); //search for class name in runtime
        var constructor = theClass.getConstructor();
        Animal animal = (Animal) constructor.newInstance();
        return animal;
        */

        //Another way without create animal, only cast - String className
        /*

        Class<?> theClass = Class.forName(className); //search for class name in runtime
        var constructor = theClass.getConstructor();
        return (Animal) constructor.newInstance();
        */


        //Access method - String className
        Class<?> theClass = Class.forName(className);
        var constructor = theClass.getConstructor();
        Animal animal = (Animal) constructor.newInstance();
        try {
            Method afterConstructorMethod = theClass.getMethod("afterConstructor");
            afterConstructorMethod.invoke(animal);
        } catch (NoSuchMethodException e) {
        }

        //theClass.getMethods()//search for all methods including inherited ones
        Arrays
                .stream(theClass.getDeclaredMethods()) //search only for methods declared in the class
                .forEach(m -> {
                    if (m.getAnnotation(OnCreated.class) != null){
                        try {
                            m.setAccessible(true); //change visibility from private to public in this method
                            m.invoke(animal);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }
                    }
                });

        return animal;
    }
}
