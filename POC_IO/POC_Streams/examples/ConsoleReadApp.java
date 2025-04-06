import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReadApp {
    public static void main(String[] args) throws IOException {
        //best way
        /*
            //Interface AutoCloseable
            try(var reader = new BufferedReader(new InputStreamReader(System.in))){
                String line = reader.readLine();
                System.out.println(new StringBuffer(line).reverse());
            }
        */
        //Interface AutoCloseable
        try(var scanner = new Scanner(System.in)){
            String line = scanner.nextLine();
            System.out.println(new StringBuilder(line).reverse());
        }

        System.in.read(); // This generate a IO exception - Stream closed
    }
}
