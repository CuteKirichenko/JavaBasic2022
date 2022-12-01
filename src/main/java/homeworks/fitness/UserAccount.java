package homeworks.fitness;

import java.time.LocalDate;

public class UserAccount {
    private final String name;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private final String email;
    private final String phone;
    private String lastName;
    private int weight;
    private String bloodPressure;
    private int numberOfStepsPerDay;
    private int age;

    public UserAccount(String name,
                       int dayOfBirth,
                       int monthOfBirth,
                       int yearOfBirth,
                       String email,
                       String phone,
                       String lastName,
                       int weight,
                       String bloodPressure,
                       int numberOfStepsPerDay) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phone = phone;
        this.lastName = lastName;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.numberOfStepsPerDay = numberOfStepsPerDay;
        this.age = LocalDate.now().getYear() - yearOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getNumberOfStepsPerDay() {
        return numberOfStepsPerDay;
    }

    public void setNumberOfStepsPerDay(int numberOfStepsPerDay) {
        this.numberOfStepsPerDay = numberOfStepsPerDay;
    }

    public String getDateOfBirth() {
        return String.format("%s.%s.%s", dayOfBirth, monthOfBirth, yearOfBirth);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "UsersAccount{" +
                "name='" + name + '\'' +
                ", date of birth='" + getDateOfBirth() + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight='" + weight + '\'' +
                ", bloodPressure='" + bloodPressure + '\'' +
                ", numberOfStepsPerDay=" + numberOfStepsPerDay +
                ", age=" + age +
                '}';
    }
}
