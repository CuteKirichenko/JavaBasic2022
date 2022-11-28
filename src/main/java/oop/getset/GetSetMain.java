package oop.getset;

public class GetSetMain {
    public static void main(String[] args) {
        Person person = new Person("Olga", "Viktorivna", "Kovaluk");
        person.setAge(25);
        System.out.println(person);
        person.setAge(11);
        System.out.println(person);
        person.setAge(1000);
        System.out.println(person);
    }
}
