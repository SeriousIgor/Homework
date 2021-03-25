import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n, outNumber = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            outNumber *= i;
        }
        System.out.println("Факториал от " + n + " = " + outNumber);

    }
}
