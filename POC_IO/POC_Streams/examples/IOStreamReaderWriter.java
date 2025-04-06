import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

//Work to bytes
public class IOStreamReaderWriter {
    private static final byte[] BYTES = {106, 97, 118, 97, 32, 114, 111, 99, 107, 115, 33, 32, 92, 111, 47};

    public static void main(String[] args) throws IOException {
        /* Basic mode
            InputStream in = new ByteArrayInputStream(BYTES);
            InputStreamReader inputStreamReader = new InputStreamReader(in, StandardCharsets.UTF_8);
         */

        //Decorator - Design patter
        /*
        InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(BYTES), StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        */
        String text;
        //Another Decorator //Interface AutoCloseable
        try (BufferedReader inputStreamReader =
                     new BufferedReader( //storage chars
                             new InputStreamReader( //transform in char
                                     new ByteArrayInputStream(BYTES), //transform in stream
                                     StandardCharsets.UTF_8
                             )
                     )) {
            text = inputStreamReader.readLine(); //Byte to text
        }
        ;
        System.out.println(text);

        //Decorator
        /* //Interface AutoCloseable
            try(OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new ByteArrayOutputStream())){
                outputStreamWriter.write(text);
            }
         */

        //Basic mode
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Interface AutoCloseable
        try(OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArrayOutputStream)){
            outputStreamWriter.write(text); //text after decode bytes --- Text to byte
        }

        byte[] bytes = byteArrayOutputStream.toByteArray();

        System.out.println(Arrays.toString(BYTES));
        System.out.println(Arrays.toString(bytes));


    }
}
