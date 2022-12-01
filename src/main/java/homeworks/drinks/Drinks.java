package homeworks.drinks;

/**
 * Class for managing User Order of drinks.
 */
public class Drinks {
    public static final int TEA = 10;
    public static final int COFFEE = 20;
    public static final int MOJITO = 30;
    public static final int LEMONADE = 40;
    public static final int MINERAL = 50;
    public static final int COCA_COLA = 60;

    private int bill;
    private int amountOfDrinks;

    public int getBill() {
        return bill;
    }

    public int getAmountOfDrinks() {
        return amountOfDrinks;
    }

    public void prepareTea() {
        System.out.println("Preparing tea...");
        this.bill += TEA;
        amountOfDrinks++;
    }

    public void prepareCoffee() {
        System.out.println("Preparing coffee...");
        this.bill += COFFEE;
        amountOfDrinks++;
    }

    public void prepareMojito() {
        System.out.println("Preparing mojito...");
        this.bill += MOJITO;
        amountOfDrinks++;
    }

    public void prepareLemonade() {
        System.out.println("Preparing lemonade...");
        this.bill += LEMONADE;
        amountOfDrinks++;
    }

    public void prepareMineral() {
        System.out.println("Preparing mineral...");
        this.bill += MINERAL;
        amountOfDrinks++;
    }

    public void prepareCocaCola() {
        System.out.println("Preparing coca-cola...");
        this.bill += COCA_COLA;
        amountOfDrinks++;
    }
}
