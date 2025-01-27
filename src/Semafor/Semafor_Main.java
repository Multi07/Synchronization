package Semafor;

import java.util.ArrayList;

public class Semafor_Main {
    public static void main(String[] args) throws InterruptedException {
        Semafor_AirportTerminal terminal = new Semafor_AirportTerminal();
        ArrayList<Thread> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(new Thread(new Semafor_Cestujici()));
            }
            for (Thread t : list) {
                t.start();
            }
            for (Thread t : list) {
                try {
                    t.join();
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e);
                }
            }
        System.out.println("Celkový počet odbavených cestujících: "+terminal.getPocitadloOdbavenychCestujicih());
    }
}