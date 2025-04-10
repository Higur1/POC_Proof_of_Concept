public abstract class Vehicle {
    public abstract void drive();

    static class Bus extends Vehicle{

        @Override
        public void drive() {
            System.out.println("Drive a Bus");
        }
    }
    static class Car extends Vehicle{

        @Override
        public void drive() {
            System.out.println("Drive a Car");
        }
    }
}
