package prototype;

// Клиентский код (вариант №5): создаём фигуры, клонируем,
// меняем только копию и смотрим, что оригинал остался прежним.
public class PrototypeMain {
    public static void main(String[] args) {

        // --- Круг ---
        Circle originalCircle = new Circle(5);
        Circle copyCircle = (Circle) originalCircle.clone();

        System.out.println("Круг-оригинал:      " + originalCircle);
        System.out.println("Клон круга:         " + copyCircle);
        System.out.println("Это один и тот же объект? " + (originalCircle == copyCircle));

        // Меняем только копию.
        copyCircle.setRadius(10);
        System.out.println("Клону поставили радиус 10.");
        System.out.println("Круг-оригинал:      " + originalCircle);
        System.out.println("Клон круга:         " + copyCircle);

        // --- Прямоугольник ---
        System.out.println();
        Rectangle originalRect = new Rectangle(3, 4);
        Rectangle copyRect = (Rectangle) originalRect.clone();

        System.out.println("Оригинал:           " + originalRect);
        System.out.println("Клон:               " + copyRect);
        System.out.println("Это один и тот же объект? " + (originalRect == copyRect));

        // Меняем только копию.
        copyRect.setWidth(100);
        System.out.println("Клону поставили ширину 100.");
        System.out.println("Оригинал:           " + originalRect);
        System.out.println("Клон:               " + copyRect);
    }
}
