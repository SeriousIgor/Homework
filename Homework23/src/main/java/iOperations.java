import java.sql.SQLException;

public interface iOperations {
    void deleteRecord(int id) throws SQLException;
    void addRecord() throws SQLException;
    void selectAllRecords() throws SQLException;
    void getStudent(int id) throws SQLException;
    void getStudent(String fio) throws SQLException;
}
