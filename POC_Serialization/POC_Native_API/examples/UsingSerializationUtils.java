import java.nio.file.Path;
import java.time.LocalDate;

public class UsingSerializationUtils {
    public static void main(String[] args) {
        Path file = Path.of("POC_Serialization/POC_Native_API/examples/file.bin");

        Client client = new Client(19, "Maria", LocalDate.of(1980,6,1));

        SerializationUtils.toFile(client, file);

        //Don't use constructor
        Client clientRead = SerializationUtils.fromFile(file);
        System.out.println(clientRead);
    }
}
