import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int x, n;
        double result = 1.0D;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите x: ");
        x = scanner.nextInt();

        System.out.print("Введите n: ");
        n = scanner.nextInt();


        if (n == 0){
            System.out.println("x = " + result);
        } else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= x;
            }
        } else if (n < 0){
            for (int i = -1; i >= n; i--){
                result /= x;
            }
        }

        System.out.println("x = " + result);
    }
}
