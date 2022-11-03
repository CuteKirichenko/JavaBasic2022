package oop.object;

import java.util.Arrays;

public class ObjectExample {
    public static void main(String[] args) {
        Person tetiana = new Person();
        tetiana.age = 18;
        tetiana.name = "Tetiana";
        tetiana.isMarried = false;

        Person svitlana = new Person();
        svitlana.age = 33;
        svitlana.name = "Svitlana";
        svitlana.isMarried = true;

        Person tetiana1 = new Person();
        tetiana1.age = 18;
        tetiana1.name = "Tetiana";
        tetiana1.isMarried = false;

        System.out.println("----------------------------------------------------------------------------------------");
        //hashCode
        int hashCodeTetiana = tetiana.hashCode();
        System.out.println(hashCodeTetiana);
        int hashCodeSvitlana = svitlana.hashCode();
        System.out.println(hashCodeSvitlana);

        int hashCodeTetiana1 = tetiana1.hashCode();
        System.out.println(hashCodeTetiana1);

        System.out.println("----------------------------------------------------------------------------------------");
        //equals
        // Указывает, равен ли какой-либо другой объект этому объекту.
        Integer tetianaNumber = 100;

        System.out.println(tetiana.equals(tetiana)); //объект сравнивают самого с собой - true
        System.out.println(tetiana.equals(tetianaNumber)); //объекты разных типов - false
        System.out.println(tetiana.equals(null)); //объект сравнивают с null - false
        System.out.println(tetiana.equals(tetiana1)); //объекты сравнивают по значению полей - true
        System.out.println(tetiana.equals(svitlana)); ////объекты сравнивают по значению полей - false

        System.out.println("----------------------------------------------------------------------------------------");
        //Нарушение контракта
        PersonWithoutContract tetianaWrong = new PersonWithoutContract();
        tetianaWrong.age = 18;
        tetianaWrong.name = "Tetiana";
        tetianaWrong.isMarried = false;

        PersonWithoutContract tetianaWrong1 = new PersonWithoutContract();
        tetianaWrong1.age = 18;
        tetianaWrong1.name = "Tetiana";
        tetianaWrong1.isMarried = false;

        System.out.println(tetianaWrong.hashCode());
        System.out.println(tetianaWrong1.hashCode());

        System.out.println(tetianaWrong.equals(tetianaWrong1));

        System.out.println("----------------------------------------------------------------------------------------");
        //toString
        //по умолчанию - как у Object:
        System.out.println(tetiana.getClass().getName() + '@' + Integer.toHexString(tetiana.hashCode()));
        System.out.println(tetiana);

        System.out.println("----------------------------------------------------------------------------------------");
        //getClass
        Class tetianaClass = tetiana.getClass();
        System.out.println(tetianaClass);
        System.out.println(tetianaClass.getName());
        System.out.println(tetianaClass.getSimpleName());
        System.out.println(Arrays.toString(tetianaClass.getClasses()));
    }
}
