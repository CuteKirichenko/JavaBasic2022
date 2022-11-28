package oop.interfaces.print;

public interface Printable {
    void print();

    default void defaultPrint() {
        System.out.println("Undefined printable");
    }

 /*   default void defaultPrintPrivatePrefix() {
        System.out.println(getPrivatePrefix() + "Undefined printable");
    }*/

    static void read() {
        System.out.println("Read printable");
    }

    //Java 9+
/*    private String getPrivatePrefix() {
        return "PRIVATE PREFIX-";
    }*/
}
