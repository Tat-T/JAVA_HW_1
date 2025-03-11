import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        // System.out.println("\" Задание 1 \"\n"
        // + "Выведите на экран надпись \"Your time is limited, so \n"
        // + "don't waste it living someone else's life\" Steve Jobs на разных \n"
        // + "строках.\n");
        
        // System.out.printf(
        // "\"Your time is limited,\n"
        // + "   so don't waste it \n"
        // + "      living someone else's life\" \n"
        // + "         Steve Jobs\n\n");

        // System.out.printf("\" Задание 2 \"\n");
        // System.out.println("Пользователь вводит с клавиатуры два числа.Первое \n"
        // +"число-это начение, второе число процент, который необходимо посчитать. Например, мы ввели с клавиатуры  \n"
        // +"50 и 10. Требуется вывести на экран 10 процентов от 50. \n"
        // +"Результат:5 \n");
        // System.out.print("Введите число: ");
        // double value = scanner.nextDouble();
        // System.out.print("Введите процент: ");
        // double percent = scanner.nextDouble();
        // double result = (value * percent) / 100;
        // System.out.println("Результат:" + result);

        // System.out.printf("\n\" Задание 3 \"\n");
        // System.out.println("Пользователь вводит с клавиатуры три цифры.\n"
        // +"Необходимо создать число, содержащее эти цифры.\n"
        // +"Например, если введены 7, 3, 8, то формируем число 738.\n");
        // System.out.print("Введите первую цифру: ");
        // int digit1 = scanner.nextInt();
        // System.out.print("Введите вторую цифру: ");
        // int digit2 = scanner.nextInt();
        // System.out.print("Введите третью цифру: ");
        // int digit3 = scanner.nextInt();
        // int number = digit1 * 100 + digit2 * 10 + digit3;
        // System.out.println("Сформированное число: " + number);

        System.out.printf("\" Задание 4 \"\n");
        System.out.println("Пользователь вводит шестизначное число. Меняем 1-ю с 6-й и 2-ю с 5-й цифры.");
        System.out.print("Введите шестизначное число: ");
        String hexNumber = scanner.next();
        if (hexNumber.length() != 6 || !hexNumber.matches("\\d+")) {
            System.out.println("Ошибка! Введите корректное шестизначное число.");
        } else {
            char[] digits = hexNumber.toCharArray();
            char temp = digits[0];
            digits[0] = digits[5];
            digits[5] = temp;

            temp = digits[1];
            digits[1] = digits[4];
            digits[4] = temp;

            System.out.println("Измененное число: " + new String(digits));
        }
        System.out.println();

        System.out.printf("\" Задание 5 \"\n");

        System.out.printf("\" Задание 6 \"\n");

        System.out.printf("\" Задание 7 \"\n");

        System.out.printf("\" Задание 8 \"\n");

        System.out.printf("\" Задание 9 \"\n");

        System.out.printf("\" Задание 10 \"\n");

        System.out.printf("\" Задание 11 \"\n");

        System.out.printf("\" Задание 12 \"\n");

    }
}