public class DistinctStream {
    public static void main(String[] args) {
        var grades = Student
                .list()
                .stream()
                .flatMap(student -> student.grades().stream())
                //If for a created class, it is necessary to implement equals and hashCode to determine whether it should be equal in the analyzed object
                .distinct()
                .toList();

        System.out.println(grades);
    }
}
