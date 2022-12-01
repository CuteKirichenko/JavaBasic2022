package bitwise;

public class BitWise {
    public static void main(String[] args) {
        int a = 378;
        int b = 576;
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = ~b;
        //Integer.toBinaryString() - приводит десятичное значение к двоичному
        System.out.println("a в двоичном представлении выглядит так: " + '\n');
        System.out.println(Integer.toBinaryString(a));
        System.out.println("b в двоичном представлении выглядит так: " + '\n');
        System.out.println(Integer.toBinaryString(b));

        System.out.println("a | b = " + Integer.toBinaryString(c));
        System.out.println("a & b = " + Integer.toBinaryString(d));
        System.out.println("a ^ b = " + Integer.toBinaryString(e));
        System.out.println("~ b = " + Integer.toBinaryString(f));

        /*  Но так как переменная типа int занимает 4 байта, т.е. 32 бита, на самом деле число в переменной хранится как:
        00000000 00000000 00000001 01010110 — число 342 в переменной типа int в java
        */

        //сдвиг влево - умножение на 2
        int x = 64;//значение, которое будем сдвигать
        int y = 3;//количество "ячеек" сдвига

        int z = (x << y);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(z));
        //после сдвига число 64 стало числом 512 в десятичном представлении
        System.out.println(z);

        //сдвиг вправо - деление на 2 с отбрасыванием остатка
        System.out.println(35 >> 2);

        //результат сдвига вправо значения -1 всегда равен -1, поскольку дополнительные знаковые разряды добавляют новые единицы к старшим битам.
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>= 1;
        System.out.println((Integer.toBinaryString(i)));

        //Сдвиг вправо без учёта знака
        //  11111111 11111111 11111111 11111111 >>> 24
        //---------------------------------------
        //  00000000 00000000 00000000 11111111
        //  255 в двоичном виде типа int
        i = i >>> 24;
        System.out.println((Integer.toBinaryString(i)));
        System.out.println(i);
    }
}
