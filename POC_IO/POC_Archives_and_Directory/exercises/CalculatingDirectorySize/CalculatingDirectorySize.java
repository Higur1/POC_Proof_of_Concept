package CalculatingDirectorySize;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CalculatingDirectorySize {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("");
        System.out.println(path.toAbsolutePath());

        System.out.println(calculatorSize(path));
    }
    private static long calculatorSize(Path path) throws IOException {
        long size = 0;
        try(var files = Files.newDirectoryStream(path)){
            for(Path file: files ){
                if(Files.isDirectory(file)){
                    size += calculatorSize(file);
                }else{
                    size += Files.size(file);
                }

            }
        }

        return size;
    }
}
