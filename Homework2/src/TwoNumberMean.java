public class TwoNumberMean {
    public static void main(String[] args){
        int fNumber = Integer.valueOf(args[0]); //first number
        int sNumber = Integer.valueOf(args[1]); //second number
        int mean = (fNumber + sNumber) / 2; //mean of 2 numbers
        System.out.println("Первое число - " + fNumber);
        System.out.println("Второе число - " + sNumber);
        System.out.println("Среднее значение двух чисел - " + mean);
    }
}
