import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class SerializingIntoFile {
    public static void main(String[] args) throws IOException {

        //is necessary class serializable or NoSerializableException
        Client client = new Client(1, "Pedro", LocalDate.of(1980, 5, 10));

        Path file = Path.of("POC_Serialization/POC_Native_API/examples/file.bin");

        //Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file))) {
            oos.writeObject(client);
        }
    }
}
