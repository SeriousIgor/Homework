public class Task8 {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        int[] oddNumbers = new int[10];
        while (count != oddNumbers.length) {
            i++;
            if(i%2 != 0){
                oddNumbers[count] = i;
                count++;
            }
        }
        for (int j = 0; j < oddNumbers.length; j++){
            System.out.print(oddNumbers[j]);
            if(j != oddNumbers.length-1)                //Элемент красивого оформления интерфейса - если
                System.out.print(", ");                 //последний элемент, запятой после него не будет.
        }
    }
}
