package homeworks;

public class Regbi {
    public static void main(String[] args) {
        int minAge = 18;
        int maxAge = 40;
        int range = maxAge - minAge + 1;

        int[] team1 = new int[25];
        int sumAgeTeam1 = 0;

        System.out.print("Вік членів команди №1: ");
        for (int i = 0; i < team1.length; i++) {
            team1[i] = ((int) (Math.random() * range) + minAge);
            sumAgeTeam1 = sumAgeTeam1 + team1[i];
            System.out.print(team1[i] + ", ");
        }
        System.out.println("Середній вік (команди № 1) - " + Math.round((float) sumAgeTeam1 / team1.length));

        int[] team2 = new int[25];
        int sumAgeTeam2 = 0;

        System.out.print("Вік членів команди №2: ");
        for (int i = 0; i < team2.length; i++) {
            team2[i] = ((int) (Math.random() * range) + minAge);
            sumAgeTeam2 = sumAgeTeam2 + team2[i];
            System.out.print(team2[i] + ", ");
        }
        System.out.println("Середній вік (команди № 2) - " + Math.round((float) sumAgeTeam2 / team2.length));
    }
}
