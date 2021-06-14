import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DbRun {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        DbOperations dbo = new DbOperations();
        int option = 0;
        boolean exit = false;

        System.out.println("Database operations.");

        while(!exit){
            System.out.println("Choose option:" +
                    "\n1 - Delete record by id." +
                    "\n2 - Insert record." +
                    "\n3 - Get all students" +
                    "\n4 - Get student by ID" +
                    "\n5 - Get students by Name" +
                    "\n6 - Quit");

            while(true) {
                try {
                    option = Integer.parseInt(scanner.next());
                    break;
                } catch (NumberFormatException ex) {
                    System.out.println("Enter a number");
                    continue;
                }
            }

            System.out.println();

            switch (option){
                case 1:
                    System.out.print("Enter id: "); dbo.deleteRecord(scanner.nextInt()); break;
                case 2: dbo.addRecord(); break;
                case 3: dbo.selectAllRecords(); break;
                case 4:
                    System.out.print("Enter id: "); dbo.getStudent(scanner.nextInt()); break;
                case 5:
                    System.out.print("Enter name: "); dbo.getStudent(scanner.next()); break;
                case 6: exit = true;
            }
        }
    }
}
