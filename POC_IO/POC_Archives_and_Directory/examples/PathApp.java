import java.nio.file.Path;

public class PathApp {
    public static void main(String[] args) {
        /*
        //C:/System/Java/file.exe
        Path p1 = Path.of("C", "Java", "System", "file.exe");
        System.out.println(p1);

        //name of archive
        Path path = p1.getFileName();
        System.out.println(path);

        //All PATH
        Path path1 = p1.getRoot();
        System.out.println(path1);
        */
        //Path path = Path.of("home"); // - Is a relative directory
        Path path = Path.of("/home"); // - It is not a relative directory
        Path path1 = Path.of("higor");
        Path path2 = Path.of("log.out");

        //create path - always return another path
        Path path3 = path.resolve(path1).resolve(path2);

        Path path4 = path3.toAbsolutePath(); //absolute way

        System.out.println(path3);
        System.out.println(path4);

    }
}
