package OptionalPhoneBookLookup;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    private final Map<String, String> map = new HashMap<>();

    public PhoneBook(){
        map.put("Joao", "999999999");
        map.put("Ricardo", "888888888");
        map.put("Maria", "7777777777");
    }

    public Optional<String> findByName(String name){
        return Optional.ofNullable(map.get(name));
    }
}
