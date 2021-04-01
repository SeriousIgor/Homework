public class StudentDemo {
    public static void main(String[] args) {
        //Filter criterion
        String faculty = "Engineering";
        String groupName = "AC-171";
        int birthYear = 2000;

        Student[] group = new Student[10];          //Studet array

        Student ihor = new Student();               //Example with empty constructor

        group[0] = ihor;
        group[1] = new Student();
                                                    //Full constructor
        group[2] = new Student(1, "Alexeenko", "Oleg", "Alexandrovich", 2000,
                "Odessa, Pushkin st. 7", "+380997785211", "Programming", 3, "AK-171");
        group[3] = new Student(2, "Ivanov", "Ivan", "Ivanovich", 1999,
                "Odessa, Pushkin st. 17", "+380951234532", "Programming", 3, "AC-171");
        group[4] = new Student(3, "Kislov", "Dmytro", "Olekseevich", 2000,
                "Odessa, Pushkin st. 17", "+380951234532", "Engineering", 3, "AC-171");
        group[5] = new Student(4, "Nelepa", "Dmytro", "Ivanovich", 1999,
                "Odessa, Pushkin st. 17", "+380951234532", "Engineering", 3, "AC-171");
        group[6] = new Student(5, "Nevmerzhicka", "Kate", "Olegovna", 2000,
                "Odessa, Pushkin st. 17", "+380951234532", "Engineering", 3, "AK-171");
                                                    //Partial constructor
        group[7] = new Student(6, "Molokus", "Andrew", "Miroslavovych", 2);
        group[8] = new Student(7, "Baldykin", "Denys", "Evgenievich", 2);
        group[9] = new Student(8, "Krichil", "Edvard", "Victorovich", 2);

        //Full group output
        System.out.println("Full group:");
        for (Student s : group){
            System.out.println(s.toString());
        }
        System.out.println();

        //Adjusted Faculty students
        System.out.println("Engineering faculty students:");
        for (Student s : group){
            if(s.getFaculty() == faculty) {
                System.out.println(s.toString());
            }
        }
        System.out.println();

        //Adjusted Faculty & Course students
        System.out.println("Engineering faculty and AC-171 group students:");
        for (Student s : group){
            if((s.getFaculty() == faculty)&&(s.getGroup()==groupName)) {
                System.out.println(s.toString());
            }
        }
        System.out.println();

        //Adjusted Birth Year students
        System.out.println("Born in 2000 students:");
        for (Student s : group){
            if((s.getBirthYear() == birthYear)) {
                System.out.println(s.toString());
            }
        }
        System.out.println();

        //Adjusted Group students
        System.out.println("AC-171 group students:");
        for (Student s : group){
            if((s.getGroup() == groupName)) {
                System.out.println(s.toString());
            }
        }
        System.out.println();
    }
}
