package oop.modificators;

import modificators.MyClassChildOtherPackage;

public class ModificatorsMain {

    public static void main(String[] args) {
        MyClass example = new MyClass();
        example.name = "Tetiana";
        System.out.println(example.name); //public
        System.out.println(example.name + example.suffix); //default
        System.out.println(example.code); //protected
        //System.out.println(example.secret); //private

        MyClass myClassChild = new MyClassChild();
        myClassChild.name = "Tetiana Child";
        System.out.println(myClassChild.name);
        System.out.println(myClassChild.name + myClassChild.suffix);
        System.out.println(myClassChild.code);
        //System.out.println(example.secret);

        MyClass myClassChildOtherPackage = new MyClassChildOtherPackage();
        myClassChildOtherPackage.name = "Tetiana Child Other Package";
        System.out.println(myClassChildOtherPackage.name);
        System.out.println(myClassChildOtherPackage.name + myClassChildOtherPackage.suffix);
        System.out.println(myClassChildOtherPackage.code);
        //System.out.println(example.secret);

        MyClass myClass = new MyClass();
        myClass.name = "Tatiana";


        System.out.println(myClass.getClass().getSimpleName());
    }
}
