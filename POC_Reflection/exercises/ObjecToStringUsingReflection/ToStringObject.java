package ObjecToStringUsingReflection;

import injection.Objects;

import java.lang.reflect.Field;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public class ToStringObject {
    public static void main(String[] args) {
        System.out.println(toString(new Date()));
        System.out.println(toString(new Throwable()));
    }

    private static String toString(Object obj) {
        StringBuilder sb = new StringBuilder();
        Class<?> theClass = obj.getClass();

        String className = theClass.getSimpleName();
        sb.append("Class: ").append(className).append("\n");

        for (Field f : theClass.getDeclaredFields()) {
            if (!Modifier.isStatic(f.getModifiers())) {
                String name = f.getName();
                try {
                    f.setAccessible(true);
                    sb.append("\t").append(name).append(": ").append(f.get(obj));
                } catch (IllegalAccessException | InaccessibleObjectException e) {
                    sb.append("\t").append(name).append(": <undefined>\n");
                }
            }
        }
        return sb.toString();
    }
}

