import java.util.ArrayList;
import java.util.List;

public class DriveVehicleSolution {
    public static void main(String[] args) {
        Vehicle.Bus bus = new Vehicle.Bus();
        Vehicle.Car car = new Vehicle.Car();

        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle.Bus> buses = new ArrayList<>();
        vehicles.add(bus);
        vehicles.add(car);
        driveVehicles(vehicles);

        //vehicles = buses; //it is not possible to assign a vehicle list to a bus list
        //driveVehicles(buses); //incompatible types

        driveVehicles(buses); //after add change in method driveVehicles is possible send a list of bus to List that extends vehicle

        //Another example
        //List<Vehicle> vehicles1 = new ArrayList<Vehicle.Car>(); //not work
        List<? extends Vehicle> vehicles1 = new ArrayList<Vehicle.Car>(); //use wildcard work
    }
    //old method
    /*private static void driveVehicles(List<Vehicle> vehicles){
        for (Vehicle v: vehicles){
            v.drive();
        }
    }*/

    //changing the method so that it receives any list that extends vehicles - (? extends) this is wildcard
    //Always use "extends", even for interfaces and classes. There is no implements and interface syntax
    private static void driveVehicles(List<? extends Vehicle> vehicles){
        for (Vehicle v: vehicles){
            v.drive();
        }
    }
}
