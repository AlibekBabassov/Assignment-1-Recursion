import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int total = sum(n, scanner);
        double average = (double) total / n;
        System.out.println(average);
    }

    public static int sum(int n, Scanner scanner) {
        if (n == 0) {
            return 0;
        }
        int x = scanner.nextInt();
        return x + sum(n - 1, scanner);
    }
}
