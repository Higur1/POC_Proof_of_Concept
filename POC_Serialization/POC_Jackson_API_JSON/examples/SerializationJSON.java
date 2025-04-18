import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDate;

public class SerializationJSON {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        Client client = new Client(1,"Joao", LocalDate.of(2030,1,2), "312");
        String json = mapper.writeValueAsString(client);
        System.out.println(json);
    }
}
