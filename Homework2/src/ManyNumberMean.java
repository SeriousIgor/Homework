public class ManyNumberMean {
    public static void main(String[] args) {
        int count = 0; //Counter of elements
        double summa = 0D; //Variable for elements summation
        for (String str : args){
            count++;
            System.out.println("Element №"+ count + " - " + str);
            summa += Integer.valueOf(str);
        }
        double mean = summa / count;
        System.out.println("Среднее значение всех параметров - " + mean);
    }
}
