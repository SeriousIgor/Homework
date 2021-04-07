public class PhoneDemo {
    public static void main(String[] args) {
        PhoneFilter phoneFilter = new PhoneFilter();
        Phone[] phoneMembers = new Phone[17];

        Phone member1 = new Phone(16, 432138, 3123139, 4220, 3300, 89.3, 65, 2122, "kkkk", "Ivan", "Ivanych");
        Phone member2 = new Phone(17, 432138, 3123140, 4220, 3300, 89.3, 65, 2121, "jjjj", "Ivan", "Ivanych");
        Phone member3 = new Phone(1, 432123, 3123124, 450, 500, 25.5, 0, 2501, "Ivanoq", "Ivan", "Ivanych");
        Phone member4 = new Phone(2, 432124, 3123125, 300, 300, 27.5, 63, 2505, "Ivanow", "Ivan", "Ivanych");
        Phone member5 = new Phone(3, 432125, 3123126, 600, 500, 45.5, 53, 2502, "Ivanoa", "Ivan", "Ivanych");
        Phone member6 = new Phone(4, 432126, 3123127, 200, 300, 25.5, 43, 2530, "Ivanko", "Ivan", "Ivanych");
        Phone member7 = new Phone(5, 432127, 3123128, 1200, 2300, 35.5, 50, 2000, "Petrenchuk", "Ivan", "Ivanych");
        Phone member8 = new Phone(6, 432128, 3123129, 6200, 2300, 45.0, 10, 2010, "Petrenok", "Iwan", "Ivanych");
        Phone member9 = new Phone(7, 432129, 3123130, 2030, 3010, 55.0, 0, 2020, "Petrenko", "Ifan", "Ivanych");
        Phone member10 = new Phone(8, 432130, 3123131, 2020, 3010, 65.75, 30, 2300, "Petrenk", "Ivan", "Ivanych");
        Phone member11 = new Phone(9, 432131, 3123132, 2300, 3600, 75.75, 0, 2040, "Petren", "Ivan", "Ivanych");
        Phone member12 = new Phone(10, 432132, 3123133, 2200, 3080, 85.25, 50, 2060, "Petre", "Ivan", "Ivanych");
        Phone member13 = new Phone(11, 432133, 3123134, 2110, 300, 90.25, 60, 2050, "Pet", "Ivan", "Ivanych");
        Phone member14 = new Phone(12, 432134, 3123135, 2030, 320, 15.15, 70, 2070, "Petr", "Ivan", "Ivanych");
        Phone member15 = new Phone(13, 432135, 3123136, 2220, 360, 44.3, 45, 2120, "Pe", "Ivan", "Ivanych");
        Phone member16 = new Phone(14, 432136, 3123137, 1220, 1300, 77.3, 0, 3191, "P", "Ivan", "Ivanych");
        Phone member17 = new Phone(15, 432137, 3123138, 4220, 3300, 89.3, 65, 1122, "Iiiiiii", "Ivan", "Ivanych");

        phoneMembers[0] = member1; phoneMembers[1] = member2; phoneMembers[2] = member3; phoneMembers[3] = member4;
        phoneMembers[4] = member5; phoneMembers[5] = member6; phoneMembers[6] = member7; phoneMembers[7] = member8;
        phoneMembers[8] = member9; phoneMembers[9] = member10; phoneMembers[10] = member11; phoneMembers[11] = member12;
        phoneMembers[12] = member13; phoneMembers[13] = member14; phoneMembers[14] = member15; phoneMembers[15] = member16;
        phoneMembers[16] = member17;

        System.out.println("Абоненты, у которых кол-во минут по вутригородней связи превышает 50 :");
        phoneFilter.exceedsTime(phoneMembers, 50);
        System.out.println();

        System.out.println("Абоненты, сортированные по фамилии :");
        phoneFilter.alphabetList(phoneMembers);
        System.out.println();

        System.out.println("Абоненты, которые пользовались межгородом :");
        phoneFilter.usingOuterConnection(phoneMembers);
        System.out.println();

        System.out.println("Топ 10 абонентов-пользователей интернета");
        phoneFilter.theBiggestTrafficUsers(phoneMembers);
        System.out.println();

    }
}
