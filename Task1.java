import java.util.Scanner;

public class Task1 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            n = -n;
        }
        printDigits(n);
    }

    public static void printDigits(int n){
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }
}
