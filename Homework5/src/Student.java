public class Student {
    private int id, birthYear, course;
    private String surname, name, patronymic;               //Personal info
    private String address, phoneNumber, faculty, group;    //Secondary info

    //Constructors

    public Student(int id, String surname, String name, String patronymic, int birthYear,           //Full constructor
                   String address, String phoneNumber, String faculty, int course, String group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String surname, String name, String patronymic, int birthYear){        //Partial constructor
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
    }

    public Student(){

    }

    //Methods

    //Override

    @Override
    public String toString(){
        return "ID: " + id + ", Surname: " + surname + ", Name: " + name + ", Patronymic: "
                + patronymic + ", Birth Year: " + birthYear + ", Address: " + address + ", Phone Number:"
                + phoneNumber + ", Faculty: " + faculty + ", Course: " + course + ", Group: " + group + ".";
    }

    //Getters & Setters

    public int getId() {                        //id
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthYear() {                 //birthYear
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getCourse() {                    //course
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSurname() {                //surname
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {                   //name
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {             //patronymic
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {                //address
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {            //phoneNumber
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {                //faculty
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {                  //group
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}