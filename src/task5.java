import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        String firstString = scanner.nextLine();

        System.out.println("Введіть другий рядок:");
        String secondString = scanner.nextLine();

        // Визначення рядка з більшою кількістю символів
        if (firstString.length() > secondString.length()) {
            System.out.println("Перший рядок має більше символів.");
        } else if (firstString.length() < secondString.length()) {
            System.out.println("Другий рядок має більше символів.");
        } else {
            System.out.println("Рядки мають однакову кількість символів.");
        }

        scanner.close();
    }
}
