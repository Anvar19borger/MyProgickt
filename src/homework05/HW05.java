package homework05;

import java.util.Random;

public class HW05 {
    public static void main(String[] args) {
        /*
        Создайте 10 переменных типа int.
        Присвойте каждой случайное значение от 0 до 20
        Для каждой переменной выведите строку в формате:
        Число: 6 четное: true, кратно 3: true, четное и кратное 3: true
        Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
        (опционально) - учесть, что случайное число может оказаться 0
         */

        Random random = new Random();
        int var1 = random.nextInt(20);
        int var2 = random.nextInt(20);
        int var3 = random.nextInt(20);
        int var4 = random.nextInt(20);


//        System.out.println(checkNumber(var1));
//        System.out.println(checkNumber(var2));
//        System.out.println(checkNumber(var3));
//        System.out.println(checkNumber(var4));
//
//        System.out.println(checkNumber(0));

        String resultStr = checkNumber(10);
        System.out.println(resultStr);

        checkNumberWithPrint(0);

        printCharDecimalCode('A');

        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | (45 < 70) & false ^ (6 == 5));
        System.out.println((true | false) | false ^ (6 == 5));
        System.out.println((true | false) | false);
        System.out.println(true | false);
        System.out.println(true);



    }


    public static String checkNumber(int x) {
        boolean b1 = (x != 0) && (x % 2 == 0); // x = 1 -> (true) & (???)
        boolean b2 = (x != 0) && x % 3 == 0; // x = 0 -> (false) & (???)
        boolean b3 = b1 && b2;
        String resultString = "Число: " + x + " четное: " + b1 + ", кратно 3: " + b2 + ", четное и кратное 3: " + b3;

        return resultString;
    }


    public static void checkNumberWithPrint(int x) {
        boolean b1 = (x != 0) && (x % 2 == 0); // x = 1 -> (true) & (???)
        boolean b2 = (x != 0) && x % 3 == 0; // x = 0 -> (false) & (???)
        boolean b3 = b1 && b2;

        System.out.println(("Число: " + x + " четное: " + b1 + ", кратно 3: " + b2 + ", четное и кратное 3: " + b3));

    }

    public static void printCharDecimalCode(char ch) {
        System.out.println((int) ch);
    }

}