import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class DeserializationJsonArchive {
    public static void main(String[] args) throws IOException {
        try(var in = Files.newBufferedReader(Path.of("POC_Serialization/POC_Jackson_API_JSON/examples/letters.json"))){
            //List<String> letters = JsonUtils.mapper().readValue(in, new TypeReference<>(){});
            //Array
            var letters = JsonUtils.mapper().readValue(in, String[].class);
            System.out.println(Arrays.toString(letters));
        }
    }
}
