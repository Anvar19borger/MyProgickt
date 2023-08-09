package lesson_14;

import java.util.Arrays;
import java.util.Random;

public class Lesson14 {
    public static void main(String[] args) {
        System.out.println("============= Task 0 ============");

        // "Hello" -> "HELLO"

//        int[] rerf = new int[-100];
//        System.out.println(Arrays.toString(rerf)); // Проверка предположения, что при попытке задать отрицательную
        //длину массива, может произойти ошибка в выполнении программы.

        Random random = new Random();
        System.out.println(random.nextInt());
//        System.out.println(random.nextInt(-1)); //Ошибка!! //Проверка. А что будет, если bound отрицательный

        /*
        Написать метод, возвращающий массив целых чисел, заданной длины.
        Массив должен быть заполнен случайными числами.

        Перегрузка. Диапазон случайных чисел, может быть задан вторым аргументом вызова метода
         */

//        int[] myArray = createRandomArray(8, 50);
        int[] myArray = createRandomArray(5);
        System.out.println(Arrays.toString(myArray));

        System.out.println("============= Task 1 ============");


        System.out.println("============= Task 2 ============");

    } //end main

    //Methods area
    /*
        Написать метод, возвращающий массив целых чисел, заданной длины.
        Массив должен быть заполнен случайными числами.

        Перегрузка. Диапазон случайных чисел, может быть задан вторым аргументом вызова метода
    */
    public static int[] createRandomArray(int size) {

        int boundDefault = Integer.MAX_VALUE;
        return createRandomArray(size, boundDefault);
    }


    public static int[] createRandomArray(int size, int bound) {
        int boundDefault = 100;

        if (size < 0) return new int[0];

        if (bound <= 0) {
//            return new int[0]; // вариант обработки не корректного bound
            bound = boundDefault; // второй вариант обработки bound < 0
        }

        Random random = new Random();
        int[] result = new int[size]; //объявление и инициализация массива длинной size

        for (int i = 0; i < result.length; i++) { // Заполнение массива случайными числами
            if (bound == Integer.MAX_VALUE) {
                result[i] = random.nextInt();
            } else {
                result[i] = random.nextInt(bound);
            }
        }

        return result; // возврат созданного и заполненного массива
    }
}
