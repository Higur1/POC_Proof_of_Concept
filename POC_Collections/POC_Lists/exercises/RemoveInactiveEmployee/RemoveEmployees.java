package RemoveInactiveEmployee;

import java.util.ArrayList;
import java.util.List;

import static Exercise.RemoveInactiveEmployee.Employee.Status.ACTIVE;
import static Exercise.RemoveInactiveEmployee.Employee.Status.INACTIVE;

//resolved
public class RemoveEmployees {
    public static void main(String[] args) {
        var employees = List.of(
                new Employee("João", ACTIVE),
                new Employee("Pedro", INACTIVE),
                new Employee("Jose", ACTIVE),
                new Employee("Gabriel", ACTIVE),
                new Employee("Fernando", INACTIVE),
                new Employee("Batista", ACTIVE)
        );

        var activeEmployees = removeInactive(employees);
        System.out.println(employees);
        System.out.println(activeEmployees);
    }
    private static List<Employee> removeInactive(List<Employee> employees){
        var activeEmployees = new ArrayList<Employee>();
        activeEmployees.addAll(employees);

        var iterator = activeEmployees.iterator();
        while (iterator.hasNext()){
            if(iterator.next().getStatus() == INACTIVE){
                iterator.remove();
            }
        }
        return activeEmployees;
    }
}
