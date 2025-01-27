import java.util.concurrent.locks.ReentrantLock;

public class Cestujici extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            AirportTerminal.pridatDoPocitadla();
        }

    }
}