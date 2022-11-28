package oop.object;

import java.util.Objects;

public class PersonWithoutContract {
    public int age;
    public String name;
    public boolean isMarried;

    //Можно комментировать код и смотреть реультат
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonWithoutContract that = (PersonWithoutContract) o;
        return age == that.age && isMarried == that.isMarried && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, isMarried);
    }
}
