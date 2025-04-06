import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;


public class FileApp {
    public static void main(String[] args) {
        File file = new File(".");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

        System.out.println(Arrays.toString(file.list()));


        //Convert file to path
        Path path = file.toPath();

        //Convert path to file
        File file2 = path.toFile();
    }
}
