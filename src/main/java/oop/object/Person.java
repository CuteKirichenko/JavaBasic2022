package oop.object;

import java.util.Objects;

public class Person {
    public int age;
    public String name;
    public boolean isMarried;


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && isMarried == person.isMarried && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, isMarried);
    }

        @Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", isMarried=" + isMarried +
                    '}';
        }

    public class Education {
        int years;
        String university;
    }

    public class Experience {
        int years;
        String work;
    }
}
