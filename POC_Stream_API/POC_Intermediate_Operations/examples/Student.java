import java.time.Year;
import java.util.List;

public record Student(
        String name,
        Year yearOfBirth,
        List<Double> grades
) {
    public static List<Student> list() {
        return List.of(
                new Student("José", Year.of(2009), List.of(8.5, 10.0, 9.0)),
                new Student("Pedro", Year.of(2006), List.of(7.0, 7.8, 7.8)),
                new Student("Maria", Year.of(2007), List.of(6.5, 9.8, 4.8)),
                new Student("Sara", Year.of(2008), List.of(6.5, 7.8, 7.5)),
                new Student("Rodrigo", Year.of(2004), List.of(4.5, 3.8, 6.5))
        );
    }
}