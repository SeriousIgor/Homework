import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int n, min, max, minIndex, maxIndex;
        int buf;

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
        max = simpleArray[0];
        minIndex = maxIndex = 0;

        for(int i = 1; i < n; i++){                         //Определение минимального и максимального элемента,
            if (min > simpleArray[i]){                      //а также их индексов
                min = simpleArray[i];
                minIndex = i;
            } else if(max < simpleArray[i]){
                max = simpleArray[i];
                maxIndex = i;
            }
        }
                                                            //Замента минимального и максимального элементов
        buf = simpleArray[maxIndex];
        simpleArray[maxIndex] = simpleArray[minIndex];
        simpleArray[minIndex] = buf;

        System.out.println("Вывод изменённого массива");
        for (int i = 0; i < n; i++)
            System.out.print(simpleArray[i] + " ");
    }
}
