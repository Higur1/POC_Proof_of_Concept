package regularInnerClassCar;

//OuterClass
public class Car {
    private int speed;
    private Engine engine = new Engine();
    private boolean on;

    public void accelerate() {
        engine.injectFuel();
    }

    public int getSpeed() {
        return speed;
    }

    // Regular inner class
    private class Engine {
        private boolean on;

        public void injectFuel() {
            speed += 10;
        }

        public boolean isAllOn(){
            //"this" uses the regular class object attribute and "Outer class this" uses the reference class attribute
            return this.on && Car.this.on;
        }
    }
    // Inner class
    public class Door {
        private boolean isOpen;

        public void open () {
            isOpen = true;
        }
        public void close () {
            isOpen = false;
        }
    }
}
