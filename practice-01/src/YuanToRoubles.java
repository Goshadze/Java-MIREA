import java.util.Scanner;

public class YuanToRoubles {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91; // курс покупки

        int yuan; // сумма денег в китайских юанях
        double roubles; // сумма денег в российских рублях

        Scanner input = new Scanner(System.in);

        // Получить сумму денег в китайских юанях
        System.out.print("Введите сумму в китайских юанях: ");
        yuan = input.nextInt();

        // Конвертировать сумму денег в российские рубли
        roubles = ROUBLES_PER_YUAN * yuan;

        // Отобразить сумму денег в российских рублях
        System.out.println(yuan + " китайских юаней = " + roubles + " российских рублей");
    }
}
