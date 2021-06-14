/**
 * Хотел сделать StudentDAO, но потом понял, что он в данной задаче необязателен. Остался в качестве заготовки на будущее.
 */

public class Student {
    private int id_student;
    private String fio;
    private int id_group;
    private String admission_year;

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
}
