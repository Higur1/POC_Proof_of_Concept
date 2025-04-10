import java.util.ArrayList;
import java.util.List;

public class DriveVehicleProblem {
    public static void main(String[] args) {
        Vehicle.Bus b = new Vehicle.Bus();
        Vehicle.Car c = new Vehicle.Car();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(b);
        vehicles.add(c);

        driveVehicles(vehicles);

        List<Vehicle.Car> cars = new ArrayList<>();
        cars.add(c);

        //driveVehicles(cars); //error - only accept same type list
    }

    private static void driveVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            v.drive();
        }
    }
}
