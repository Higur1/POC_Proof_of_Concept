package GenerateAndSaveRandomNumbers;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class RandomNumbers {
    public static void main(String[] args) {
        Path file = Path.of("POC_Serialization/POC_Native_API/exercises/GenerateAndSaveRandomNumbers/numbers.out");

        List<Double> numbers = new ArrayList<>();
        if(Files.exists(file)){
            numbers =  fromFile(file);
        }

        numbers.add(Math.random());
        toFile(numbers, file);
        numbers.forEach(System.out::println);
    }

    public static void toFile(Object obj, Path file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(file))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @SuppressWarnings("unchecked")

    public static <T> T fromFile(Path file) {
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file))) {
            return (T) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
