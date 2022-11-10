package oop.stat;


public class StaticMain {
    public static void main(String[] args) {
        //кол-во объектов 0 - еще не создавали
        System.out.println(Person.getPersonCount());
        Person person = new Person("Volodymyr", "Oleksandrovich", "Rudenko");
        //кол-во объектов 1
        System.out.println(person.getPersonCount());
        String fio = Person.getFio(person);
        System.out.println(fio);
        Person person2 = new Person("Oleg", "Oleksandrovich", "Kotenko");
        Person person3 = new Person("Maria", "Olegiva", "Bilokon");
        Person person4 = new Person("Svitlana", "Ihorivna", "Didenko");
        //количество одинаковое для любого экземпляра - оно относится не к экземплярам, а к классу
        System.out.println(person.getPersonCount());
        System.out.println(person2.getPersonCount());
        System.out.println(person3.getPersonCount());
        System.out.println(person4.getPersonCount());

        System.out.println(PersonChild.i);
        //при обращении к статическому методу, который объявлен как в родительском, так и в дочернем классе,
        // во время компиляции всегда будет вызван метод исходя из типа переменной
        Person child = new PersonChild("Nina", "Volodymirivna", "Husak");
        //PersonChild child = new PersonChild("Nina", "Volodymirivna", "Husak");
        System.out.println(child.getFio(child));

        //Static вложенные классы
        Person.Pet pet;
        //Child.Pet childPet; //ОШИБКА
    }
}
