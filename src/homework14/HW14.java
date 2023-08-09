package homework14;

import java.util.Arrays;

public class HW14 {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(a);
        test(a);
        System.out.println(a);

        int[] ints = {0, 1, 2, 3, 4, 5};
        System.out.println("Массив до вызова метода:    " + Arrays.toString(ints));

        swap(ints, 1, 4);

        System.out.println("Массив после вызова метода: " + Arrays.toString(ints));

        int[] otherLink;
        otherLink = ints;
        otherLink[5] = 100;
        System.out.println("otherLink " + Arrays.toString(otherLink));
        System.out.println("ints      " + Arrays.toString(ints));

        otherLink = null;
        ints[0] = 99;
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(otherLink));

        String strTest = "Hello";
        changeString(strTest);
        System.out.println(strTest);

        String strSub = strTest.substring(0, 2);
        System.out.println(strTest);
        strTest = strTest + "df";

        String[] strings = {"aaaa", "bbbb", "vvvvv", "eeeee"};
        System.out.println(Arrays.toString(strings));
        swap(strings, 0, 2);
        System.out.println(Arrays.toString(strings));


    } // end main

    private static void changeString(String strTest) {
        strTest = "Good bye";
    }

    //Methods area

    public static void swap(String[] array, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            return;
        }

        String temp = array[index2];
        temp = temp.substring(0,2);
        temp = temp.substring(0,1);
        temp = temp.trim();
        temp = temp.toLowerCase();
        temp = temp.toUpperCase();
        temp = temp.toLowerCase();

        array[index2] = array[index1];
        array[index1] = temp.substring(0,2).substring(0,1).trim().toLowerCase().toUpperCase().toLowerCase();

        Arrays.toString(array);
    }

    /*
    Написать метод swap, принимающий на вход массив целых чисел, и два индекса.\
    Метод должен поменять местами значения, хранящихся в этих индексах

     {0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}

     Если индексы за пределами массива?

     *UPD*: Написать метод swap, принимающий на вход массив целых чисел, и два индекса.
     Метод должен поменять местами значения, хранящихся в этих индексах это должен быть void метод.
     Пришёл массив в метод. В нем нужно просто поменять местами значения в двух "ячейках"

     */

    private static int test(int a) {
        a = a + 5;
        return a;
    }

    public static void swap(int[] array, int index1, int index2) {
        if (index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            return;
        }
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;

    }
}
