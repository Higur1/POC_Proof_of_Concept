package reflectionAttribute;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class ConstructorsReflection {
    public static void main(String[] args) throws Exception{
        var params = Map.of(
                1, "Pedro",
                2, "Jorge",
                3, "Maria"
        );

        var constructor =  Person.class.getConstructor(int.class, String.class);

        //create objects with reflection
        params.forEach((id, name) -> {
            try {
               Person person = constructor.newInstance(id, name);
                System.out.println(person);
            } catch ( InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
