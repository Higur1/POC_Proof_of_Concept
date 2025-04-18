import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Map;

public class DeserializationJson {
    public static void main(String[] args) throws JsonProcessingException {
        String json = """
                    {"min" : 5, "max": 10}
                """; //use Map structure - Key -> Value

        Range range = JsonUtils.mapper().readValue(json, Range.class);
        System.out.println(range);


        //another way using Map
        var range2 = JsonUtils.mapper().readValue(json, Map.class);//Without Range Record
        System.out.println(range2);

        //abstract class
        //var ref = new TypeReference<Map<String, Integer>>(){};

        //another way use TypeReference
        //Map<String, Integer> range3 = JsonUtils.mapper().readValue(json, new TypeReference<Map<String, Integer>>(){});

        //if use in same line is possible occult generic type
        Map<String, Integer> range3 = JsonUtils.mapper().readValue(json, new TypeReference<>(){});

        System.out.println(range3);
    }
    private record Range(int min, int max){}
}
