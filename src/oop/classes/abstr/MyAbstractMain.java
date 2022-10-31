package oop.classes.abstr;

public class MyAbstractMain {

    public static void main(String[] args) {
        //MyAbstractClass myAbstractClass = new MyAbstractClass();

        MyAbstractClass one = new MyAbstractChildOne();
        one.sayHello();
        one.sound();
        MyAbstractClass two = new MyAbstractChildTwo();
        two.sayHello();
        two.sound();
    }
}
