package oop.enumeration;

public enum Currency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUARTER(25);

    final int value;

    Currency(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String result;
        switch (this) {
            case PENNY:
                result = "Penny: " + value;
                break;
            case NICKLE:
                result = "Nickle: " + value;
                break;
            case DIME:
                result = "Dime: " + value;
                break;
            case QUARTER:
                result = "Quarter: " + value;
                break;
            default:
                result = "";
                break;
        }
        return result;
    }
}

