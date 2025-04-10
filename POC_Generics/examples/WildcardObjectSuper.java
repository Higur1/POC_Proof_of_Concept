import java.util.ArrayList;
import java.util.List;

public class WildcardObjectSuper {
    public static void main(String[] args) {

        //extends - upper bound - in this case Vehicle is a upper hierarchy
        // Vehicle -> Bus and Car
        List<? extends Vehicle> l1 = new ArrayList<Vehicle>(); //not possible add new elements
        List<? extends Vehicle> l2 = new ArrayList<Vehicle.Bus>(); //not possible add new elements
        List<? extends Vehicle> l3 = new ArrayList<Vehicle.Car>(); //not possible add new elements

        //super - lower bound - Bus -> Vehicle -> Object
        List<? super Vehicle.Bus> l4 = new ArrayList<Vehicle.Bus>(); //is possible add new elements
        List<? super Vehicle.Bus> l5 = new ArrayList<Vehicle>();  //is possible add new elements
        List<? super Vehicle.Bus> l6 = new ArrayList<Object>();  //is possible add new elements

        l4.add(new Vehicle.Bus());
        var e = l4.get(0); //Object type and not a Bus type - is necessary cast
    }
}
