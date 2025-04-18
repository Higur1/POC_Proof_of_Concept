import java.nio.file.Path;
import java.time.LocalDate;

public class SerialVersionUID {
    public static void main(String[] args) {
        Path file = Path.of("POC_Serialization/POC_Native_API/examples/file.bin");

        Client client = new Client(1, "Pedro", LocalDate.of(1980, 5, 10));
        SerializationUtils.toFile(client, file);

        Client clientRead = SerializationUtils.fromFile(file);
        System.out.println(clientRead);

    }
}
