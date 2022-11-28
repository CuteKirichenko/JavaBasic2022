package modificators;

import oop.modificators.MyClass;
/**
 * Наследник MyClass из другого пакета
 */
public class MyClassChildOtherPackage extends MyClass {

    //Доступ к переменным родителя из другого пакета
    public void test() {
        int six = one + 5; //static
        String newName = "NEW " + name; //public
        String newCode = "new-" + code; //protected
        //String nameAndSuffix = name + suffix; //default
        //String nonSecret = secret; //private
    }
}
