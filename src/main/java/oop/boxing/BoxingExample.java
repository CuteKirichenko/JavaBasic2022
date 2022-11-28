package oop.boxing;

public class BoxingExample {

    public static void main(String[] args) {

        //Autoboxing/unboxing
        Integer integer = 1;          // autoboxing
        int i = new Integer(1); // unboxing

        Byte b1 = new Byte("42");
        Byte b2 = 42;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println("---------------------------------------");

        Integer i1 = Integer.valueOf("42");
        Integer i2 = Integer.valueOf("42", 10);
        Integer i3 = Integer.valueOf("101010", 2);
        Integer i4 = Integer.valueOf("2A", 16);
        Integer i5 = new Integer("42");
        Integer i6 = 42;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println(i6);
        System.out.println("---------------------------------------");

        Long l1 = new Long("42");
        Long l2 = 42L;
        Long l3 = (long) 42;
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("---------------------------------------");

        //У чисел с точкой есть такие константы:
        //NEGATIVE_INFINITY – отрицательная бесконечность;
        //POSITIVE_INFINITY – положительная бесконечность;
        //NaN – не числовое значение (расшифровывается как Not a Number).
        //Результат умножения бесконечности на ноль - это значение NaN
        float negativeInfinity = Float.NEGATIVE_INFINITY;
        System.out.println(negativeInfinity);
        Float f1 = new Float("3.14f");
        Float f2 = 3.14f;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println("---------------------------------------");

        double positiveInfinity = Double.POSITIVE_INFINITY;
        System.out.println(positiveInfinity);
        double naN = Double.NaN;
        System.out.println(naN);
        Double d1 = new Double("3.14");
        Double d2 = 3.14;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("---------------------------------------");

        Character c1 = 'c';
        System.out.println(c1);
        System.out.println("---------------------------------------");

        Boolean boolean1 = Boolean.TRUE;
        Boolean boolean2 = new Boolean("true");
        Boolean boolean3 = Boolean.valueOf("Some text");
        System.out.println(boolean1);
        System.out.println(boolean2);
        System.out.println(boolean3);
        System.out.println("---------------------------------------");


        int i7 = Integer.parseInt("1000");
        //С l или L в строке - не будет работать
        long l7 = Long.parseLong("1000");
        //С f или F в строке - будет работать
        float f7 = Float.parseFloat("1000.0");
        System.out.println(i7);
        System.out.println(l7);
        System.out.println(f7);
        System.out.println("---------------------------------------");

        //Класс Number
        Number number = 45;
        //Методы класса Number

        Integer integer1 = 127;
        //тип byte от -128 до 127 и всё что больше 127 идет в минус.
        // Например (int) 128 = (byte) -128, а (int) 129 = (byte) -127 и так далее
        //256 (int) = 0 (byte)
        System.out.println(integer1.byteValue());
        System.out.println(integer1.shortValue());
        System.out.println(integer1.intValue());
        System.out.println(integer1.longValue());
        System.out.println(integer1.floatValue());
        System.out.println(integer1.doubleValue());
    }
}
