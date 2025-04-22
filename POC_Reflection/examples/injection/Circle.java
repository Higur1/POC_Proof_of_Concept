package injection;

public class Circle {
    private double radius;
    @Inject
    private double pi;

    public Circle() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateSurface() {
        return pi * radius * radius;
    }
}
