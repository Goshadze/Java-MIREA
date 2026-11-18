package stack;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Без повторов: " + Algorithms.unique(new ArrayList<>(Arrays.asList(1, 2, 1, 3))));
        System.out.println("Позиция 3: " + Algorithms.linearSearch(new Integer[]{1, 2, 3}, 3));
        System.out.println("Наибольший круг: " + Algorithms.max(new Circle[]{new Circle(2), new Circle(5), new Circle(3)}));
        System.out.println("Максимум матрицы: " + Algorithms.max(new Integer[][]{{1, 9}, {3, 4}}));
        GenericStack<Integer> arrayStack = new GenericStack<>();
        for (int i = 1; i <= 5; i++) arrayStack.push(i);
        System.out.println("Стек на массиве: " + arrayStack + ", размер " + arrayStack.getSize() + ", вершина " + arrayStack.peek());
        InheritedGenericStack<String> stack = new InheritedGenericStack<>();
        InheritedStack inheritedStack = new InheritedStack();
        System.out.println("Введите пять строк:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ": ");
            if (!input.hasNextLine()) {
                System.out.println("Ввод закончился раньше пяти строк.");
                return;
            }
            String line = input.nextLine();
            stack.push(line);
            inheritedStack.push(line);
        }
        System.out.println("Строки в обратном порядке (GenericStack, наследник ArrayList):");
        while (!stack.isEmpty()) System.out.println(stack.pop());
        System.out.println("Строки в обратном порядке (MyStack, наследник ArrayList):");
        while (!inheritedStack.isEmpty()) System.out.println(inheritedStack.pop());

        MyStack original = new MyStack();
        original.push("первая");
        original.push("вторая");
        MyStack copy = original.clone();
        copy.pop();
        copy.push("копия");
        System.out.println("Исходный " + original);
        System.out.println("Изменённая копия: " + copy);
    }
}
