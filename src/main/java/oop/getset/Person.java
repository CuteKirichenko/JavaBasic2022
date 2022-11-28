package oop.getset;

public class Person {
    private String firstName;
    private String middleName;
    private String secondName;
    private int age;
    private boolean isAdult;

    public Person(String firstName, String middleName, String secondName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.secondName = secondName;
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

    public boolean isAdult() {
        return isAdult;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
            this.isAdult = this.age >= 18;
        }
    }

    public String getFio() {
        return String.format("%s %s %s", this.firstName, this.middleName, this.secondName);
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
}
