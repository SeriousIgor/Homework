import java.util.Scanner;

public class SquareEquation {
    public static void main(String[] args) {

        double a, b, c;

        double x1, x2;

        System.out.println("Enter a, b, c");

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        System.out.print("Your equation: ");
        System.out.format("%sx^2 + (%sx) + %s", a, b, c);

        System.out.println();

        double dis = b*b - 4*a*c;

        if(dis < 0) {
            x1 = x2 = 0;
        }
        else if(dis == 0){
            x1 = x2 = (-b)/(2*a);
        }
        else {
            x1 = ((-b) + Math.sqrt(dis)) / (2 * a);
            x2 = ((-b) - Math.sqrt(dis)) / (2 * a);
        }
        System.out.format("x1 = %s\nx2 = %s",x1, x2);

    }
}
