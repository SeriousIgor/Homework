import org.hibernate.Session;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.query.Query;

import javax.persistence.PersistenceException;
import java.util.List;
import java.util.Scanner;

public class DbOperations implements iOperations {
    Session session;

    public DbOperations(){
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
    }

    @Override
    public void deleteRecord(int id) {
        Query query = session.createQuery("SELECT s FROM Student s where s.id_student =:id");
        query.setParameter("id", id);
        Student student = (Student) query.uniqueResult();
        if(student.getIs_deleted() == 0){
            student.setIs_deleted(1);
            session.save(student);
            session.getTransaction().commit();
        }
        else{
            System.out.println("Student already deleted.");
        }
    }

    @Override
    public void addRecord() {
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

        Student student = new Student();
        student.setId_student(id);
        student.setFio(fio);
        student.setId_group(id_group);
        student.setAdmission_year(admYear);

        try {
            session.save(student);
            session.getTransaction().commit();
        }
        catch (PersistenceException ex){
            ex.printStackTrace();
        }

    }

    @Override
    public void selectAllRecords() {
        Query q = session.createQuery("From Student s where s.is_deleted =:value");
        q.setParameter("value", 0);
        List<Student> studentList = q.list();
        System.out.println("Amount of students :" + studentList.size());
        for(Student s : studentList){
            System.out.println(s);
        }
    }

    @Override
    public void getStudent(int id) {
        Query query = session.createQuery("SELECT s FROM Student s where s.id_student =:id");
        query.setParameter("id", id);
        Student student = (Student) query.uniqueResult();
        System.out.println(student);
    }

    @Override
    public void getStudent(String fio) {
        Query query = session.createQuery("SELECT s FROM Student s where s.fio =:fio");
        query.setParameter("fio", fio);
        Student student = (Student) query.uniqueResult();
        System.out.println(student);

    }
}
