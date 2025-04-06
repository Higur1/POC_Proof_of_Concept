package TransformingFileContent;

import java.io.*;
import java.nio.file.Path;

public class TransformingFileContent {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("POC_STREAMS", "src", "Exercise", "TransformingFileContent");
        System.out.println(path.toFile());
        try(
            var buffer = new BufferedReader(new FileReader(path+"/data.in"));
            var out = new PrintWriter(path+"/data.out");
        ){
            String line;
            while((line = buffer.readLine())!= null){
                line = line.replace(".", "\n");
                out.println(line);
            }
        }
    }
}
