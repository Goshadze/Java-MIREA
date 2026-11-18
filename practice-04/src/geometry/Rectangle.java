package geometry;

public class Rectangle extends GeometricObject {
    private double width, height;
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) {
        if (!Double.isFinite(width) || width < 0) throw new IllegalArgumentException("Некорректная ширина");
        this.width = width;
    }
    public void setHeight(double height) {
        if (!Double.isFinite(height) || height < 0) throw new IllegalArgumentException("Некорректная высота");
        this.height = height;
    }
    public double getArea() { return width * height; }
    public double getPerimeter() { return 2 * (width + height); }
    @Override
    public String toString() { return "Прямоугольник " + width + " × " + height + ", площадь: " + getArea(); }
}
