package lesson_11;

import java.util.Arrays;

public class MethodVoid {
    public static void main(String[] args) {
//        sayHello();
//        sayHello();
//        sayHello();
//        sayHello();


        char chSymbol = 'A';
//        System.out.println((int) chSymbol);

        printDecimalCodeOfChar(chSymbol);
//        printDecimalCodeOfChar(chSymbol);

        int[] arrays = {44, 54, 13, 66, 35, 21};
        System.out.println("Arrays print: " + Arrays.toString(arrays));
        System.out.print("my method: ");
        printArray(arrays);

        // Написать метод, принимающий число.
        // Вывести на экран надпись: число является / не является простым числом.

        System.out.println("=====================");
        int[] array = {13, 43, 55, 19, 22, 65, -2, -13, 0, 4, 5};



        for (int elemnet : array) {
            printIsDigitSimple(elemnet);
        }

        System.out.println("For each loop String ++++++++++++++++++");
        String[] strings = {"fderer", "reerrre", "reerrere", " were re"};

        for (String str : strings) {
            System.out.println(str);
        }


        int[] array2 = {44, 54, 1};

        int[] arr = null;
        printArray(arr);

        // метод выводящий на экран числа от 1 до n. Число n метод должен принимать в параметры.


        System.out.println();
        System.out.println("====================");

        printNumbers(10);
        // метод выводящий на экран числа от x до y. Числа x и y метод должен принимать в параметры.
        printNumbers(3, 10);

        printNumbers(3, "Hi");

        printIsDigitSimpleAllArray(array);

//        for (int i = 0; i < array.length; i++) {
//            int element = array[i];
//            printIsDigitSimple(element);
//        }


    }



    //Methods area

    public static void printIsDigitSimpleAllArray(int[] array) {
        for (int el : array) {
            printIsDigitSimple(el);
        }
    }

    public static void printNumbers(int n) {
        sayHello();
        printNumbers(1, n);
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
    }

    public static void printNumbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printNumbers (int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }



    public static void printIsDigitSimple(int number) {
        boolean isPrime = true;
        if (number == 1 || number <= 0) {
            isPrime = false;
//            System.out.println("Число 1 не является простым");
        }
        for (int j = 2; j < number; j++) { // 9 -> [2, 3, 4, 5, 6, 7, 8]
            if (number % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " является простым!");
        } else {
            System.out.println(number + " НЕ является простым");
        }


    }

    public static void printArray(int[] array) {
        if (array != null) { // проверка на null. В противном случае при значении null - программа завершится ошибкой / исключением
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ((i == array.length - 1) ? "" : ", "));
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void printDecimalCodeOfChar(char charName) {
        System.out.println((int) charName);
    }


}
