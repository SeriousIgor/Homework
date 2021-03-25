import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int n, min;

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
        min = simpleArray[0];                               //Инициализация стартовым значением

        for(int i = 1; i < n; i++){                         //Определение минимального элемента
            if (min > simpleArray[i]){
                min = simpleArray[i];
            }
        }

        System.out.print("Минимальный элемент : " + min + " находится в таких ячейках массива : ");
        for(int i = 0; i < n; i++){                         //Вывод нескольких минимальных элементов
            if (min == simpleArray[i])
                System.out.print(i + ", ");
        }
    }
}
