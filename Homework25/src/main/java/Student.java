import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Entity
@Table(name = "students")
@Accessors(chain = true)

public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id_student")
    private int id_student;
    @Column(name = "fio")
    private String fio;
    @Column(name = "id_group")
    private int id_group;
    @Column(name = "admission_year")
    private String admission_year;
    @Column(name = "is_deleted")
    private int is_deleted;

    public Student() {

    }

    public Student(int id_student, String fio, int id_group, String admission_year) {
        this.id_student = id_student;
        this.fio = fio;
        this.id_group = id_group;
        this.admission_year = admission_year;
    }

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getId_group() {
        return id_group;
    }

    public void setId_group(int id_group) {
        this.id_group = id_group;
    }

    public String getAdmission_year() {
        return admission_year;
    }

    public void setAdmission_year(String admission_year) {
        this.admission_year = admission_year;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }

    @Override
    public String toString() {
        return  "FIO = " + fio +
                ", ID group = " + id_group +
                ", Admission year = " + admission_year;
    }
}
