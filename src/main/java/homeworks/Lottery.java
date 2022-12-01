package homeworks;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {

        int sizeArray = 7;
        int numberOfCoincidences = 0;

        int[] arrayDeterminedCompany = getRandomArray(sizeArray, 0, 9); //створюємо масив заданого розміру і заповнюємо його
        int[] arrayDeterminedUser = getRandomArray(sizeArray, 0, 9); //створюємо масив заданого розміру і заповнюємо його

        bubbleSortArray(arrayDeterminedCompany); //сортування масивів (метод бульбашки)
        bubbleSortArray(arrayDeterminedUser);

        for (int i = 0; i < sizeArray; i++) {
            if (arrayDeterminedCompany[i] == arrayDeterminedUser[i]) {
                numberOfCoincidences++; //рахуємо кількість співпадінь
            }
        }

        System.out.println(Arrays.toString(arrayDeterminedCompany));
        System.out.println(Arrays.toString(arrayDeterminedUser));
        System.out.println();
        System.out.println("Кількість співпадінь: " + numberOfCoincidences);
    }

    public static void bubbleSortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static int[] getRandomArray(int sizeArray, int minNumeric, int maxNumeric) {
        int[] randomArray = new int[sizeArray];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = getRandomDg(minNumeric, maxNumeric);
        }
        return randomArray;
    }

    public static int getRandomDg(int minNumeric, int maxNumeric) {
        int range = maxNumeric - minNumeric + 1;
        return (int) ((Math.random() * range) + minNumeric);
    }
}
