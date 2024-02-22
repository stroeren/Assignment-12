import java.util.Scanner;

public class Assignment12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.length() > 16) {
            return false;
        }

        int countValidCategories = 0;

        if (password.matches(".*[a-z].*")) {
            countValidCategories++;
        }

        if (password.matches(".*[A-Z].*")) {
            countValidCategories++;
        }

        if (password.matches(".*[0-9].*")) {
            countValidCategories++;
        }

        if (password.matches(".*[~!@#\\$%^&*()\\-=_+].*")) {
            countValidCategories++;
        }

        return countValidCategories >= 3;
    }
}
