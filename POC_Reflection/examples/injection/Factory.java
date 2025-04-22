package injection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Factory {
    public static <T> T create(Class<T> theClass){
        try {
            T instance = theClass.getConstructor().newInstance();
            for (Field f : theClass.getDeclaredFields()){ //get all declared attributes
                if(!Modifier.isStatic(f.getModifiers())){ //verify static method
                    f.setAccessible(true); //Change attribute access
                    if(f.getAnnotation(Inject.class) != null){ // Verify annotation Inject
                        Method injectorMethod = Objects.class.getMethod(f.getName()); //Access class Object
                        Object valueToInject = injectorMethod.invoke(null); //call method
                        f.set(instance, valueToInject); //set method pi of Object class in Object
                    }
                }
            }

            return instance;
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
