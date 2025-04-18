import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BirthdaySerialize {
    public static void main(String[] args) throws JsonProcessingException {
        //to serializer and deserializer is necessary public attributes or gather methods
        ObjectMapper mapper = JsonUtils.mapper();

        System.out.println("SERIALIZATION");

        Birthday birthday = new Birthday(17, 5, 1995);

        System.out.println(mapper.writeValueAsString(birthday));


        System.out.println("DESERIALIZATION");

        String str = """
                    {"day": 17, "month": 5, "year": 1995}
                """;

        System.out.println(mapper.readValue(str, Birthday.class));
    }
}
