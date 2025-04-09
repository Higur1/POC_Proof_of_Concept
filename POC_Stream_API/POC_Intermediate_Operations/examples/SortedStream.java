import java.util.Comparator;

public class SortedStream {
    public static void main(String[] args) {
        var names = Student
                .list()
                .stream()
                .map(Student::name)
                .sorted() //is possible use Comparator
                .toList();

        System.out.println(names);
    }
}
