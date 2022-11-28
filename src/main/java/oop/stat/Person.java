package oop.stat;

public class Person {
    //константа
    public static final int MAX_AGE = 120;
    private String firstName;
    private String middleName;
    private String secondName;
    private int age;
    private boolean isAdult;
    private static long personCount = 0;

    public Person(String firstName, String middleName, String secondName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
        personCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= MAX_AGE) {
            this.age = age;
            this.isAdult = this.age >= 18;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    public static long getPersonCount() {
        return personCount;
    }

    public static String getFio(Person person) {
        return person.getSecondName() + " " + person.getFirstName() + " " + person.getMiddleName();
    }

    //унаследован не может быть, но сам может быть наследником класса (например, Animal) или имплементировать интерфейс
    static class Pet extends Animal {
        String name;
        int age;
    }
}
