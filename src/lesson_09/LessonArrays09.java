package lesson_09;

import java.util.Arrays;

public class LessonArrays09 {
    public static void main(String[] args) {
        int[] array;
        //какой-то код
        array = new int[5];
//        int array2[]; option 2, not recommend

//        int a;
//        a = 10;
        int a = 10;

        int[] array2 = new int[10]; // 0
        int[] array3 = new int[a];

        char[] chars = new char[5]; // 0 -default

        String[] strings = new String[7]; // null
        String str = null;
        boolean[] booleans = new boolean[100]; // false

        String[] strings1 = new  String[]{"One", "Two", "regert"};
        String[] strings2 = {"One", "Two", "regert"};

        int[] numbersOne = new int[5]; // {0,0,0,0,0}
        int[] numbers = new int[]{1, 5, -16, 25, 15845};

        int[] numbers2;
        numbers2 = new int[]{1, 58, -16, 25, 5676};
//        numbers2 =  {1, 58, -16, 25, 5676};  illegal


        int[] myArray = {1, 5, -16, 25, 15845};

        int digitIndex1 = myArray[1];
        System.out.println("digitIndex1= " + digitIndex1);
        myArray[1] = 10;
        int digitIndex1New = myArray[1];
        System.out.println("New value: " + digitIndex1New);


        int lengthArray = myArray.length;
        lengthArray = myArray.length;
        System.out.println("Array length: " + lengthArray);

        int counter = 0;
        while (counter < myArray.length) {
            if (myArray[counter] % 2 == 0) {
                System.out.println("Четное число из массива myArray: " + myArray[counter]); // myArray[0] -> myArray[1] ... myArray[length -1]

            }
            counter++;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(strings1));



        String string = "Abcdef";
//        int strCounter = 0;
//        while (strCounter < string.length() - 1) {
//            System.out.println(string.charAt(strCounter));
//            strCounter++;
//        }
//        System.out.println(string);

        System.out.println("+++++++++++ Arrays ++++++++++++");


        int[] myArray2 = {55, -15, 543, 10, 17, 56, 101, 0, 145};
        int[] arraySubarray = Arrays.copyOf(myArray2,4);
        int[] copyOfArray = Arrays.copyOf(myArray2, myArray2.length);
        System.out.println(Arrays.toString(arraySubarray));

        int[] arraySubarray2 = Arrays.copyOfRange(myArray2, 4, 7);
        int[] arraySubarray3 = Arrays.copyOfRange(myArray2, 4, 7);
        int[] arraySubarray4 = Arrays.copyOfRange(myArray2, 4, 100); // [17, 56, 101, 0, 145, 0, 0, 0, 0 ... 0] -> new int[100 - 4]
        System.out.println("arraySubarray2 " + Arrays.toString(arraySubarray2) );
        System.out.println("arraySubarray3 " + Arrays.toString(arraySubarray3));
        System.out.println(arraySubarray4.length);

        System.out.println(arraySubarray2 == arraySubarray3);
        System.out.println(Arrays.equals(arraySubarray2, arraySubarray3));


        System.out.println("myArray2 " + Arrays.toString(myArray2));
        Arrays.sort(myArray2, 2, 6);

        System.out.println("myArray2 " + Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("myArray2 " + Arrays.toString(myArray2));

        System.out.println("copyOfArray: " + Arrays.toString(copyOfArray));


        int[] asdea = {343, 55, 535, 5,35, 34, 7};

    }
}
