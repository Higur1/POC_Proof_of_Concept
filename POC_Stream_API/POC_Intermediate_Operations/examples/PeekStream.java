public class PeekStream {
    public static void main(String[] args) {
        var average = Student
                .list()
                .stream()
                .peek(s -> System.out.println("initial stream: " + s))
                .flatMap(student -> student.grades().stream())
                .peek(s -> System.out.println("after flatMap: " + s))
                .mapToDouble(d -> d)
                .peek(s -> System.out.println("after mapToDouble: " + s))
                .average()
                .orElse(0);

        System.out.println(average);
    }
}
