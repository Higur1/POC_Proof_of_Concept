import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class ExampleUseCar {
    public static void main(String[] args) throws IOException {
        Car car = new Car(
                null,
                Car.Color.WHITE,
                LocalDate.of(2020,6,13),
                new Car.Engine(
                        "XPTO",
                        89.3
                )
        );

        try(var out = Files.newOutputStream(Path.of("POC_Serialization/POC_Jackson_API_JSON/examples/car.json"))){
            //JsonUtils.mapper().writeValue(out, car);
            JsonUtils.mapper().writerWithDefaultPrettyPrinter().writeValue(out, car); //another way to config indentation to archives
        }
    }
}
