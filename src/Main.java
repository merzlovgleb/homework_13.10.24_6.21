import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // а) Поиск первого числа Фибоначчи больше n
        System.out.print("Введите значение n (n > 1): ");
        int n = scanner.nextInt();

        int a = 1, b = 1;
        while (b <= n) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println("Первое число Фибоначчи больше " + n + ": " + b);

        // б) Сумма чисел Фибоначчи, не превосходящих 1000
        a = 1;
        b = 1;
        int sum = a; // начинаем с первого числа

        while (b <= 1000) {
            if (b <= 1000) {
                sum += b;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println("Сумма чисел Фибоначчи, не превосходящих 1000: " + sum);
    }
}

