import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class AirportTerminal {
    static ReentrantLock lock = new ReentrantLock();
    private static int pocitadloOdbavenychCestujicih;
    public static void pridatDoPocitadla() {
        lock.lock();
        try {
            pocitadloOdbavenychCestujicih++;
        }finally {
            lock.unlock();
        }
    }

    public int getPocitadloOdbavenychCestujicih() {
        lock.lock();
        try {
            return pocitadloOdbavenychCestujicih;
        }finally {
            lock.unlock();
        }
    }
}
