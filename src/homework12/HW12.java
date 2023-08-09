package homework12;

import java.util.Arrays;
import java.util.Random;

public class HW12 {
    public static void main(String[] args) {
        Random random = new Random();
        /*
        { // сравнение скорости работы двух методов
            int[] numbers = new int[100_000];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100_000);
            }

            long timeStart = System.currentTimeMillis(); // засекаем текущее время в мс

            int count = 0;
            for (int value : numbers) {
//            if (isNumberPrime(value)) { // 1106, 1176, 1053, 1078, 1086
                if (isNumberPrimeVar2(value)) { // 8, 6, 10, 10, 5
                    count++;
                }
            }
            System.out.println(count);

            long timeEnd = System.currentTimeMillis(); // опять засекаем время после завершения цикла
            System.out.println("Затрачено времени: " + (timeEnd - timeStart));
        }
        */

        int[] arrayForTestMethod = {-10, 0, 7, 12, 11, 1};
        int countPrimeArray = countPrimeNumberArray(arrayForTestMethod);
        System.out.println("Простых чисел в массиве: " + countPrimeArray);
//        boolean condition = 5 > 2;

//        if (isNumberGreatAs(2, 5)) { // 2 > 5
//            System.out.println("Print true");
//        }

        String[] strings = {"str", "str1", "str12", "string", "Long string"};
        String[] twoStringArray = createArrayOfSmallestAndLongestStringArray(strings);
        System.out.println(Arrays.toString(twoStringArray));

        String[] strings1 = new String[10];
        strings1[2] = "sm";
        strings1[1] = "small";
        strings1[3] = "hello";
        strings1[4] = "I am longest string";

        String[] twoStringArrayString1 = createArrayOfSmallestAndLongestStringArray(strings1);
        System.out.println(Arrays.toString(twoStringArrayString1));

        if (twoStringArrayString1.length == 0) {
            System.out.println("В массиве отсутствуют не null значения ");
        } else {
            System.out.println("Самая короткая " + twoStringArrayString1[0] + "; самая длинная: " + twoStringArrayString1[1]);
        }

        int[] ints = {4, 3, 55, 7, 11, 65, 98};
        int[] primeInts = createArrayOfPrimeNumber(ints);
        System.out.println(Arrays.toString(primeInts));


    } // end main

    // Methods area

    /*
    Task 3 опционально

    Написать метод, принимающий на вход массив целых чисел.
    Метод должен вернуть массив, состоящий только из простых чисел, присутствующих в изначальном массиве

    вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
     */

    public static int[] createArrayOfPrimeNumber(int[] numbers) {
        if (numbers == null) return new int[0];
        int[] resultLong = new int[numbers.length];

        int count = 0;
        for (int value : numbers) {
            if (isNumberPrimeVar2(value)) {
                resultLong[count] = value;
                count++;
            }
        }
        // {4, 3, 55, 7, 11, 65, 98}
        // {0, 0, 0 , 0, 0,  0,  0 }
        // {3, 7, 11 , 0, 0,  0,  0 } //count = 3;

        int[] resultShort = new int[count];
        for (int i = 0; i < resultShort.length; i++) {
            resultShort[i] = resultLong[i];
        }
        int[] ints = Arrays.copyOf(resultLong, count); // готовый метод для копирования части массива
        return resultShort;

    }

    /*
    Написать метод, принимающий на вход массив строк.
    Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки изначального массива.
    */

    public static String[] createArrayOfSmallestAndLongestStringArray(String[] strings) {
        if (strings == null) return new String[]{}; //возвращаем пустой массив

        String smallestStr = null;
        String longestStr = null;

        for (String str : strings) { //Пытается найти в массиве не null строку. Т.е. имеющую значение.
            if (str != null) {
                smallestStr = str;
                longestStr = str;
                break;
            }
        }

        if (smallestStr == null)
            return new String[]{}; //Если в массиве не нашлось ни одной не нулевой строки, возвращаем пустой массив.

        for (String str : strings) {
            if ((str != null) && (str.length() < smallestStr.length())) { //сравниваем длины текущей строки и строки в переменной smallest
                smallestStr = str; //если текущая короче, перезаписываем ее значение в smallestStr
            }
            if (str != null && str.length() > longestStr.length()) {
                longestStr = str; //если текущая длиннее, перезаписываем ее значение в longestStr
            }
        }
        String[] result = new String[]{smallestStr, longestStr}; //создаем массив из самой короткой и самой длинной строки массива
        return result; //возвращаем созданный массив из 2х строк
    }

    public static boolean isNumberGreatAs(int x, int y) {
        return x > y;
    }

    /*
    Написать метод, принимающий массив целых чисел.
    Метод должен вернуть количество простых чисел в массиве.
    Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
     */
    public static int countPrimeNumberArray(int[] array) {
        int countPrime = 0;
        if (array == null || array.length == 0)
            return countPrime; // проверка на существование массива и элементов в нем
        for (int currentValue : array) {
            if (isNumberPrimeVar2(currentValue)) { // если currentValue является простым числом, то
                countPrime++;
            }
        }
        return countPrime;
    }


    /*
    Написать метод принимающий целое число и проверяющий является ли число простым.
    Если является, метод должен вернуть true, не является - false
     */

    public static boolean isNumberPrime(int number) {
//        boolean result = true;
        if (number <= 1) return false;

        //number = 1;   2 < 1 -> false
        //number = 5 -> i = 2; 2 < 5 -> true
        //number = 5 -> i = 3; 3 < 5 -> true
        //number = 6 -> i = 2; 2 < 6 -> true
        for (int i = 2; i < number; i++) { // 2, 3, 4 .. number -1) || 25 > (2, 3, 4, 5, 6, 7 ..24)
            // 5 % 2 -> (1 == 0)
            // 5 % 3 -> (2 == 0)
            // 6 % 2 -> (0 == 0)
            if (number % i == 0) {
                return false; // number 6 - > ^ false
            }
        }
        return true;
    }


    public static boolean isNumberPrimeVar2(int number) {
//        boolean result = true;
        if (number <= 1) return false;

        if (number == 2 || number == 3) return true;

        //number = 1;   2 < 1 -> false
        if (number % 2 == 0 || number % 3 == 0) return false;
        // number = 64. Цикл проверит только делители 5, 7 - т.е. всего 2 итерации
        for (int i = 5; i < Math.sqrt(number); i += 6) { //  5, 7, 11, 13, 17, 19, 23, 25, 29, 31)

            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void sayHello() { //работа return в void методах
        int count = 0;
        System.out.println("Hello");
        count++;
        if (count == 2) {
            return;
        }
        System.out.println("Again hello");
    }
}
