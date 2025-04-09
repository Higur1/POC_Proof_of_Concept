import java.util.Collection;

public class FilterStream {
    public static void main(String[] args) {
        var students = Student
                .list()
                .stream()
                .filter(student -> student.yearOfBirth().getValue() >= 2005)
                .toList();

        System.out.println(students);

        var grades = Student
                .list()
                .stream()
                .map(Student::grades) //student -> student.grades()
                .flatMap(Collection::stream) //list -> list.stream()
                .filter(g -> g >= 7.0)
                .toList();

        System.out.println(grades);
    }
}
