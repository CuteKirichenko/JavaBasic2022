import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {

        int[][] array2; //двумерный массив
        String[][][] array3; //трёхмерный массив
        double[][][][][] array5; // пятимерный массив

        int[][] twoDimArray = new int[3][4];

        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 7;
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;

        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;

        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;

        int[][] twoDimArrayAlter = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};

        int[][] twoDimArrayPrint = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};//объявили массив и заполнили его элементами
        int[][] twoDimArrayPrintSame = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}, {46, 5, 77, 1}};//объявили массив и заполнили его элементами

        for (int i = 0; i < 3; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + twoDimArrayPrint[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        int[][] myArray = {{18, 28, 18}, {28, 45, 90}, {45, 3, 14}};
        System.out.println(Arrays.deepToString(myArray));

        int[][] twoDimArrayLength = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};

        System.out.println(twoDimArray.length); //3

        System.out.println(twoDimArray[0].length); //4


        //создаём трёхмерный массив, состоящий из двух двухмерных массивов
        int[][][] threeDimArr = new int[2][][];
        //создаём первый двумерный массив трёхмерного массива размерностью 5х2
        threeDimArr[0] = new int[5][2];
        //создаём второй двумерный массив трёхмерного массива размерностью 1х1
        threeDimArr[1] = new int[1][1];

        //задаем булев трёхмерный массив. На этой парковке есть 3 этажа,
        // на каждом из которых можно поместить 2х5 = 10 машин. По умолчанию все ячейки пусты (false)
        boolean[][][] parkingLot = new boolean[3][2][5];
        //приехало две машины и припарковались на нулевом этаже в ячейке [1][0] и [1][3]
        parkingLot[0][1][0] = true;
        parkingLot[0][1][3] = true;

        //Выведем массив в консоль
        for (int i = 0; i < 3; i++) {
            //-------------------------------
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + parkingLot[i][j][k] + "\t");
                }
                System.out.println();
            }
            //---------------------------------------------------
        }

        //--------------------------------------------------
        //Average
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("Среднее арифметическое " + result / nums.length);

        //-----------------------------------------
        //Fibonacci
        //с помощью рекурсии (метод recursive) и цикла for (метод calculateWithFor):
        //Если запустить данную программу и посмотреть на время выполнения обоих алгоритмов, то можно увидеть, что рекурсивный вариант работает дольше.
        //Если изменить значение переменной n на 250, программа зависнет. Проблема состоит в том, что скорость вычисления рекурсивного алгоритма крайне низкая.
        int n = 50;
        LocalTime localTime1 = LocalTime.now();
        System.out.print("Рекурсия " + recursive(n));

        LocalTime localTime2 = LocalTime.now();
        long duration1 = Duration.between(localTime1, localTime2).getSeconds();
        System.out.println(", время выполнения - " + duration1);

        LocalTime localTime3 = LocalTime.now();
        System.out.print("Цикл for " + calculateWithFor(n));

        LocalTime localTime4 = LocalTime.now();
        long duration2 = Duration.between(localTime3, localTime4).getSeconds();
        System.out.println(", время выполнения - " + duration2);

        //-------------------------------------
        //swap
        //1 Вводим временную переменную, которая на время придержит значение из одной переменной:
        int a = 3;
        int b = 5;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2Третья переменная не вводится, обмен достигается путем сложения и вычитания:
        int c = 3;
        int d = 5;

        c = c + d; // c = 8, d = 5
        d = c - d; // c = 8, d = 3
        c = c - d; // c = 5, d = 3

        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //--------------------------------
        //reverse
        int[] array = {1, 2, 3, 4};
        invert(array);
        System.out.print(Arrays.toString(array) + " => ");
        invert(array);
        System.out.println(Arrays.toString(array));

        //-----------------------------------
        //bubble

        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }

        //-------------------------
        //selection sort
        int[][] data1 = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data1) {
            System.out.print(Arrays.toString(arr) + " => ");
            sortSelection(arr);
            System.out.println(Arrays.toString(arr));
        }

    }

    //Сложность О(n) Фибоначчи
    static long calculateWithFor(int n) {

        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;

    }


    //Сложность О(2^n) Фибоначчи
    static long recursive(int n) {
        if (n <= 1) {
            return n;
        }
        return recursive(n - 2) + recursive(n - 1);
    }

    //selection
    private static void sortSelection(int[] array) {
        //Внешний цикл for отвечает за номер прохода,
        // а внутренний - за поиск минимального значения в текущем проходе.
        // Обратите внимание, что во внутреннем цикле начинаем искать минимальный элемент не с самого начала,
        // а пропускаем уже найденные на предыдущем шаге элементы:
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }

    //bubble
    private static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    //reverse array
    private static void invert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    //1. Линейный поиск
    //Самый простой, но и самый долгий алгоритм. Перебираем элементы массива и сравниваем с elementToSearch, который мы должны найти.
    public static int linearSearch(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }

    //2. Двоичный поиск, итеративный подход
    //Для использования алгоритма, массив должен быть отсортирован.
    // Идея метода состоит в том, что мы делим массив пополам, берем "средний элемент" с индексом middleIndex,
    // и сравниваем с искомым.
    // Если они равны, мы заканчиваем поиск.
    // Если искомый элемент меньше "среднего элемента" мы отбрасываем правую часть массива, иначе - левую.
    // После чего повторяем эти операции снова и снова, пока искомый элемент не будет найден, или пока новый отрезок не станет пустым.
    // Если элемент не нашелся возвращаем значение -1.
    public static int binarySearch(int[] array, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        // условие прекращения (элемент не представлен)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (array[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
            // если средний элемент больше
            // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (array[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    //3. Двоичный поиск, рекурсивный подход
    public static int recursiveBinarySearch(int[] array, int firstElement, int lastElement, int elementToSearch) {
        // условие прекращения
        if (lastElement >= firstElement) {
            int middle = (lastElement + firstElement) / 2;

            // если средний элемент - целевой элемент, вернуть его индекс
            if (array[middle] == elementToSearch) {
                return middle;
            }

            // если средний элемент больше целевого
            // вызываем метод рекурсивно по суженным данным
            if (array[middle] > elementToSearch) {
                return recursiveBinarySearch(array, firstElement, middle - 1, elementToSearch);
            }

            // также, вызываем метод рекурсивно по суженным данным
            return recursiveBinarySearch(array, middle + 1, lastElement, elementToSearch);
        }
        return -1;
    }

    //4. Поиск прыжками
    public static int jumpSearch(int[] array, int elementToSearch) {
        int arrayLength = array.length;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLength) - 1] < elementToSearch) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength) {
                return -1;
            }
        }
        while (array[previousStep] < elementToSearch) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength)) {
                return -1;
            }
        }

        if (array[previousStep] == elementToSearch) {
            return previousStep;
        }
        return -1;
    }
}
