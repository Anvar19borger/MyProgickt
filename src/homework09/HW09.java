package homework09;

import java.util.Arrays;
import java.util.Random;

public class HW09 {
    public static void main(String[] args) {
        /*
        Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.

        Вывести на экран:
        минимальное значение, хранящееся в массиве
        максимальное
        среднее арифметическое всех значений в массиве
     */
        Random random = new Random();

        int[] array = new int[random.nextInt(20) + 1];

//        int[] myArray = new int[13];
//        // + цикл с генерацией значений
//
//        int[] myArray2 = {1, 43, 55, 0, -12};


        int counter = 0;
        while (counter < array.length) {
            array[counter] = random.nextInt(10000);
            counter++;
        }

        System.out.println(Arrays.toString(array));

        int minValue;
        int maxValue;
        int minIndex;
        int maxIndex;


        minValue = array[0];
        minIndex = 0;

        maxValue = array[0];
        maxIndex = 0;

        int sum = 0;
        int i = 0;

        while (i < array.length) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }

            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }

            sum += array[i++];
        }

        System.out.println("Min: " + minValue + " индекс min: " + minIndex);
        System.out.println("Max: " + maxValue + " индекс max: " + maxIndex);
        System.out.printf("%.2f ", (double) sum / array.length);
        System.out.println();

//        array[maxIndex] = minValue;
//        array[minIndex] = maxValue;

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp; // temp = array[minIndex];

//        int max = array[maxIndex];  //более подробная запись обмена значений в ячейках
//        int min = array[minIndex];
//        array[maxIndex] = min;
//        array[minIndex] = max;

        System.out.println("after swap: " + Arrays.toString(array));

        /*
        Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
         */

        String[] strings = {"One", "Three", "Two", "rfgeer", "reffer werf"};
//        String[] strings = new String[10];

        /*
        Task 2 Дан массив строк. Вывести на экран все символы из самой длинной строки массива
        */

        String stringWithMaxLength = strings[0];

        int j = 0;
        while (j < strings.length) {
            if (strings[j].length() > stringWithMaxLength.length()) {
                stringWithMaxLength = strings[j];
            }
            j++;
        }

        System.out.println("String with max length: " + stringWithMaxLength);

        int x = 0;
        while (x < stringWithMaxLength.length()) {
            System.out.print(stringWithMaxLength.charAt(x) + " ");
            x++;
        }
        System.out.println();



    }


}
