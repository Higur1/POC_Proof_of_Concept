package SerializeAndDeserializeASetOfBooksInJSON;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

//centralize mapper creation;
public final class JsonUtils {
    private static final ObjectMapper mapper;

    //return same instance initialized first time
    static {
        mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper().enable(SerializationFeature.INDENT_OUTPUT); //global configuration to archive
        mapper().setSerializationInclusion(JsonInclude.Include.NON_NULL); //set to not show null values
        mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY); //set to all visibility attributes, not more necessary public attributes or gather methods
    }

    private JsonUtils() {
    }

    public static ObjectMapper mapper() {
        return mapper;
    }
}
