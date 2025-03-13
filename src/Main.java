import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    @SuppressWarnings("resource")
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        One();
        Two();
        Three();
        Four();
        Five();
        Six();
        Seven();
        Eight();
        Nine();
        Ten();
        Eleven();
    }

    public static void One() {
        System.out.println("\" Задание 1 \"\n"
        + "Выведите на экран надпись \"Your time is limited, so \n"
        + "don't waste it living someone else's life\" Steve Jobs на разных \n"
        + "строках.\n");
    
        System.out.printf(
        "\"Your time is limited,\n"
        + " so don't waste it \n"
        + " living someone else's life\" \n"
        + " Steve Jobs\n\n");
    }
    
    public static void Two() {
        System.out.printf("\" Задание 2 \"\n");
        System.out.println("Пользователь вводит с клавиатуры два числа.Первое \n"
        +"число-это начение, второе число процент, который необходимо посчитать. \n"
        +"Например, мы ввели с клавиатуры \n"
        +"50 и 10. Требуется вывести на экран 10 процентов от 50. \n"
        +"Результат:5 \n");
        System.out.print("Введите число: ");
        double value = scanner.nextDouble();
        System.out.print("Введите процент: ");
        double percent = scanner.nextDouble();
        double result = (value * percent) / 100;
        System.out.println("Результат:" + result);
    }
    
    public static void Three() {
        System.out.printf("\n\" Задание 3 \"\n");
        System.out.println("Пользователь вводит с клавиатуры три цифры.\n"
        +"Необходимо создать число, содержащее эти цифры.\n"
        +"Например, если введены 7, 3, 8, то формируем число 738.\n");
        System.out.print("Введите первую цифру: ");
        int digit1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        int digit2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        int digit3 = scanner.nextInt();
        int number = digit1 * 100 + digit2 * 10 + digit3;
        System.out.println("Сформированное число: " + number);
    }
    
    public static void Four() {
        System.out.printf("\" Задание 4 \"\n");
        System.out.println("Пользователь вводит шестизначное число. Меняем 1-ю с 6-й и 2-ю с 5-й цифры.");
        String hexNumber;
    
        while (true) {
        System.out.print("Введите шестизначное число: ");
        hexNumber = scanner.next();
    
        if (hexNumber.length() == 6 && hexNumber.matches("\\d+")) {
        break;
        } else {
        System.out.println("Ошибка! Введите корректное шестизначное число.");
        }
    
        }
        char[] digits = hexNumber.toCharArray();
    
        char temp = digits[0];
        digits[0] = digits[5];
        digits[5] = temp;
    
        temp = digits[1];
        digits[1] = digits[4];
        digits[4] = temp;
    
        System.out.println("Измененное число: " + new String(digits));
        scanner.close();
    }
    
    public static void Five() {
        System.out.println("\" Задание 5 \"");
        System.out.println("Определение сезона по номеру месяца.");
        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
        System.out.println("Ошибка! Введите номер от 1 до 12.");
        } else if (month == 12 || month == 1 || month == 2) {
        System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
        System.out.println("Spring");
        } else if (month >= 6 && month <= 8) {
        System.out.println("Summer");
        } else {
        System.out.println("Autumn");
        }
        System.out.println();
    }
    
    public static void Six() {
        System.out.println("\" Задание 6 \"");
        System.out.println("Конвертация метров в мили, дюймы, ярды.");
        int choice;
        do{
        System.out.print("Введите количество метров: ");
        double meters = scanner.nextDouble();
        System.out.println("1 - мили, 2 - дюймы, 3 - ярды, 4 - выход");
        System.out.print("Выберите вариант: ");
        choice = scanner.nextInt();
        switch (choice) {
        case 1 -> System.out.println(meters + " метров = " + meters * 0.000621371 + "миль.");
        case 2 -> System.out.println(meters + " метров = " + meters * 39.3701 + "дюймов.");
        case 3 -> System.out.println(meters + " метров = " + meters * 1.09361 + "ярдов.");
        case 4 -> System.out.println("Вы вышли");
        default -> System.out.println("Ошибка! Неверный выбор.");
        }
        System.out.println();
        }while(choice != 4);
    }
    
    public static void Seven() {
        System.out.println("\" Задание 7 \"");
        System.out.println("Вывод всех нечетных чисел в заданном диапазоне.");
        System.out.print("Введите начало диапазона: ");
        int start = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int end = scanner.nextInt();
        if (start > end) {
        int temp = start;
        start = end;
        end = temp;
        System.out.println("Границы нормализованы.");
        }
        for (int i = start; i <= end; i++) {
        if (i % 2 != 0) {
        System.out.print(i + " ");
        }
        }
        System.out.println("\n");
    }
    
    public static void Eight() {
        System.out.println("\" Задание 8 \"");
        System.out.println("Таблица умножения в указанном диапазоне.");
        System.out.print("Введите начало диапазона: ");
        int multStart = scanner.nextInt();
        System.out.print("Введите конец диапазона: ");
        int multEnd = scanner.nextInt();
        for (int i = multStart; i <= multEnd; i++) {
        for (int j = 1; j <= 10; j++) {
        System.out.printf("%d * %d = %d\t", i, j, i * j);
        }
        System.out.println();
        }
        System.out.println();
    }
    
    public static void Nine() {
        System.out.println("\" Задание 9 \"");
        System.out.println("Анализ случайного массива.");
        Random random = new Random();
        int[] array = new int[20];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int posCount = 0, negCount = 0, zeroCount = 0;
        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(21) - 10;
        if (array[i] < min) min = array[i];
        if (array[i] > max) max = array[i];
        if (array[i] > 0) posCount++;
        else if (array[i] < 0) negCount++;
        else zeroCount++;
        }
        System.out.println("Мин: " + min + ", Макс: " + max + ", Положительные: " +
        posCount + ", Отрицательные: " + negCount + ", Нули: " + zeroCount + "\n");
    }
    
    public static void Ten() {
        System.out.println("\" Задание 10 \"");
        System.out.println("Разделение массива на четные, нечетные, положительные,"
        + "отрицательные числа.");
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(21) - 10;
        System.out.print(array[i] + "\t");
        }
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        for (int num : array) {
        if (num % 2 == 0)
        evens.add(num);
        else
        odds.add(num);
        if (num > 0)
        positives.add(num);
        else if (num < 0)
        negatives.add(num);
        }
        System.out.println("\n");
        System.out.println("Четные: " + evens);
        System.out.println("Нечетные: " + odds);
        System.out.println("Положительные: " + positives);
        System.out.println("Отрицательные: " + negatives);
    
        scanner.close();
    }

    public static void Eleven() {
        System.out.println("\" Задание 11 \"");
        System.out.print("Введите длину линии: ");
        int length = scanner.nextInt();
        System.out.print("Введите направление (h - горизонтальная, v - вертикальная):");
        char direction = scanner.next().charAt(0);
        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);
        drawLine(length, direction, symbol);

        System.out.println("\n\" Задание 12 \"");
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array2 = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.print("Выберите порядок сортировки (asc - по возрастанию, desc - по убыванию): ");
        String order = scanner.next();
        sortArray(array2, order);

        System.out.println("Отсортированный массив: " + Arrays.toString(array2));

        scanner.close();
    }

    // Метод для рисования линии
    public static void drawLine(int length, char direction, char symbol) {
        if (direction == 'h') {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction == 'v') {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Ошибка! Неверное направление.");
        }
    }

    // Метод для сортировки массива
    public static void sortArray(int[] array, String order) {
        if (order.equals("asc")) {
            Arrays.sort(array); // Сортировка по возрастанию
        } else if (order.equals("desc")) {
            Arrays.sort(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        } else {
            System.out.println("Ошибка! Неверный порядок сортировки.");
        }
    }
}