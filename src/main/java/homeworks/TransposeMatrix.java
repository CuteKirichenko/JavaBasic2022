package homeworks;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        int firstSizeArray, secondSizeArray; //розміри М та N
        int minNumeric = 0; // числа, які рандомно заповнюють масив - min
        int maxNumeric = 20; // числа, які рандомно заповнюють масив - max

        Scanner in = new Scanner(System.in);
        System.out.println("Задайте строну матриці M (число від 1 і більше):");
        firstSizeArray = in.nextInt();

        System.out.println("Задайте строну матриці N (число від 1 і більше):");
        secondSizeArray = in.nextInt();

        int[][] firstArray = new int[firstSizeArray][secondSizeArray];
        int[][] transposeMatrix = new int[secondSizeArray][firstSizeArray];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < firstArray[i].length; j++) {
                firstArray[i][j] = getRandomDg(minNumeric, maxNumeric);
                transposeMatrix[j][i] = firstArray[i][j];
            }
        }

        System.out.println();
        for (int[] ints : firstArray) {
            System.out.println(Arrays.toString(ints));
        }

        System.out.println();
        for (int[] ints : transposeMatrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int getRandomDg(int minNumeric, int maxNumeric) {
        int range = maxNumeric - minNumeric + 1;
        return (int) ((Math.random() * range) + minNumeric);
    }
}
