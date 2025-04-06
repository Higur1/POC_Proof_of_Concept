import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListArchivesAndDirectory {
    public static void main(String[] args) throws IOException {

        try(var  files = Files.newDirectoryStream(Path.of(""), "*")){ //glob is a filter
            for (Path path: files){
                System.out.println(path+" - " +Files.isDirectory(path));
            }
        }

    }
}
