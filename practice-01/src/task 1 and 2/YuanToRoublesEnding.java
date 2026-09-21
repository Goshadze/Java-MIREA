import java.util.Scanner;

class YuanToRoublesEnding {
    public static void main(String[] args){
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки
        int yuan, yuan_digits, yuan_more_digits;
        double roubles;
        String ending = "китайских юаней";

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму юаней: ");
        yuan = input.nextInt();

        yuan_digits = yuan%10;
        yuan_more_digits = yuan%100;
        if (yuan_more_digits >= 11 && yuan_more_digits <= 14)
            ending = "китайских юаней";
        else if (yuan_digits == 1)
            ending = "китайский юань";
        else if (yuan_digits >= 2 && yuan_digits <= 4)
            ending = "китайских юаня";


        roubles = ROUBLES_PER_YUAN * yuan;

        System.out.print("Конвертированная сумма в рублях: " + roubles + " " + ending);

    }
}
