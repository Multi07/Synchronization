package Monitor;
import java.util.ArrayList;

public class Monitor_main {
    public static void main(String[] args) throws InterruptedException {
        Monitor_AirportTerminal terminal = new Monitor_AirportTerminal();
        ArrayList<Thread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Thread(new Monitor_Cestujici()));
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
