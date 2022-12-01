package homeworks.burger;

public class BurgerMain {

    public static void main(String[] args) {
        Burger ordinaryBurger = new Burger("bun", "pork", "gaude", "mayonnaise");
        Burger dietBurger = new Burger("wheat bun", "chicken", "feta cheese");
        Burger doubleMeatBurger = new Burger("bun", "pork", "&beef", "cheddar", "mayonnaise");
    }
}
