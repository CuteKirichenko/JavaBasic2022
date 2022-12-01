package oop.getset;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class PersonTest {

    Person person;

    @Before
    public void setUp() {
        //GIVEN
        person = new Person("Olga", "Anatoliivna", "Gusak");
    }

    @Test
    public void setAgeOkAdult() {
        //GIVEN
        int age = 25;
        //WHEN
        person.setAge(age);
        //THEN
        Assert.assertNotEquals(0, person.getAge());
        Assert.assertTrue(person.isAdult());
    }

    @Test
    public void setAgeOkAdult18() {
        //GIVEN
        int age = 18;
        //WHEN
        person.setAge(age);
        //THEN
        Assert.assertNotEquals(0, person.getAge());
        Assert.assertTrue(person.isAdult());
    }

    @Test
    public void setAgeOkChild() {
        int age = 16;
        person.setAge(age);

        Assert.assertNotEquals(0, person.getAge());
        Assert.assertFalse(person.isAdult());
    }

    @Test
    public void setAgeNotOkNegative() {
        int age = -3;
        person.setAge(age);

        Assert.assertEquals(0, person.getAge());
        Assert.assertFalse(person.isAdult());
    }

    @Test
    public void setAgeNotOkMoreThenHumanAge() {
        int age = 233;
        person.setAge(age);

        Assert.assertEquals(0, person.getAge());
        Assert.assertFalse(person.isAdult());
    }

    @Test
    public void getFio() {
        String expectedFio = "Olga Anatoliivna Gusak";
        String actualFio = person.getFio();

        Assert.assertNotNull(actualFio);
        Assert.assertEquals(expectedFio.length(), actualFio.length());
        Assert.assertEquals(expectedFio, actualFio);
    }
}