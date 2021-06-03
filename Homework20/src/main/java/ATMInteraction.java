public class ATMInteraction {
    public static void putMoney(int value){
        System.out.println("Put on the account " + value + " grn.");
        UserAccount.debit += value;
        System.out.println("Account balance is " + value + " grn.");
        System.out.println("____________________________");
    }
    public static void getMoney(int value){
        if(UserAccount.debit > value){
            UserAccount.debit -= value;
            System.out.println("Withdrawal from the account " + value + " grn.\nAccount balance is" + value + " grn.");
        }
        else{
            System.out.println("It is impossible to get this amount\nAccount balance is" + value + " grn.");
        }
    }
}
