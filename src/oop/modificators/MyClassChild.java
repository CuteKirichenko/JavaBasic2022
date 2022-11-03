package oop.modificators;

/**
 * Наследник MyClass из того же пакета
 */
public class MyClassChild extends MyClass {

    public void test() {
        int six = one + 5; //static
        String newName = "NEW " + name; //public
        String newCode = "new-" + code; //protected
        String nameAndSuffix = name + suffix; //default
        //String nonSecret = secret; //private
    }
}
