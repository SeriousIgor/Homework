import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        //Объявление переменных
        int numberForGuess, yourNumber;
        int range;
        boolean found = false;

        //Вызов экземпляров классов Java.util
        Scanner scanner = new Scanner(System.in);
        final Random random = new Random();

        System.out.println("Введите максимально возможный размер случайного числа");

        range = scanner.nextInt();
        numberForGuess = random.nextInt(range);

        while (!found){
            System.out.println("Отгадайте число: ");
            yourNumber = scanner.nextInt();
            if (yourNumber == numberForGuess){
                found = true;
                System.out.println("Вы угадали!");
            }
            else if(yourNumber < numberForGuess){
                System.out.println("Ваше число меньше загаданного");
            } else{
                System.out.println("Ваше число больше загаданного");
            }
        }
    }
}
