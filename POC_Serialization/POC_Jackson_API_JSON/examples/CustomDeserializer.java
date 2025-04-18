import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.File;
import java.io.IOException;

public class CustomDeserializer {
    public static void main(String[] args) throws IOException {
        Range range = JsonUtils.mapper().readValue(new File("POC_Serialization/POC_Jackson_API_JSON/examples/randomConfig.json"), Range.class);
        System.out.println(range);
    }

    //set class RangeDeserializer
    @JsonDeserialize(using = RangeDeserializer.class)
    public record Range(int min, int max) {}

    public static class RangeDeserializer extends StdDeserializer<Range> {
        //need empty constructor
        public RangeDeserializer() {
            this(null);
        }

        protected RangeDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Range deserialize(JsonParser parser, DeserializationContext context) throws IOException, JacksonException {
            //{"range": "5..10"} json

            JsonNode node = parser.getCodec().readTree(parser); //represent object
            String rangeStr = node.get("range").asText(); //access node and access associated String
            String[] tokens = rangeStr.split("\\.\\."); //delimiter
            return new Range(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        }
    }
}
