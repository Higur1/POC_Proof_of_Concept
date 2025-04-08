import java.util.Map;
import java.util.Optional;
//Java 8 Optional
public class People {
    private final Map<Integer, String> map;

    public People(Map<Integer, String> map){
        this.map = map;
    }

    public Optional<String> getNameById(int id){
        for (var entry: map.entrySet()){
            if(entry.getKey().equals(id)){
                //return entry.getValue();
                //return Optional.of(entry.getValue()); //the value never can be null
                return Optional.ofNullable(entry.getValue());
            }
        }
        //return null;
        return Optional.empty();
    }
}
