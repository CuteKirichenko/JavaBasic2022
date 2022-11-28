package oop.constructor.inheritance;

public class ChildOfChild extends Child {

    public ChildOfChild() {
        System.out.println("Child of child empty constructor");
    }

    public ChildOfChild(String school) {
        super(school);
        System.out.println("Child of child constructor with school");
    }

    public ChildOfChild(String name, int age, String school) {
        super(name, age, school);
        System.out.println("Child of child constructor with all params");
    }
}
