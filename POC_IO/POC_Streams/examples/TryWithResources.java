import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.rmi.server.ExportException;

public class TryWithResources {
    public static void main(String[] args) {
        //Old Way
        /*
            FileWriter out = null;
            try {
                try {
                    out = new FileWriter("out.txt", StandardCharsets.UTF_8);
                    out.write("Hello");
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
            }catch (IOException io){
                io.printStackTrace();
            }

         */

        //Interface AutoCloseable
        try(FileWriter out = new FileWriter("out.txt", StandardCharsets.UTF_8)){
            out.write("Something");
        }catch (IOException io){
            io.printStackTrace();
        }
    }
}
