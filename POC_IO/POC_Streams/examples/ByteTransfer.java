import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class ByteTransfer {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("POC_STREAMS", "src", "Examples", "out");
        //Interface AutoCloseable
        try (
                InputStream in = new ByteArrayInputStream("Training java".getBytes(StandardCharsets.UTF_8));
                OutputStream out = new FileOutputStream(path + "/out.txt");
        ) {
            IOOperations.transfer(in, out);
        }
        //Interface AutoCloseable
        try (
                InputStream in = new ByteArrayInputStream("Training java".getBytes(StandardCharsets.UTF_8));
                ByteArrayOutputStream out = new ByteArrayOutputStream(); //send to memory
        ){
            IOOperations.transfer(in, out);
            String str = out.toString(StandardCharsets.UTF_8);
            System.out.println(str);
        }
    }
}
