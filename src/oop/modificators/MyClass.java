package oop.modificators;

public class MyClass {

    //Любой модификатор доступа - для вложенных классов будет видно все равно
    public static int one = 1;
    public String name;

    private int secret = 12345678;

    protected int code = 1111;

    String suffix = "-default";

    //Финальный метод
    public final void myFinalMethod() {

    }
}
