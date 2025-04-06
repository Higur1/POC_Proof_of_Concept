import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyMove {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("POC_ArchivesAndDirectory","src","Examples","txts","d1","d2", "d2.txt");
        Path to = path.getParent().getParent().resolve("CopyFile2.txt");
        //Path toPath1 = path.getParent().resolve(Path.of("files", "files.txt"));

        Files.copy(path, to); //if already exists - FileAlreadyExistsException
        Files.copy(path, to, StandardCopyOption.REPLACE_EXISTING); // if already exists replace content
        System.out.println(path);
        System.out.println(to);

        Files.move(path, to); //same options
        Files.move(path, to, StandardCopyOption.REPLACE_EXISTING); //same options

    }
}
