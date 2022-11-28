package oop.constructor;

import oop.constructor.inheritance.Child;
import oop.constructor.inheritance.ChildOfChild;
import oop.constructor.inheritance.Parent;

import java.time.LocalDateTime;

public class ConstructorMain {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.create);

        Person person1 = new Person("Ivan", "Ivanov", 18);
        System.out.println(person1.age);

        Person person2 = new Person("Ivan", "Ivanov", 18, false, true, LocalDateTime.now());
        System.out.println(person2.create);

        Person personCopy2 = new Person(person2);
        System.out.println(personCopy2);

        //наследование
        Parent parent = new Parent();
        System.out.println("-----------------------------------------------");
        Parent parent1 = new Parent("Sergiy", 45);
        System.out.println("-----------------------------------------------");


        Child child = new Child();
        System.out.println("-----------------------------------------------");
        Child child1 = new Child("School 1");
        System.out.println("-----------------------------------------------");
        Child child2 = new Child("Olena", 14, "School 1");
        System.out.println("-----------------------------------------------");


        ChildOfChild childOfChild = new ChildOfChild();
        System.out.println("-----------------------------------------------");
        ChildOfChild childOfChild1 = new ChildOfChild("School 13");
        System.out.println("-----------------------------------------------");
        ChildOfChild childOfChild2 = new ChildOfChild("Oleh", 3, "School 13");
        System.out.println("-----------------------------------------------");

        Child childCreation = new Child("Olena", 14, "School 1");
        System.out.println(childCreation);

        //instanceOf
        System.out.println("instanceOf");
        System.out.println("-----------------------------------------------");

        Integer number = new Integer(22);
        System.out.println(number instanceof Integer);
        //System.out.println(number instanceof String);// ошибка!

        System.out.println(childOfChild instanceof Child);
        System.out.println(childOfChild instanceof Parent);
        System.out.println(childOfChild instanceof ChildOfChild);
    }
}
