package homeworks.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(person.personInfo("Jackie", "Chan ", "Shanghai", "12312412412"));
        System.out.println(person.personInfo("Sherlock", "Holmes", "London ", "37742123513"));
    }
}
