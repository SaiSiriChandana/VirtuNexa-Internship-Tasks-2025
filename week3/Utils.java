import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    public static int getValidatedChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            try {
                System.out.print("Choose (1 or 2): ");
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) break;
                else System.out.println("Invalid input. Enter 1 or 2.");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                scanner.next(); // clear buffer
            }
        }
        return choice;
    }
}
