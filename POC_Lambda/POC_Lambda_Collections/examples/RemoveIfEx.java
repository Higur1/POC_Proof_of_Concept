import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveIfEx {
    public static void main(String[] args) {
        //mutable list
        var letters = new ArrayList<>(Arrays.asList('A','B', 'C','D', 'e', 'f', 'g'));
        System.out.println(letters);

       /* //use iterator
        Iterator<Character> iterator = letters.iterator();
        while(iterator.hasNext()){
            var c = iterator.next();
            if ((Character.isLowerCase(c))){
                iterator.remove();
            }
        }
        System.out.println(letters);*/

        /*//lambda expression - Predicate Interface functional
        letters.removeIf(c -> Character.isLowerCase(c));*/

        //another way //lambda expression - Predicate Interface functional
        letters.removeIf(Character::isLowerCase);
        System.out.println(letters);
    }
}
