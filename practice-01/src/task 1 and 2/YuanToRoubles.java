import java.util.Scanner;

class YuanToRoubles {
    public static void main(String[] args){
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки
        int yuan;
        double roubles;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму юаней: ");
        yuan = input.nextInt();

        roubles = ROUBLES_PER_YUAN * yuan;

        System.out.print("Конвертированная сумма в рублях: " + roubles);

    }
}
