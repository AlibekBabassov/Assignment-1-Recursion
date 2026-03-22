import java.util.Scanner;

public class Task7 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        reverse(n, scanner);
    }

    public static void reverse(int n, Scanner scanner) {
        if (n == 0) {
            return;
        }
        int x = scanner.nextInt();
        reverse(n - 1, scanner);
        System.out.print(x + " ");
    }
}
