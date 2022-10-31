package oop.classes.anon;

/**
 * Реализация интерфейса Monitoring для статуса Error
 */
public class ErrorMonitoring implements Monitoring {
    @Override
    public void printStatus() {
        //sign = "Not Tetiana Kirichenko";
        System.out.println(SIGN);
        System.out.println("ERROR");
    }
}
