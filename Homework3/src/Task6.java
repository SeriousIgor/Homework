public class Task6 {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        while(true){
            count++;
            System.out.println(number);
            number -= 5;
            if(count == 10){
                break;
            }
        }
    }
}
