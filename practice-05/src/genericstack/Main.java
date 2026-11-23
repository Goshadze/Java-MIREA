package genericstack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пять строк:");
        InheritedGenericStack<String> stack = new InheritedGenericStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(scanner.nextLine());
        }

        System.out.println("В обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        GenericStack<Integer> intStack = new GenericStack<>();
        for (int i = 1; i <= 5; i++) {
            intStack.push(i);
        }
        System.out.println("Стек на массиве после 1..5: " + intStack + ", размер " + intStack.getSize());

        scanner.close();
    }
}
