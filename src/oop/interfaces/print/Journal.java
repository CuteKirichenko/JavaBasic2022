package oop.interfaces.print;

public class Journal implements Printable {
    private final String name;

    String getName() {
        return name;
    }

    public Journal(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }
}
