package oop.interfaces.print;

/**
 * Interface for ...
 */
public interface Repository {

    void write(String text);

    String read();

    boolean update(String newText);

    boolean delete(int code);

}
