import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SerializationItem {
    public static void main(String[] args) throws IOException {
        var mapper = JsonUtils.mapper();

        Item item1 = new Item(1, "A");
        Item item2 = new Item(2, "B");
        var list = List.of(item1, item2);
        //no need @Serializable
        String json =  mapper.writeValueAsString(list);

        System.out.println(json);
        try(var out = Files.newBufferedWriter(Path.of("POC_Serialization/POC_Jackson_API_JSON/examples/items.json"))){
               mapper.writeValue(out, list);
        }
    }
}
