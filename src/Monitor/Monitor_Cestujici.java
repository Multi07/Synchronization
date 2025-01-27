package Monitor;

public class Monitor_Cestujici extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            Monitor_AirportTerminal.pridatDoPocitadla();
        }

    }
}
