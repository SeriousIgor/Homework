import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        number = scanner.nextInt();

        System.out.println("Таблица умножения");
        for(int i = 1; i <= 10; i++)
            System.out.println(number + " * " + i + " = " + (number*i));
    }
}
