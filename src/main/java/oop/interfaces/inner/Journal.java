package oop.interfaces.inner;

public class Journal implements Printer.Printable {
    private final String name;

    String getName() {
        return name;
    }

    Journal(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
