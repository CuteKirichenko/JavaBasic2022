package modificators;

import oop.modificators.MyClass;
/**
 * Не наследник MyClass из другого пакета
 */
public class NotChildOfMyClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int six = MyClass.one + 5; //static
        String newName = "NEW " + myClass.name; //public
        //String newCode = "new-" + myClass.code; //protected
        //String nameAndSuffix = name + suffix; //default
        //String nonSecret = secret; //private
    }
}
