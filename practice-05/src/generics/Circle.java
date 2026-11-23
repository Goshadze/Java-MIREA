package generics;

public class Circle implements Comparable<Circle> {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public int compareTo(Circle other) {
        if (radius > other.radius) {
            return 1;
        } else if (radius < other.radius) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Круг, радиус = " + radius;
    }
}
