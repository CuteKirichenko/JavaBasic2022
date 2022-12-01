package homeworks.burger;

public class Burger {
    private String bread;
    private String meat;
    private String cheese;
    private String mayonnaise;

    public Burger(String bread, String meat, String cheese, String mayonnaise) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        System.out.println("You buy the ordinary burger with " + this.bread + ", " + this.meat + " meat, " + this.cheese + " and " + this.mayonnaise + "!");
    }

    public Burger(String bread, String meat, String cheese) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        System.out.println("You buy the diet burger with " + this.bread + ", " + this.meat + " meat, " + this.cheese + "!");
    }

    public Burger(String bread, String meat, String addedMeat, String cheese, String mayonnaise) {
        this.bread = bread;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.meat = meat + addedMeat;
        System.out.println("You buy the double meat burger with " + this.bread + ", " + "mixe of " + this.meat + ", " + this.cheese + " and " + this.mayonnaise + "!");
    }
}
