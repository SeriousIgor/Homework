import java.util.Random;

public class ATMOut extends Thread {
    @Override
    public void run() {
        Thread.currentThread().setName("Getting money from ATM");
        Random random = new Random();
        int value = 0;
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(2000);
                value = random.nextInt(10000);
                System.out.println("Thread name >> " + currentThread().getName());
                ATMInteraction.getMoney(value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
        }
    }
}
