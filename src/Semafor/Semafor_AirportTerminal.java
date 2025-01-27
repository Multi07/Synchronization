package Semafor;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class Semafor_AirportTerminal {
    static Semaphore semaphore = new Semaphore(3);
    private static int pocitadloOdbavenychCestujicih;
    public static void pridatDoPocitadla() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            System.out.println("Semaphore interrupted");
        }
        try {
            pocitadloOdbavenychCestujicih++;
        } finally {
            semaphore.release();
        }
    }

    public int getPocitadloOdbavenychCestujicih() {
        return pocitadloOdbavenychCestujicih;
    }
}
