import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApp {
    public static void main(String[] args) {
        Path path = Path.of("POC_ArchivesAndDirectory","src","Examples", "txts","files1.txt");//relative path
        System.out.println(path.toAbsolutePath()); //full path
        System.out.println(Files.exists(path));

        System.out.println(Files.isDirectory(path));//return false - isn't a directory
        System.out.println(Files.isRegularFile(path));//return true
        Files.isWritable(path); // see if it allows writing
        Files.isExecutable(path); //know if it is executable
        Files.isSymbolicLink(path);
    }
}
