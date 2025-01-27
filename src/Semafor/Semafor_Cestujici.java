package Semafor;

public class Semafor_Cestujici extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            Semafor_AirportTerminal.pridatDoPocitadla();
        }

    }
}