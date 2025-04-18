import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class CustomSerializer {
    public static void main(String[] args) throws JsonProcessingException {
        Range range = new Range(1, 10);
        String json = JsonUtils.mapper().writeValueAsString(range);
        System.out.println(json);
    }
    //using custom RangeSerializer
    @JsonSerialize(using = RangeSerializer.class)
    public record Range(int min, int max) {
    }

    public static class RangeSerializer extends StdSerializer<Range> {
        protected RangeSerializer(Class t) {
            super(t);
        }

        public RangeSerializer() {
            this(null);
        }

        @Override
        public void serialize(Range range, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            //{"range": "5..10"} json

            String rangeStr = String.format("%d..%d", range.min(), range.max());
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("range", rangeStr);
            jsonGenerator.writeEndObject();
        }
    }
}
