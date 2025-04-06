import java.io.*;

public class StringReaderWriter {
    public static void main(String[] args) throws IOException {
        //Interface AutoCloseable
        try (Writer out = new StringWriter()) {
            IOOperations.write(out, "Text");
            System.out.println(out);
        }
        //Interface AutoCloseable
        try (Reader in = new StringReader("Text in")) {
            String text = IOOperations.read(in);
            System.out.println(text);
        }
    }
}
