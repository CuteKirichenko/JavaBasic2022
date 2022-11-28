package oop.constructor.inheritance;

public class Parent {

    static String staticName = "Static name";
    String name;
    int age;

    public Parent() {
        System.out.println("Parent empty constructor");
    }

    public Parent(String name, int age) {
        System.out.println("Static name: " + staticName);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Child static number: " + Child.staticNumber);

        //работает конструктор
        System.out.println("Parent constructor with parameters");
        this.name = name;
        this.age = age;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
