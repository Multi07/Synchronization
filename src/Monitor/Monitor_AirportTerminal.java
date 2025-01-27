package Monitor;

import java.util.concurrent.locks.ReentrantLock;

public class Monitor_AirportTerminal {
    private static int pocitadloOdbavenychCestujicih;

    public synchronized static void pridatDoPocitadla() {
            pocitadloOdbavenychCestujicih++;
    }

    public int getPocitadloOdbavenychCestujicih() {
        return pocitadloOdbavenychCestujicih;
    }
}
