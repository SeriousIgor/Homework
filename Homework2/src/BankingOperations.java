import java.util.Scanner;

public class BankingOperations {
    public static void main(String[] args) {
        double deposit;
        int depositPercentYear;
        double depositPercentMonth;
        int year;
        int month;

        Scanner scanner;
        System.out.println("Введите сумму вклада:");
        scanner = new Scanner(System.in);
        deposit = scanner.nextDouble();
        System.out.println("Введите процент депозита:");
        scanner = new Scanner(System.in);
        depositPercentYear = scanner.nextInt();
        System.out.println("Введите срок вклада (год):");
        scanner = new Scanner(System.in);
        year = scanner.nextInt();

        month = year * 12;
        depositPercentMonth = (double)depositPercentYear / 12;

        for(int i = 0; i < month; i++){                         //Подсчёт итоговой суммы
            deposit += deposit * depositPercentMonth / 100;
        }
        System.out.println("Итоговая сумма : " + deposit);
    }
}
