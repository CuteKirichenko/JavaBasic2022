package operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operators {
    public static void main(String[] args) {
        System.out.println("little conflict");
        System.out.println("little conflict");
        System.out.println("little conflict");
        System.out.println("little conflict");
        System.out.println("---------BigDecimal----------");
        double d = 2.0 - 1.1;
        System.out.println(d);

        BigDecimal numberFromString = new BigDecimal("2.0");
        System.out.println(numberFromString);

        BigDecimal number1 = BigDecimal.valueOf(2.0);
        BigDecimal number2 = BigDecimal.valueOf(1.1);
        System.out.println(number1.subtract(number2));

        System.out.println("lalala");
        System.out.println("----------ROUNDED-----------");
        BigDecimal num = new BigDecimal("3.145");
        BigDecimal roundedHalfUp = num.setScale(2, RoundingMode.HALF_UP);
        BigDecimal roundedHalfDown = num.setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal roundedUp = num.setScale(2, RoundingMode.UP);
        BigDecimal roundedDown = num.setScale(2, RoundingMode.DOWN);
        System.out.println(roundedHalfUp);
        System.out.println(roundedHalfDown);
        System.out.println(roundedUp);
        System.out.println(roundedDown);

        System.out.println("xxxxxx");
        System.out.println("xxxxxx");
        System.out.println("xxxxxx");


        System.out.println("---------------COMPARE--------------");
        BigDecimal num1 = new BigDecimal("5.6");
        BigDecimal num2 = new BigDecimal("5.6");

        int resultComparing = num1.compareTo(num2);
        System.out.println(resultComparing);

        System.out.println("---------------OTHER TYPES--------------");
        double doubleValue = num.doubleValue(); // d = 3.145
        int intValue = num.intValue(); // i = 3
        long longValue = num.longValue(); // l = 3

        System.out.println(doubleValue);
        System.out.println(intValue);
        System.out.println(longValue);
    }
}
