package InstantiateGeometricShapesFromJSONConfiguration;

import SerializeAndDeserializeASetOfBooksInJSON.JsonUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Shapes {

    public static void main(String[] args) {
        ShapesConfig shapesConfig = ShapesConfig.create(); //Shapes Config instance

        ShapeConfig rectangleConfig = shapesConfig.getConfig(ShapesConfig.ShapeType.RECTANGLE);
        ShapeConfig squareConfig = shapesConfig.getConfig(ShapesConfig.ShapeType.SQUARE);
        ShapeConfig circleConfig = shapesConfig.getConfig(ShapesConfig.ShapeType.CIRCLE);

        var rectangle = new Rectangle(
                Integer.parseInt(rectangleConfig.getProperties().get("width")),
                Integer.parseInt(rectangleConfig.getProperties().get("height"))
        );
        System.out.println(rectangle);

        var square = new Square(
                Integer.parseInt(squareConfig.getProperties().get("size"))
        );
        System.out.println(square);

        var circle = new Circle(
                Integer.parseInt(circleConfig.getProperties().get("radius"))
        );
        System.out.println(circle);
    }

    private record Square(int size) {
    }

    private record Rectangle(int width, int height) {
    }

    private record Circle(int radius) {
    }
    //configuration properties of JSON - need to serialized - represent configuration of any shape
    private static class ShapeConfig {
        private ShapesConfig.ShapeType type;
        private Map<String, String> properties;

        public ShapesConfig.ShapeType getType() {
            return type;
        }

        public Map<String, String> getProperties() {
            return properties;
        }

        @Override
        public String toString() {
            return "ShapeConfig{" +
                    "type=" + type +
                    ", properties=" + properties +
                    '}';
        }
    }
    //Encapsulates within an array
    public record ShapesConfig(List<ShapeConfig> configs) {
        //identified types
        public enum ShapeType {
            SQUARE, RECTANGLE, CIRCLE
        }
        //access archive JSON and get to attributes and values
        public static ShapesConfig create() {
            try {
                return new ShapesConfig(JsonUtils.mapper().readValue(
                        new File("POC_Serialization/POC_Jackson_API_JSON/exercises/InstantiateGeometricShapesFromJSONConfiguration/shapesConfig.json"),
                        new TypeReference<>() {
                        }));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        //get config of archive
        public ShapeConfig getConfig(ShapeType type) {
            return configs
                    .stream()
                    .filter(c -> c.type == type)
                    .findFirst()
                    .orElseThrow();
        }
    }
}
