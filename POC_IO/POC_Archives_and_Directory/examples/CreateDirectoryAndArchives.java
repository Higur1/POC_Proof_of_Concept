import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectoryAndArchives{
    public static void main(String[] args) throws IOException {
        Path root = Path.of("POC_ArchivesAndDirectory","src","Examples","txts");
        Path d1 = root.resolve("d1");
        if (!Files.exists(d1)){
            Files.createDirectories(root.resolve("d1"));
        }

        Path d3 = Files.createDirectories(d1.resolve(Path.of("d2", "d3"))); //create directory hierarchy
        //Files.createFile(d3.resolve("d3.txt")); //FileAlreadyExistsException
        Files.createFile(d3.getParent()/*return directory*/.resolve("d2.txt"));
        Files.createFile(d3.getParent().getParent().resolve("d1.txt"));
    }
}
