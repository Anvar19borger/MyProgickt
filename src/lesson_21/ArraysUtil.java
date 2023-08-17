package lesson_21;

public class ArraysUtil {

    // Метод линейного поиска элемента в массиве
    // осуществляется перебором всех элементов и сравниванием с искомым значением
    public static int linearSearch(int[] array, int searchValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    // Метод ищет минимальное значения по всему массиву и
    // возвращает индекс min значения
    private static int minIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Метод ищет минимальное значения от стартового индекса до конца массива
    // и возвращает индекс min значения
    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // добавление еще большей гибкости в метод поиска минимума.
//    private static int minIndex(int[] arr, int startIndex, int endIndex) {
//        int min = arr[startIndex];
//        int minIndex = startIndex;
//        for (int i = startIndex; i < endIndex; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//                minIndex = i;
//            }
//        }
//        return minIndex;
//    }

    public static void sortSelection(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int localMin = minIndex(array, i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }
    }

    //Бинарный поиск значения в массиве
// [0, 3, 10, 21, 34, 38, 41, 57, 67, 77, 80, 87, 99]
    public static int binarySearch(int[] array, int searchValue){
        int startIndex = 0;  // 0
        int endIndex = array.length -1; // 12
        int middleIndex;

        int counter = 0;

        //проверка, что часть массива можно разделить пополам
        while (startIndex <= endIndex) { // 1. 0<=12 2. 7 <= 12 3. 10 <= 12
            counter++; // 1. 1; 2. 2; 3. 3;
            // вычисление индекса середины части массива, в которой производим поиск
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            // 1. 6 = 0 + (12-0) / 2 (знач = 41)
            // 2. 9 = 7 + (12-7) / 2 (знач = 77)
            // 3. 11 = 10 + (12-10)/2 (знач 87)

            // сравниваем значение в середине с искомым
            // 1. 41 == 77 -> проходим мимо if
            // 2. 77 = 77
            // 3. 87 == 87
            if (array[middleIndex] == searchValue) {
                //counter = 3
                System.out.println("Найден за " + counter + " шагов");
                return middleIndex;
            }
            // Если значения не равны -
            // определяем какую половину массива мы отбросим
            // 1. 41 > 77
            // 2. 77 > 87
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex -1;
            } else {
                // 1. startIdx = 7 (6 + 1)
                // 2. startIdx = 10 (9 +1)
                startIndex = middleIndex + 1;
            }
        }

        // если цикл while закончен (не осталось частей массива, которые можно поделить пополам
        // значит искомое значение в массиве отсутствует

        System.out.println("Ничего не найдено! Шагов сделано: " + counter);
        System.out.println("startIdx: " + startIndex + " endIdx: " + endIndex);
        return -1;


    }

    /*
    https://it-cs.io/events/koeln/
    Дописать метод для выведения массива в консоль.
     */

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length -1 ? ", " : ""));

//            if (i < array.length -1) { //альтернатива тернарному оператору (добавления запятой после значения)
//                System.out.print(", ");
//            }
        }
        System.out.print("]\n");
    }

    public static String toString(int[] array) {
        String result = "[";
//        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + (i < array.length -1 ? ", " : ""));
            result += array[i] + (i < array.length -1 ? ", " : "]");
        }
//       result +="]\n";
        return result;

    }


}