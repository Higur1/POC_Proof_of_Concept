public class LimitStream {
    public static void main(String[] args) {
        var names = Student
                .list()
                .stream()
                .map(Student::name)
                .sorted()
                .limit(2)// if the limit is greater than the existing quantity, it returns all of them, making the limit useless
                .toList();

        System.out.println(names);
    }
}
