import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три числа:");
        double number1, number2, number3;

        // Перевірка першого числа
        if (scanner.hasNextDouble()) {
            number1 = scanner.nextDouble();
        } else {
            System.out.println("Перше введене значення не є числом.");
            scanner.close();
            return;
        }

        // Перевірка другого числа
        if (scanner.hasNextDouble()) {
            number2 = scanner.nextDouble();
        } else {
            System.out.println("Друге введене значення не є числом.");
            scanner.close();
            return;
        }

        // Перевірка третього числа
        if (scanner.hasNextDouble()) {
            number3 = scanner.nextDouble();
        } else {
            System.out.println("Третє введене значення не є числом.");
            scanner.close();
            return;
        }

        // Знаходження найбільшого числа
        double maxNumber = Math.max(number1, Math.max(number2, number3));

        // Виведення повідомлення про найбільше число
        System.out.println("Найбільше число: " + maxNumber);

        scanner.close();
    }
}
