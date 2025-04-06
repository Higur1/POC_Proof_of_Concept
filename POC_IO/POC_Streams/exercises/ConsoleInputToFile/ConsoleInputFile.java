package ConsoleInputToFile;

import Examples.PrintWriterApp;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class ConsoleInputFile {
    public static void main(String[] args) throws FileNotFoundException {
        Path path = Path.of("POC_STREAMS", "src", "Exercise", "ConsoleInputToFile", "console.txt");
        try(PrintWriter printWriter = new PrintWriter(path.toFile())){
            while (true){
                Scanner scanner = new Scanner(System.in);
                System.out.println(">>");
                String line = scanner.nextLine();
                if(line.isEmpty()){
                    break;
                }
                printWriter.println(line);
            }
        }

    }
}
