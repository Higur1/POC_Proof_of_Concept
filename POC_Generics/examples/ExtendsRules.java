import java.util.ArrayList;
import java.util.List;

public class ExtendsRules {
    public static void main(String[] args) {
        Vehicle.Bus bus = new Vehicle.Bus();
        Vehicle.Car car = new Vehicle.Car();

        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        vehicles.add(bus);
        vehicles.add(car);

        //after using wildcard it is no longer possible to add new elements
        List<? extends Vehicle> cars = new ArrayList<Vehicle.Car>();
        //cars.add(car); //error - // capture of ? extends Vehicle
        cars.remove(0); //is possible

    }

}
