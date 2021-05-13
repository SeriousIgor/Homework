import java.util.Scanner;

public class PseudographicsRun {
    public static void main(String[] args) {
        Pseudographics pg = new Pseudographics();
        String sequence;
        while(true) {
            System.out.println("Write sequence of numbers: ");
            sequence = new Scanner(System.in).nextLine();
            try {
                Integer.parseInt(sequence);
            } catch (NumberFormatException ignored){
                System.out.println("Number is invalid");
                continue;
            }
            break;
        }
        pg.getSymbols(sequence);
        pg.printSymbols();
    }
}
