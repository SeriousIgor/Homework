import java.sql.*;
import java.util.Scanner;

public class DbOperations implements iOperations {
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String connectionString = "jdbc:mysql://localhost:3306/hillellearn";
    private final String login = "root";
    private final String password = "root";
    Connection connection = null;
    Statement statement = null;

    public DbOperations(){
        try{
            Class.forName(driverName);
        }
        catch (ClassNotFoundException ex){
            System.out.println("Can't get class. No driver found.");
            ex.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection(connectionString, login, password);
            statement = connection.createStatement();
        }
        catch (SQLException sqlException){
            System.out.println("Can't get connection. Incorrect URl/login/password");
            sqlException.printStackTrace();
        }
    }

    @Override
    public void deleteRecord(int id) throws SQLException {
        String sqlQuery = "UPDATE `students` SET `is_deleted` = 1 WHERE id_student = " + id + " ;";

        statement.executeUpdate(sqlQuery);
    }

    @Override
    public void addRecord() throws SQLException {
        int id, id_group;
        String fio, admYear;
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Enter data:");

        System.out.print("Student id: ");
        while(true) {
            try {
                id = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Enter a number");
                continue;
            }
        }

        System.out.print("Student FIO: ");
        fio = scanner.next();

        System.out.print("Student group: ");
        while(true) {
            try {
                id_group = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Enter a number");
                continue;
            }
        }

        System.out.print("Year of admission: ");
        admYear = scanner.next();

        String sqlQuery = "INSERT INTO `students` (`id_student`, `fio`, `id_group`, `admission_year`) VALUES ('"
                + id + "', '"
                + fio + "', '"
                + id_group  + "', '"
                + admYear  + "') ;";

        statement.executeUpdate(sqlQuery);
    }

    @Override
    public void selectAllRecords() throws SQLException {
        String sqlQuery = "SELECT `id_student`, `fio`, `id_group`, `admission_year` FROM `students` WHERE is_deleted = 0;";

        ResultSet rs = statement.executeQuery(sqlQuery);
        while (rs.next()){
            System.out.print("ID_Student: " + rs.getInt(1) + " | ");
            System.out.print("FIO: " + rs.getString(2) + " | ");
            System.out.print("ID_Group: " + rs.getInt(3) + " | ");
            System.out.println("Admission_year: " + rs.getString(4) + " | ");
        }
        rs.close();
        System.out.println();
    }

    @Override
    public void getStudent(int id) throws SQLException {
        String sqlQuery = "SELECT * FROM `students` WHERE `id_student` = " +
                id + " ;";
        ResultSet rs = statement.executeQuery(sqlQuery);
        if(rs == null){
            System.out.println("Record doesn't exist.");
        }
        else{
            while (rs.next()){
                System.out.print("ID_Student: " + rs.getInt(1) + " | ");
                System.out.print("FIO: " + rs.getString(2) + " | ");
                System.out.print("ID_Group: " + rs.getInt(3) + " | ");
                System.out.print("Admission_year: " + rs.getString(4) + " | ");
                System.out.println("Is deleted: " + rs.getInt(5) + " | ");
            }
        }
        rs.close();
        System.out.println();
    }

    @Override
    public void getStudent(String fio) throws SQLException {
        String sqlQuery = "SELECT * FROM `students` WHERE `fio` = '" +
                fio + "' ;";
        ResultSet rs = statement.executeQuery(sqlQuery);
        if(rs == null){
            System.out.println("Record doesn't exist.");
        }
        else{
            while (rs.next()){
                System.out.print("ID_Student: " + rs.getInt(1) + " | ");
                System.out.print("FIO: " + rs.getString(2) + " | ");
                System.out.print("ID_Group: " + rs.getInt(3) + " | ");
                System.out.print("Admission_year: " + rs.getString(4) + " | ");
                System.out.println("Is deleted: " + rs.getInt(5) + " | ");
            }
        }
        rs.close();
        System.out.println();
    }
}
