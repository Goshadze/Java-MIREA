package mystack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пять строк:");
        InheritedMyStack stack = new InheritedMyStack();
        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }

        System.out.println("В обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        MyStack original = new MyStack();
        original.push(1);
        original.push(2);
        MyStack copy = original.clone();
        copy.push(3);

        System.out.println("Оригинал: " + original);
        System.out.println("Копия:    " + copy);

        scanner.close();
    }
}
