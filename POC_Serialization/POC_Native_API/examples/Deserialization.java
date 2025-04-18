import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Deserialization {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("POC_Serialization/POC_Native_API/examples/file.bin");

        //Deserialization - Don't use constructor of Object
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file))){
           Client client = (Client) ois.readObject();
            System.out.println(client);
        }catch (ClassNotFoundException e){
            throw new RuntimeException();
        }
    }
}
