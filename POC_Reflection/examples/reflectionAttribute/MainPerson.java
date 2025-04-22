package reflectionAttribute;

import java.util.Arrays;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();

        //Access set attributes without constructor - only reflection
        var theClass = person.getClass();
        Arrays.stream(theClass.getDeclaredFields())
                .forEach(f -> {
                    try {
                        f.setAccessible(true); //permitted access in private attribute
                        if (f.getName().equals("id")) {
                            f.set(person, 10);
                        } else if (f.getName().equals("name")) {
                            f.set(person, "joão");
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });

        System.out.println(person);
    }
}
