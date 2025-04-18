import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.awt.*;
import java.time.LocalDate;

public class Car {
    private final String brand;
    private final Color color;

    //format date in generation json
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")

    private final LocalDate manufacturingDate;
    private final Engine engine;

    public Car(String brand, Color color, LocalDate manufacturingDate, Engine engine) {
        this.brand = brand;
        this.color = color;
        this.manufacturingDate = manufacturingDate;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color=" + color +
                ", manufacturingDate=" + manufacturingDate +
                ", engine=" + engine +
                '}';
    }

    public enum Color {
        WHITE, BLACK, RED
    }

    public static class Engine {
        @JsonProperty("engineModel") //set change name of attribute in generation json
        private final String model;

        @JsonIgnore //use to ignore in generation json - Serialization
        private final double hp;

        public Engine(String model, double hp) {
            this.model = model;
            this.hp = hp;
        }

        public String getModel() {
            return model;
        }

        public double getHp() {
            return hp;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "model='" + model + '\'' +
                    ", hp=" + hp +
                    '}';
        }
    }
}
