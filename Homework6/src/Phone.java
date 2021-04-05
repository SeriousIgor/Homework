import java.util.Arrays;

public class Phone implements choosingData {
    int id, phoneNumber, cardNumber, debit, credit;
    double intercityTime, outerTime, internetTraffic;
    String surname, name, patronymic;

    //constructors

    public Phone(){

    }

    public Phone(int id, int phoneNumber, int cardNumber, int debit, int credit,
                 double intercityTime, double outerTime, double internetTraffic,
                 String surname, String name, String patronymic){
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.debit = debit;
        this.credit = credit;
        this.intercityTime = intercityTime;
        this.outerTime = outerTime;
        this.internetTraffic = internetTraffic;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Phone(int id, int phoneNumber, int cardNumber, int debit, int credit,
                 String surname, String name, String patronymic){
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.cardNumber = cardNumber;
        this.debit = debit;
        this.credit = credit;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    //Interface methods

    static public void exceedsTime(Phone[] phoneMembers, int n){
            for(Phone p : phoneMembers) {
                try {
                    if (p.intercityTime > n) {
                        System.out.println(p.toString());
                    }
                }
                catch (NullPointerException e){}
                finally {
                    continue;
                }
            }
    }

    static public void alphabetList(Phone[] phoneMembers){
        String[] surnames = new String[phoneMembers.length];
        for(int i = 0; i < phoneMembers.length; i++){
            try {
                surnames[i] = phoneMembers[i].surname;
            }
            catch (NullPointerException e) {}
            finally {
                continue;
            }
        }
        Arrays.sort(surnames);
        for(int i = 0; i < phoneMembers.length; i++){
            try {
                for(Phone p : phoneMembers){
                    if (p.surname.equals(surnames[i])){
                        System.out.println(p.toString());
                    }
                }
            }
            catch (NullPointerException e) {}
            finally {
                continue;
            }
        }
    }

    static public void usingOuterConnection(Phone[] phoneMembers){
        for(Phone p : phoneMembers) {
            try {
                if (p.outerTime != 0) {
                    System.out.println(p.toString());
                }
            }
            catch (NullPointerException e){}
            finally {
                continue;
            }
        }
    }

    static public void theBiggestTrafficUsers(Phone[] phoneMembers){
        double[] internet = new double[phoneMembers.length];
        for(int i = 0; i < phoneMembers.length; i++){
            try {
                internet[i] = phoneMembers[i].internetTraffic;
            }
            catch (NullPointerException e) {}
            finally {
                continue;
            }
        }
        Arrays.sort(internet);
        for(int i = phoneMembers.length-1; i > phoneMembers.length - 11; i--)
        {
            try {
                for(Phone p : phoneMembers){
                    if (p.internetTraffic == internet[i]){
                        System.out.println(p.toString());
                    }
                }
            }
            catch (NullPointerException e) {}
            finally {
                continue;
            }
        }
    }

    //Override

    @Override
    public String toString(){
        return "ID: " + id + ", Surname: " + surname + ", Name: " + name + ", Patronymic: "
                + patronymic + ", Debit: " + debit + ", Credit: " + credit + ", Phone Number:"
                + phoneNumber + ", Card Number: " + cardNumber + ", Intercity Time: " + intercityTime + ", Outer Time: "
                + outerTime + ", Internet Traffic: " + internetTraffic + ".";
    }

    //Getter & Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getIntercityTime() {
        return intercityTime;
    }

    public void setIntercityTime(double intercityTime) {
        this.intercityTime = intercityTime;
    }

    public double getOuterTime() {
        return outerTime;
    }

    public void setOuterTime(double outerTime) {
        this.outerTime = outerTime;
    }

    public double getInternetTraffic() {
        return internetTraffic;
    }

    public void setInternetTraffic(double internetTraffic) {
        this.internetTraffic = internetTraffic;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
