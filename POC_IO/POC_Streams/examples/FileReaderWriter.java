import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("POC_STREAMS", "src", "Examples", "out");

        //Interface AutoCloseable
        try(FileWriter out = new FileWriter((path)+"/out.txt", StandardCharsets.UTF_8)){
            IOOperations.write(out, "Hello");
        }
        //Interface AutoCloseable
        try(FileReader in = new FileReader((path)+"/out.txt", StandardCharsets.UTF_8)){
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
    //Method write
    /*private static void writerFile(Path path, String text){
        //Interface AutoCloseable
        try(FileWriter out = new FileWriter(path.toString()+"/out.txt", StandardCharsets.UTF_8)){
            out.write(text);
        }catch (IOException io){
            io.printStackTrace();
        }
    }*/
    //Method read
    /*private static String readFile(Path path){
        //Interface AutoCloseable
        StringBuilder text = new StringBuilder();
        try(FileReader in = new FileReader("POC_STEAMS/src/Examples/out/out.txt")) {
            int c = in.read();
            while (c > -1) {
                //System.out.print((char) c);
                text.append((char) c);
                c = in.read();
            }
            System.out.println(text);
        } catch (IOException io) {
            io.printStackTrace();
        }finally {
            return text.toString();
        }
    }*/
}
