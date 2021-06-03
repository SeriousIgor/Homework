public class ATMRun {
    public static void main(String[] args) {
        ATMIn in = new ATMIn();
        ATMOut out = new ATMOut();

        in.start();
        out.start();
    }
}
