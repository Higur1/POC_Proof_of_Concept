package reflectionAttribute;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class listAttributesWithReflection {
    public static void main(String[] args) throws IllegalAccessException {
        Person p = new Person(3, "Maria");
        var theClass = p.getClass();


        //Arrays.stream(theClass.getDeclaredFields()); is possible
        //Another way
        for (Field f : theClass.getDeclaredFields()) {
            f.setAccessible(true);
            System.out.println("Name: "+f.getName());
            System.out.println("Type: "+f.getType().getName());
            System.out.println("Public: "+ Modifier.isPublic(f.getModifiers())); //is possible use to all access (public, private) and types
            System.out.println("Value: "+f.get(p));
            System.out.println();
        }
    }
}
