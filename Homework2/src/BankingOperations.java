import java.util.Scanner;

public class BankingOperations {
    public static void main(String[] args) {
        double deposit = 0, startDeposit = 0;
        int depositPercentYear;
        double depositPercentMonth, accruedPercent;
        int year;

        Scanner scanner;

        System.out.println("Введите сумму вклада:");
        scanner = new Scanner(System.in);
        startDeposit = scanner.nextDouble();
        System.out.println("Введите процент депозита:");
        scanner = new Scanner(System.in);
        depositPercentYear = scanner.nextInt();
        System.out.println("Введите срок вклада (год):");
        scanner = new Scanner(System.in);
        year = scanner.nextInt();

        depositPercentMonth = (double)depositPercentYear / 12;
        deposit = startDeposit;

        for(int i = 0; i < year; i++) {
            for (int j = 0; j < 12; j++) {                                  //Подсчёт итоговой суммы
                deposit += deposit * depositPercentMonth / 100;
            }
            accruedPercent = (((deposit / startDeposit) * 100) - 100);              //Подсчёт насчитанных процентов
            System.out.println("Сумма за " + (i + 1) + "-й год = " + deposit);
            System.out.println("Начислено процентов от начальной суммы: " + accruedPercent);
        }
    }
}
