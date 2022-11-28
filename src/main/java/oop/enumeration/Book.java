package oop.enumeration;

public class Book {
    private String name;
    private String writer;
    private BookType type;
    public Book(String name, String writer, BookType type) {
        this.name = name;
        this.writer = writer;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }
}
