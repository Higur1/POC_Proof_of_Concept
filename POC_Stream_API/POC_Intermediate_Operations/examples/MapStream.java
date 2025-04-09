import java.time.Year;
import java.util.Arrays;

public class MapStream {
    public static void main(String[] args) {
        var years = Student.list()
                .stream()
                .map(Student::yearOfBirth) //student -> student.yearOfBirth()
                .mapToInt(Year::getValue) //year -> year.getValue()
                .toArray();

        System.out.println(Arrays.toString(years));
    }
}
