import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TempDirectory {
    public static void main(String[] args) throws IOException {
        Path tempDir = Files.createTempDirectory("app_"); //C:\Users\X\AppData\Local\Temp\
        Path tempDirActually = Files.createTempDirectory(Path.of(""), "app_");

        System.out.println(tempDir);
        System.out.println(tempDirActually);

        Path tempFile = Files.createTempFile("app_", null); //C:\Users\Users\AppData\Local\Temp\app_15681156657082542507.tmp
        Path tempFileActually = Files.createTempFile(Path.of(""), "temp", null);
        System.out.println(tempFile);
    }
}
