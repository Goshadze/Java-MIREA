package geometry;

public class Square extends GeometricObject implements Colorable {
    private double side;
    public Square() { this(0); }
    public Square(double side) { setSide(side); }
    public double getSide() { return side; }
    public void setSide(double side) {
        if (!Double.isFinite(side) || side < 0) throw new IllegalArgumentException("Некорректная сторона квадрата");
        this.side = side;
    }
    public double getArea() { return side * side; }
    public double getPerimeter() { return 4 * side; }
    public void howToColor() { System.out.println("Раскрасьте все четыре стороны."); }
}
