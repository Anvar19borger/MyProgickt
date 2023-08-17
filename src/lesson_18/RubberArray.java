package lesson_18;

import java.util.Arrays;

public class RubberArray {

    int[] array;

    public RubberArray() { // конструктор
        this.array = new int[0];
    }

    public RubberArray(int[] arr) {
        this(); // new RubberArray();
        add(arr);
    }


    public void add(int value) { //добавление 1 элемента
        extractArray();
        array[array.length - 1] = value;
    }

    public void add(int... ints) { // принимает произвольное количество аргументов типа int
        for (int value : ints) {
            add(value);
        }
    }


    public void extractArray() { // расширение массива на 1 ячейку
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() { // вывести в консоль массив
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public int size() { // количество элементов в массиве
        return array.length;
    }

    public int sumOfValues() { //сумма значений в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public int min() { // возвращаем мин значение из массива
        if (array.length == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() { // возвращаем максимальное значение из массива
        if (array.length == 0) return Integer.MAX_VALUE;

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int[] toArray() { // нужно создать КОПИЮ нашего массива и ее вернуть
        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }

        return result;
        // return Arrays.copyOf(array, array.length);
    }

    public void deleteByIndex(int index) {
        if (array.length >= 1 && index >= 0 && index < array.length) {

            int[] result = new int[array.length - 1];

            for (int i = 0; i < result.length; i++) {

                if (i < index) {
                    result[i] = array[i];
                } else { // if (i >= index) {
                    result[i] = array[i + 1];
                }
            }
//            System.out.println("Result " + Arrays.toString(result));
            array = result;
        }
    }

    public int searchByValue(int value) { // поиск по значению. Возвращаем индекс

        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) return i;
        }

        return -1;
    }


}
/*
Поиск элемента по значению
Возвращение значения по индексу
Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
Удаление элемента по значению
Замена значения по индексу (есть индекс и новое значение)
Замена значения по значению (есть старое и новое значение)
 */



/*
+ количество элементов в массиве
+ сумма элементов массива
+ добавления сразу нескольких значений в массив
+ найти мин, макс
+ получить RubberArray в виде обычного массива
+ удалить элемент по индексу
- поиск элемента по значению
- сортировать ???
- заменить по индексу значение в массиве
- среднее значение ???
- распечатать в обратной последовательности -> ???
- удалить элемент по значению

 */
