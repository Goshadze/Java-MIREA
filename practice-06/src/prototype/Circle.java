package prototype;

// Круг — конкретный прототип (вариант №5).
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Копию делает сам Java: super.clone() создаёт новый объект
    // и копирует в него все поля. Если этого не сделать, copy
    // будет просто второй ссылкой на тот же самый круг.
    @Override
    public Shape clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Круг, радиус = " + radius;
    }
}
