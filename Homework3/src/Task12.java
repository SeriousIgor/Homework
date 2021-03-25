import java.util.Random;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        int n, sum = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите N");
        n = scanner.nextInt();

        int[] simpleArray = new int[n];

        System.out.println("Random array: ");
        for (int i = 0; i < n; i++){
            simpleArray[i] = random.nextInt(100);
            sum += simpleArray[i];
            System.out.print(simpleArray[i] + " ");
        }

        System.out.println();
        System.out.println("Среднее арифметическое всех элементов : " + ((double)sum/n) );
    }
}
