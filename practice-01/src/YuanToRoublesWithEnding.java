import java.util.Scanner;

public class YuanToRoublesWithEnding {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки

        int yuan; // сумма денег в китайских юанях
        double roubles; // сумма денег в российских рублях
        int digit; // последняя цифра yuan

        Scanner input = new Scanner(System.in);

        // Получить сумму денег в китайских юанях
        System.out.print("Введите сумму в китайских юанях: ");
        yuan = input.nextInt();

        // Конвертировать сумму денег в российские рубли
        roubles = ROUBLES_PER_YUAN * yuan;

        // Определить окончание слова "юань" по последней цифре
        digit = yuan % 10;
        String ending;
        if (digit == 1)
            ending = "юань";
        else if (digit >= 2 && digit <= 4)
            ending = "юаня";
        else
            ending = "юаней";

        // Отобразить сумму денег в российских рублях
        System.out.println(yuan + " китайских " + ending + " = " + roubles + " российских рублей");
    }
}
