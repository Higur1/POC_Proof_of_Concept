import java.util.Arrays;
import java.util.Collection;

public class FlatMapStream {
    public static void main(String[] args) {
        var grades = Student
                .list()
                .stream()
                .map(Student::grades) //student -> student.grades() -- list to list of double
                .flatMap(Collection::stream) //list -> list.stream() - returns a list of double
                .toList();

        System.out.println(grades);
    }
}
