package regularInnerClassCar;
import regularInnerClassCar.Car.Door;
public class RegularInnerClassCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.accelerate();

        System.out.println(car.getSpeed());

        //Outer class - Inner class
        //Car.Door door = null;

        //other way
        Door door = car.new Door(); // need import line 2 - first instance outer class and after regular class


    }
}
