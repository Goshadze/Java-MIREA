package months;

import java.util.Scanner;

public class Main {
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца (1–12): ");
        if (!input.hasNextInt()) {
            System.out.println("Нужно ввести целое число.");
            return;
        }
        int month = input.nextInt();
        try {
            String name = months[month - 1];
            int count = days[month - 1];
            if (month == 2) {
                System.out.print("Введите год: ");
                if (!input.hasNextInt()) {
                    System.out.println("Нужно ввести целое число года.");
                    return;
                }
                if (isLeapYear(input.nextInt())) count++;
            }
            System.out.println(name + ": " + count + " дней");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимое число");
        }
    }
}
