package oop.classes.anon;

/**
 * Реализация интерфейса Monitoring для статуса Warning
 */
public class WarningMonitoring implements Monitoring {
    @Override
    public void printStatus() {
        System.out.println(SIGN);
        System.out.println("WARNING");
    }
}
