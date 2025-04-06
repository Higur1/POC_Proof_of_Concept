import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDeletion {
    public static void main(String[] args) throws IOException {
        //Is not possible with directory - DirectoryNotEmptyException
        Path path = Path.of("myFile.txt");
        //Files.createFile(path);

        Files.delete(path); // if not exists = NoSuchFileException
        Files.deleteIfExists(path);//another way
    }
}
