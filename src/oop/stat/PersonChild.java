package oop.stat;

public class PersonChild extends Person {
    public static int i;

    static {
        i = 9;
    }

    public PersonChild(String firstName, String middleName, String secondName) {
        super(firstName, middleName, secondName);
    }

    public static String getFio(Person person) {
        return "CHILD METHOD - " + person.getSecondName() + " " + person.getFirstName() + " " + person.getMiddleName();
    }
}
