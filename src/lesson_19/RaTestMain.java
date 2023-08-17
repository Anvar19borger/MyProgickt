package lesson_19;

import java.util.Arrays;

public class RaTestMain {
    public static void main(String[] args) {

        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        RubberArray rubberArray = new RubberArray(ints);
        ints[0] = 1000;
        System.out.println(Arrays.toString(ints));
        rubberArray.printArray();

//        rubberArray.extractArray(); //скрыли
        rubberArray.printArray();

        System.out.println(rubberArray.searchByValue(2));

        System.out.println();
        System.out.println("=============delete By Value");
        System.out.println(rubberArray.deleteByValue(2));
        rubberArray.printArray();
        System.out.println(rubberArray.deleteByValue(55));
        rubberArray.printArray();
        System.out.println("==============add new value");
        rubberArray.add(3, 10, 3);
        rubberArray.printArray();

        System.out.println();
        System.out.println("========== DEL all by value");
        System.out.println("найдено и удалено " + rubberArray.deleteAllByValue(3) + " элемента");
        rubberArray.printArray();

        System.out.println(rubberArray.getValueByIndex(7));

        rubberArray.changeValueByIndex(2, 15);
        rubberArray.printArray();




    }
}
