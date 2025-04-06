import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException{

        Path path = Path.of("POC_STREAMS", "src", "Examples", "out");

        //Receives each information and adds it to the file - many i/o operations
        /*
            try(Writer out = (new FileWriter((path)+"/out.txt",StandardCharsets.UTF_8))){
                IOOperations.write(out, "Hello");
            }
        */

        //Decorator - Design Patter //Interface AutoCloseable
        //Stores all information and adds it all at once - few i/o operations
        try(BufferedWriter out = new BufferedWriter(new FileWriter((path)+"/out.txt",StandardCharsets.UTF_8))){
            IOOperations.write(out, "Hello");
            out.flush();
        }
        //Decorator - Design Patter //Interface AutoCloseable
        try(BufferedReader in = new BufferedReader(new FileReader(path+"/out.txt", StandardCharsets.UTF_8))){
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}
