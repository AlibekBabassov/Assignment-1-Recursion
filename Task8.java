import java.util.Scanner;

public class Task8 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        char c = s.charAt(index);
        if (!Character.isDigit(c)) {
            return false;
        }
        return isDigits(s, index + 1);
    }
}
