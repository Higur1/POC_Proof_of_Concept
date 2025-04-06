import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingList {
    public static void main(String[] args) {
        var list = new ArrayList<>(List.of("A","B","C","D"));

        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }

        //Iterator
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.equals("C")){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
