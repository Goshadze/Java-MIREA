package geometry;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Введите три стороны треугольника: ");
            double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
            Triangle triangle = new Triangle(a, b, c);
            System.out.print("Введите цвет: ");
            String color = input.next();
            System.out.print("Закрашен (true/false): ");
            boolean filled = input.nextBoolean();
            triangle.setColor(color);
            triangle.setFilled(filled);
            System.out.println(triangle);
            System.out.printf("Площадь: %.2f; периметр: %.2f; цвет: %s; заливка: %b%n",
                    triangle.getArea(), triangle.getPerimeter(), triangle.getColor(), triangle.isFilled());
        } catch (IllegalTriangleException | InputMismatchException e) {
            System.out.println("Ошибка ввода: " + (e.getMessage() == null ? "неверный формат данных" : e.getMessage()));
        } catch (NoSuchElementException e) {
            System.out.println("Ввод закончился до заполнения данных треугольника.");
        }

        Circle c1 = new Circle(2), c2 = new Circle(3);
        Rectangle r1 = new Rectangle(2, 3), r2 = new Rectangle(3, 4);
        System.out.println("Больший круг: " + GeometricObject.max(c1, c2));
        System.out.println("Больший прямоугольник: " + GeometricObject.max(r1, r2));
        ComparableCircle cc1 = new ComparableCircle(2), cc2 = new ComparableCircle(3);
        System.out.println("Больший ComparableCircle: " + (cc1.compareTo(cc2) >= 0 ? cc1 : cc2));
        System.out.println("Большая фигура (круг и прямоугольник): " + (cc2.compareTo(r2) >= 0 ? cc2 : r2));

        GeometricObject[] objects = {new Circle(1), new Rectangle(2, 3), new Square(2), new Triangle(), new Square(3)};
        for (GeometricObject object : objects) {
            System.out.printf("%s: площадь %.2f%n", object.getClass().getSimpleName(), object.getArea());
            if (object instanceof Colorable) ((Colorable) object).howToColor();
        }
    }
}
