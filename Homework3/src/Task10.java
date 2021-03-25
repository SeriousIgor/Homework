import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        int n, max;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите N");
        n = scanner.nextInt();

        int[] simpleArray = new int[n];                     //Объявление массива из n элементов

        System.out.println("Random array: ");               //Заполнение массива и вывод в консоль
        for (int i = 0; i < n; i++){
            simpleArray[i] = random.nextInt(100);             //заполнение случайными числами
            System.out.print(simpleArray[i] + " ");         //вывод в консоль в строку
        }

        System.out.println();
        max = simpleArray[0];                               //Инициализация стартовым значением

        for(int i = 1; i < n; i++){                         //Определение максимального элемента
            if (max < simpleArray[i]){
                max = simpleArray[i];
            }
        }

        System.out.print("Максимальный элемент - " + max +  " находится в ячейках массива : ");
        for(int i = 0; i < n; i++){                         //Вывод нескольких максимальных элементов
            if (max == simpleArray[i])
                System.out.print(i + ", ");
        }
    }
}
