import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

//transfer information with bytes
public class FileIOStream {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("POC_STREAMS", "src", "Examples", "out");

        //Good Resource for transferring data of any type. Because it uses bytes it is lighter Ex: .exe, music, pdf, word, img
        //Interface AutoCloseable
        try(FileInputStream fileInputStream = new FileInputStream(path+"/file.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(path+"/file2.txt")){
            byte[] bytes = IOOperations.read(fileInputStream);
            IOOperations.write(fileOutputStream, bytes);
        }
    }
}
