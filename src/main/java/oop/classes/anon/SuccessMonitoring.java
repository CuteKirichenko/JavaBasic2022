package oop.classes.anon;

/**
 * Реализация интерфейса Monitoring для статуса Success
 */
public class SuccessMonitoring implements Monitoring {
    @Override
    public void printStatus() {
        System.out.println(SIGN);
        System.out.println("SUCCESS");
    }
}
