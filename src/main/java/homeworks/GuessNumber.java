package homeworks;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(11);
        int attempts = 5; //кількість спроб
        int attemptCounter = 1;
        System.out.println("Граємо в гру 'Вгадай число' ");

        for (int i = 0; i < attempts; i++) {
            Scanner in = new Scanner(System.in);
            System.out.println("Спроба номер: " + attemptCounter);
            System.out.print("Введіть число від 0 до 10 : ");
            attemptCounter++;
            int userNumber = in.nextInt();
            if (numberToGuess == userNumber) {
                System.out.println("Ви вгадали!");
                return;
            } else {
                if (attemptCounter > attempts) {
                    System.out.println("Ви програли!");
                } else {
                    System.out.println("Ви не вгадали , спробуйте ще!");
                    System.out.println("_______________________________");
                }
            }
        }
    }
}
