package oop.enumeration;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------");
        System.out.println(Day.MONDAY);
        System.out.println("-------------------------------------------------------------------");

        Day current = Day.THURSDAY;
        System.out.println(current);
        System.out.println("-------------------------------------------------------------------");

        Book book = new Book("Harry Potter", "Joanne Rowling", BookType.PHANTASY);

        switch (book.getType()) {
            case NOVEL:
                System.out.println("Novel");
                break;
            case SCIENCE:
                System.out.println("Science");
                break;
            case SCIENCE_FICTION:
                System.out.println("Science fiction");
                break;
            case PHANTASY:
                System.out.println("Phantasy");
                break;
            default:
                System.out.println("I don't know the type!");
                break;
        }
        System.out.println("-------------------------------------------------------------------");

        //порядковый номер начиная с 0
        System.out.println(BookType.SCIENCE_FICTION.ordinal()); //3
        System.out.println("-------------------------------------------------------------------");

        //возвращает массив из всех хранящихся в Enum значений
        System.out.println(Arrays.toString(BookType.values()));
        System.out.println("-------------------------------------------------------------------");

        //
        System.out.println(BookType.valueOf("NOVEL"));
        //System.out.println(BookType.valueOf("POEM"));
        System.out.println("-------------------------------------------------------------------");

        Operation operation = Operation.SUM;
        System.out.println(operation.action(10, 4));   // 14
        operation = Operation.MULTIPLY;
        System.out.println(operation.action(6, 4));    // 24
        System.out.println("-------------------------------------------------------------------");
        System.out.println(Color.RED.getCode());        // #FF0000
        System.out.println(Color.GREEN.getCode());      // #00FF00
        System.out.println("-------------------------------------------------------------------");

        System.out.println(Currency.NICKLE.value);
        System.out.println("-------------------------------------------------------------------");

        System.out.println(Currency.DIME);
    }
}
