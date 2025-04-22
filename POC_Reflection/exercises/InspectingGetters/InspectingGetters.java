package InspectingGetters;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;

public class InspectingGetters {
    public static void main(String[] args) {
       //Object obj = LocalTime.now(); //works with any class
        Object obj = new Date();

        var theClass = obj.getClass();
        Arrays.stream(theClass.getDeclaredMethods())
                .filter(m -> m.getName().startsWith("get"))
                .filter(m -> m.getParameterCount() == 0) // how many params the method receive
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        System.out.println(m.getName()+ " => " + m.invoke(obj));
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }

                });
    }
}
