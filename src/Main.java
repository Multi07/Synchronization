import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AirportTerminal terminal = new AirportTerminal();
        ArrayList<Thread> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(new Thread(new Cestujici()));
            }
            for (Thread t : list) {
                t.start();
            }
            for (Thread t : list) {
                t.join();
            }
        System.out.println("Celkový počet odbavených cestujících: "+terminal.getPocitadloOdbavenychCestujicih());
    }
}