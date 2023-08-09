package homework13;

import java.util.Arrays;

public class HW13 {
    public static void main(String[] args) {

        String[] strings = {"One", "Two", "Hello", "hello", null, "test"};
        String findMe = "two";

        System.out.println(isStringInArray(strings, findMe));

        System.out.println(searchIndexByValueInArray(strings, findMe));

        /*
        {
            int[] ints = {0, 1, 2, 3, 4, 5};
            System.out.println("Before for-each: " + Arrays.toString(ints));

            for (int value : ints) {
                if (value == 2) {
                    value = 100;
                    System.out.println("value: " + value);
                }
            }

            System.out.println("After  for-each: " + Arrays.toString(ints));

            for (int i = 0; i < ints.length; i++) {
                if (ints[i] == 2) {
                    ints[i] = 100;
                }
            }
            System.out.println("After  for : " + Arrays.toString(ints));
        }
        */

        String strForCut = "Hello";
        strForCut = "He";
        System.out.println(cutString(strForCut));


        int[] ints = {23, 23, 4, -20, 5, 98, 453};
        int sum = sumOfArray(ints);
        System.out.println("Сумма: " + sum);

        double[] doubles = {23.0, 23.0, 4.0, -20.0, 5.0, 98.0, 453.0};
        System.out.println(sumOfArray(doubles));

        int[] ints1 = copyOfArray(ints);
        System.out.println(Arrays.toString(ints1));

        int[] ints2 = copyOfArray(ints, 3);
        System.out.println(Arrays.toString(ints2));




    } //end main

    //Methods area

    /*
    Написать метод copyOfArray, возвращающий массив:
    Метод принимает массив целых чисел и возвращает копию этого массива.
    Перегрузка: метод принимает массив строк и возвращает копию массива
    Перегрузка: Метод принимает массив целых чисел и число (newSize) - длину нового массива.
    Новый массив заполняется значениями из входящего массива. Сколько поместится.
    Если чисел не хватило -> остаток массива заполняется 0.
     */

    public static int[] copyOfArray(int[] array) {
        if (array == null) return null;

        return copyOfArray(array, array.length);

//        int[] copyArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            copyArray[i] = array[i];
//        }
//        return copyArray;
    }

    public static int[] copyOfArray(int[] array, int newSize) {
        //Arrays.copyOf(array, idx
        if (array == null || newSize <=0) return null;

        //{23, 23, 4, -20, 5, 98, 453}; l=7, copyOfArray(arr, 3)
        // {0, 0, 0}
        int[] result = new int[newSize];


        for (int i = 0; i < result.length && i < array.length; i++) {
            result[i] = array[i];
        }

        return result;
    }


    /*
    Реализуйте метод sumOfArray (сумма элементов массива),
    который получает на вход массив и определяет сумму его элементов.
     */

    public static double sumOfArray(double[] doubles) {

        if (doubles == null) return 0;
        double sum = 0;
        for (double value: doubles) {
            sum += value;
        }

        return sum;
    }

    // int 4 -> double 4.0 -> int 4
    public static int sumOfArray(int[] ints) {
//        double[] doubles = Arrays.stream(ints).asDoubleStream().toArray(); // -> приведение массива int в double массив
//        int sum1 = (int) sumOfArray(doubles); // передаем массив в существующий метод и приводим к типу инт
//        return sum1;

        if (ints == null) return 0;
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        return sum;
    }


    /*
    Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа входящей строки,
    переведенных в верхний регистр.
    Распечатать полученный результат в методе main
     */

    // "Hello" индекс 1,2;
    public static String cutString(String str) {
        if (str == null) return "";

        String result = "";
        if (str.length() > 1) {
            result += str.charAt(1); // String str = "string" + (String) hyjtyj
        }

        if (str.length() > 2) {
            result += str.charAt(2);
        }
//        result += 10;
        return result.toUpperCase();
    }


    /*
    Написать метод по поиску строки в массиве строк.
    На вход метод принимает массив строк, и строку для поиска.
    */

    public static int searchIndexByValueInArray(String[] strings, String str) {
        if (strings == null || str == null) {
            return -1;
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null && strings[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isStringInArray(String[] strings, String str) {
        if (strings == null || str == null || str.length() == 0) {
            return false;
        }
        for (String currenString : strings) {
            if (currenString != null && currenString.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
