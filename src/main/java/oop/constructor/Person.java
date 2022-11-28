package oop.constructor;

import java.time.LocalDateTime;

public class Person {
    String firstName;
    String secondName;
    int age;
    boolean isMarried;
    boolean pets;
    LocalDateTime create;

    //без аргументов
    public Person() {
        create = LocalDateTime.now();
    }

    //передаем необходимые параметры
    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    //передаем все параметры
    public Person(String firstName, String secondName, int age, boolean isMarried, boolean pets, LocalDateTime create) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.isMarried = isMarried;
        this.pets = pets;
        this.create = create;
    }

    //конструктор копирования
    public Person(Person person) {
        firstName = person.firstName;
        secondName = person.secondName;
        age = person.age;
        isMarried = person.isMarried;
        pets = person.pets;
        create = person.create;
    }

    //скомпилируется, но работать не будет - из-за того, что нет this
    public Person(String secondName, int age, LocalDateTime create) {
        secondName = secondName;
        age = age;
        create = create;
    }
}
