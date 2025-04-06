package CreateTimestampedFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateTimestampedFiles {
    public static void main(String[] args) throws IOException {
        Path dir =  Path.of("POC_ArchivesAndDirectory", "src", "Exercise","CreateTimestampedFiles");
        String fileName = "file_" + System.currentTimeMillis() + ".txt";
        Files.createFile(dir.resolve(fileName));
    }
}
