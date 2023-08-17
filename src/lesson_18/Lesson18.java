package lesson_18;

import java.util.Arrays;

public class Lesson18 {
    public static void main(String[] args) {



//        int[] array = new int[2];
//        int var = 10;
//        array[0] = var;
//
//        System.out.println(Arrays.toString(array));
//
//        int var2 = 25;
//        array[1] = 25;
//
//        System.out.println(Arrays.toString(array));
//
//        int var25 = 333;


        // для ДЗ
//        int[] ints = {1, 2, 3, 4, 5};
//        RubberArray rubberArray = new RubberArray(ints);


        RubberArray ra = new RubberArray();


        ra.printArray();
        System.out.println(ra.searchByValue(10));
        System.out.println("Min " + ra.min());

        ra.add(10);
        ra.add(25);
        ra.add(-20);

        ra.printArray();

        int raSize = ra.size();
        System.out.println("Сейчас в массиве " + raSize + " элементов");

        System.out.println("Сумма знаний элементов массива " + ra.sumOfValues());

        ra.add(7, 14, -21, 15, 25);

        ra.printArray();

        System.out.println("Min в массиве: " + ra.min());
        System.out.println("Max в массиве: " + ra.max());

        int[] newArray = ra.toArray();

        newArray[0] = 10_000;
        System.out.println(Arrays.toString(newArray));

        ra.printArray();

        ra.deleteByIndex(2);
        ra.printArray();

        System.out.println();
        System.out.println("==============");
        RubberArray rubberArray = new RubberArray(newArray);
        rubberArray.printArray();

        System.out.println(rubberArray.searchByValue(-200));





    }
}
