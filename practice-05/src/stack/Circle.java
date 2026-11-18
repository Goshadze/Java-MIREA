package stack;

public class Circle implements Comparable<Circle> {
    private final double radius;
    public Circle(double radius) {
        if (!Double.isFinite(radius) || radius < 0) throw new IllegalArgumentException("Некорректный радиус");
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public int compareTo(Circle other) { return Double.compare(radius, other.radius); }
    @Override
    public String toString() { return "Круг с радиусом " + radius; }
}
