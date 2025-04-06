import java.io.*;

public class IOOperations {
    public static void write(Writer out, String text) throws IOException {
        out.write(text);
    }


    public static String read(Reader in) throws IOException {
        StringBuilder text = new StringBuilder();

        int c = in.read();
        while (c > -1) {
            text.append((char) c);
            c = in.read();
        }
        return text.toString();
    }

    public static String read(BufferedReader in) throws IOException {
        String line;
        StringBuilder text = new StringBuilder();
        while ((line = in.readLine()) != null) {
            text.append(line).append("\n");
        }
        return text.toString();
    }


    //Work to bytes
    //read is a dangerous method only works with little information -
    //If there is a lot of information it can consume a lot of memory -- Use transfer method
    public static byte[] read(InputStream in) throws IOException {
        return in.readAllBytes();
    }

    public static void write(OutputStream out, byte[] bytes) throws IOException {
        out.write(bytes);
    }

    public static void transfer(InputStream in, OutputStream out) throws IOException {
        byte[] buffer = new byte[2048];

        while (true){
            int bytesRead = in.read(buffer);

            if(bytesRead < 0){
                break;
            }
            out.write(buffer, 0, bytesRead);
        }
    }
}
