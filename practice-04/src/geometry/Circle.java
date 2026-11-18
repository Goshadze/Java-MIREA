package geometry;

public class Circle extends GeometricObject {
    private final double radius;
    public Circle(double radius) {
        if (!Double.isFinite(radius) || radius < 0) throw new IllegalArgumentException("Некорректный радиус");
        this.radius = radius;
    }
    public double getRadius() { return radius; }
    public double getArea() { return Math.PI * radius * radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
    @Override
    public String toString() { return "Круг, радиус: " + radius + ", площадь: " + getArea(); }
}
