import java.util.Scanner;

public class Task9 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(count(s));
    }

    public static int count(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        return 1 + count(s.substring(1));
    }
}
