package oop.interfaces.print;

public interface Printable {
    void print();

    default void defaultPrint() {
        System.out.println("Undefined printable");
    }

    static void read() {
        System.out.println("Read printable");
    }
}
