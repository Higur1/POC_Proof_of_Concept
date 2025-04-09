package StudentPassOrFailEvaluation;

import java.util.Arrays;
import java.util.List;

public class StudentsEvaluation {
    public static void main(String[] args) {
        var students = List.of(
                new Student("José", List.of(8.5, 10.0, 9.0)),
                new Student("Pedro", List.of(7.0, 7.8, 7.8)),
                new Student("Maria", List.of(6.5, 9.8, 4.8)),
                new Student("Sara", List.of(6.5, 7.8, 7.5)),
                new Student("Rodrigo", List.of(4.5, 3.8, 6.5))
        );

        students
                .stream()
                .map(student -> {
                    double avg = student.grades.stream().mapToDouble(g -> g).average().orElse(0);
                    boolean pass = avg >= 7.0;
                    return student.name + " - " + (pass ? "PASS" : "FAIL");
                })
                .forEach(System.out::println);


    }

    private record Student(String name, List<Double> grades) {
    }
}
