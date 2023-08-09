package homework11;

import java.util.Arrays;

public class HW11 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

        Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:
        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

         Еще одна перегрузка: метод принимает массив и булевый флаг.
         Если флаг == true -> печатает массив в обратном порядке
         Если флаг == false -> печатает массив в прямом порядке
         */
        int[] testArray = {1, 4, 3, 6, 7};
        System.out.println(Arrays.toString(testArray));

        printReverseArray(testArray);
        printReverseArray(testArray, -3);
        printReverseArray(testArray, false);

        /* Task 1
        Написать метод, принимающий на вход целое число.
        Метод должен вывести на экран 2 в степени этоЧисло

        класс Math для нахождения степени числа использовать нельзя ;)
         */

        powMethod(-1);


    }

    //Methods area

    // 2^ 3 -> 2 * 2 * 2 (3 раза)
    // n ^ 0 -> 1
    public static void powMethod(int x) {
        if (x >= 0) {
            int result = 1;
            for (int i = 0; i < x; i++) {
                result = result * 2;
            }
            System.out.println("2 в степени " + x + " равно: " + result);
        } else {
            System.out.println("Не верные аргументы вызова метода");
        }
    }

    public static void printReverseArray(int[] array, boolean flag) {
        if (flag) {
            // обратный порядок
            printReverseArray(array);
        } else {
            // прямой порядок
            printReverseArray(array, array.length - 1);
        }
    }

    public static void printReverseArray(int[] array) {
        if (array != null) {
            System.out.print("[");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        } else {
            System.out.println("Неверные аргументы метода. Пришел null");
        }
    }

    public static void printReverseArray(int[] array, int index) {

        if (array != null) {

            for (int i = 0; i < index & i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            // {1, 4, 3, 6, 7};
            for (int j = array.length - 1; j >= 0 & j >= index; j--) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Неверные аргументы метода. Пришел null");
        }

    }


    //End methods area
}
