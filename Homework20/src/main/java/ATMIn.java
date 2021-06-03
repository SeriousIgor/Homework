import java.util.Random;

public class ATMIn extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("Putting money to the ATM");
        Random random = new Random();
        int value = 0;
        for (int i = 0; i < 20; i++) {
            value = random.nextInt(10000);
            try {
                Thread.sleep(2000);
                System.out.println("Thread name >> " + currentThread().getName());
                ATMInteraction.putMoney(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
    }
}

