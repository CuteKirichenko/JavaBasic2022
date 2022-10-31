package oop.classes.simple;

/**
 * Нельзя наследовать файнал классы
 */
public class MySimpleClass /*extends MySimpleFinalClass */ {

    //Любой модификатор доступа - для вложенных классов будет видно все равно (но помним про статику)
    public static int one = 1;
    public String name;

    private int secret = 12345678;

    protected int code = 1111;

    String suffix = "-default";

    //Статический вложенный класс
    static class MyStaticInnerClass {
        static int staticSix = one + 5;
        int six = one + 5;
    }

    //Простой вложенный класс
    class MyInnerClass {
        String innerName = "inner " + name;
        //static int staticSix = one + 5;
        int six = one + 5;
    }

    public void doSmthWithLocalClass() {
        //Локальный класс
        class MyLocalClass {
            String localName = "local " + name;
            //static int staticSix = one + 5;
            int six = one + 5;
        }
    }
}
