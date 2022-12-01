package homeworks.fitness;

public class FitnessMain {

    public static void main(String[] args) {
        UserAccount tetiana = new UserAccount(
                "Tetiana",
                4,
                10,
                1998,
                "email",
                "0675554433",
                "Didenko",
                56,
                "120/80",
                8000);

        tetiana.printAccountInfo();

        tetiana.setLastName("Shur");
        tetiana.setWeight(58);
        tetiana.setBloodPressure("110/70");
        tetiana.setNumberOfStepsPerDay(10000);

        tetiana.printAccountInfo();
    }
}
