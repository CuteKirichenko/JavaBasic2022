package oop.classes.anon;

/**
 * Анонимый класс - пример
 */
public class AnonMain {

    public static void main(String[] args) {
        //1) Интерфейс и три реализации:
        Monitoring success = new SuccessMonitoring();
        Monitoring error = new ErrorMonitoring();
        Monitoring warning = new WarningMonitoring();

        success.printStatus();
        error.printStatus();
        warning.printStatus();

        //2) Анонимные классы:
        Monitoring errorAnon = new Monitoring() {
            @Override
            public void printStatus() {
                System.out.println("ERROR");
            }
        };

        Monitoring successAnon = new Monitoring() {
            @Override
            public void printStatus() {
                System.out.println("SUCCESS");
            }
        };

        Monitoring warningAnon = new Monitoring() {
            @Override
            public void printStatus() {
                System.out.println("WARNING");
            }
        };

        System.out.println(successAnon.SIGN);
        successAnon.printStatus();
        System.out.println(errorAnon.SIGN);
        errorAnon.printStatus();
        System.out.println(warningAnon.SIGN);
        warningAnon.printStatus();
    }
}
