package lesson_12;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
//        powMethod(3);

//        int resultFromMethod = 10 ;
//        resultFromMethod = 10 + 5;
//        resultFromMethod = (25 > 5) ? 11 : 5;

        int resultFromMethod = powIntMethod(3); // В переменную присваиваем возвращаемое из метода значение.
        // Метод произвел "вычисления" и вернул результат, который мы можем присвоить переменной соответствующего типа

        // resultFromMethod = powMethod(3); // тип метода void. Ничего не возвращается. Нельзя присвоить "ничего" в переменную

        System.out.println(resultFromMethod);

        // напишите метод, принимающий в параметры число и возвращающего квадрат этого числа.

        System.out.println("++++++++++++++++++++");
        int squareForPrint = squareMethod(2);
        System.out.println(squareForPrint);
        System.out.println(squareMethod(5));

        double squareDouble = squareMethod(2.5);
        System.out.println(squareDouble);
        System.out.println(squareMethod(4.0));
        // double a = 4; //-> 4.0

        System.out.println(powIntMethod(-1));


        System.out.println(" ++++++++++++ MIN ++++++++++++++");
        // написать метод, принимающий массив целых чисел и находящий минимальное значение в массиве.

        int[] array = {1, 4, 5, -1, 8};
        System.out.println(Arrays.toString(array));

        array = null;
        int minInArrayIndex = findMinInArray(array);
        System.out.println("index minValue in array: " + minInArrayIndex);


        System.out.println("Min in array: " + (minInArrayIndex != -1 ? array[minInArrayIndex] : ""));

        // Написать метод, определяющие есть ли в массиве число Х
        // Найти элемент в массиве и вернуть его индекс. ==>

        System.out.println("======================");
        array = new int[] {1, 4, 5, -1, 8};
        System.out.println(Arrays.toString(array));
        if (array != null && searchNumberInArray(array, 100) != -1) {
            array[searchNumberInArray(array, 100)] = 256;
        }
        System.out.println(Arrays.toString(array));


    }
    // Methods main

    public static int searchNumberInArray(int[] arr, int numberForSearch) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberForSearch) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isNumberInArray(int[] arr, int x) {
        if (arr == null) return false; //Проверка на null. В случае null возвращается false. Работа метода останавливается
        for (int value : arr) { //Ищем совпадения. Если нашли - возврат true. Работа метода останавливается
            if (value == x) {
                return true;
            }
        }
        return false; // Если совпадения не найдены - возвращаем false
    }

    public static int findMinInArray(int[] arr) {
        if (arr != null) {
            int minIndex = 0;
            int min = arr[0]; // инициализация переменной значением, хранящимся в 0 ячейке массива.
            // нахождение min значения в массиве
//            for (int value : arr) {
//                if (value < min) {
//                    min = value;
//                }
//            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            return minIndex; // возврат результата работы метода (индекс элемента, имеющего мин значение в массиве)
        } else {
            //пришел null
            // Что возвращать???
            return -1;
        }
    }


    public static int squareMethod(double x) {
        return (int) (x * x); // Вычисление и возврат без промежуточной переменной.
    }

    public static int squareMethod(int x) {
        int result; //объявление переменной, в которую будет "сложен" результат вычислений в методе
        result = x * x; // сами вычисления, необходимые для реализации поставленной задачи
        return result; // возвращаем результат работы метода

        // return x * x; --> вычисление и возврат без промежуточной переменной.
    }

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

    public static int powIntMethod(int x) {
        int result = 1; // объявление переменной, в которой будет храниться результат вычислений в методе.
        // Тип этой переменной совпадает с указанным типом возвращаемого значения метода
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                result *= 2;
            }
        } else {
            System.out.println(Math.pow(2, x));
            result = (int) Math.pow(2, x);
        }
        return result; //Возвращаем результат наших вычислений. Тип строго должен соответствовать указанному типу возвращаемого значения метода
    }
}
