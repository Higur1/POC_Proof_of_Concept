import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class PrintWriterApp {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("POC_STREAMS", "src", "Examples", "out");
        //Interface AutoCloseable
        try(PrintWriter printWriterApp = new PrintWriter(path+"/out.txt", StandardCharsets.UTF_8)){
            printWriterApp.println("hello");
            printWriterApp.println("world");
            printWriterApp.format("number: %03d", 18);
        }
    }
}
