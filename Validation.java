import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        if (isValidFirstName(firstName)) {
            System.out.println("Valid first name.");
        } else {
            System.out.println("Invalid first name. Start with a capital letter and have at least 3 characters.");
        }

        scanner.close();
    }

    public static boolean isValidFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return firstName.matches(regex);
    }
}