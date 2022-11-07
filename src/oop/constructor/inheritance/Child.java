package oop.constructor.inheritance;

public class Child extends Parent {

    static int staticNumber = 999;
    String school;

    public Child() {
        System.out.println("Child empty constructor");
    }

    public Child(String school) {
        System.out.println("Child constructor with school");
        this.school = school;
    }

    public Child(String name, int age, String school) {
        super(name, age);
        System.out.println("Parent constructor finished");
        System.out.println("Static number: " + staticNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("School: " + this.school);

        //работает конструктор
        System.out.println("Child constructor with parameters");
        this.school = school;
        System.out.println("School: " + this.school);
    }
}
