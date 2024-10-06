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

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();


        if (isValidLastName(lastName)) {
            System.out.println("Valid last name.");
        } else {
            System.out.println("Invalid last name. Start with a capital letter and have at least 3 characters.");
        }


        System.out.print("Enter your email: ");
        String email = scanner.nextLine();


        if (isValidEmail(email)) {
            System.out.println("Valid email.");
        } else {
            System.out.println("Invalid email. It must follow the format abc.xyz@bl.co.in.");
        }

        scanner.close();
    }

    public static boolean isValidFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return firstName.matches(regex);
    }

    public static boolean isValidLastName(String lastName) {
        String regex = "^[A-Z][a-z]{2,}$";
        return lastName.matches(regex);
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return email.matches(regex);
    }
}