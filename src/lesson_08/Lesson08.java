package lesson_08;

import java.util.Random;
import java.util.Scanner;

public class Lesson08 {
    public static void main(String[] args) {

//        int i = 0;
//
//        while (i <= 10) {
//            //тело цикла
//
//            System.out.println("Hello! " + i++);
//            // i++ vs ++i -> помнить разницу
////            System.out.println("Счетчик: " + i);
////            i++ -> i = i + 1;
//        }
//
//        System.out.println("Цикл1 завершен!");
//
//        System.out.println("=============");
//        i = 100;
//
//        while (i > 90) {
//            //тело цикла
//
//            System.out.println("Hello! " + i--);
//        }
//        System.out.println("Цикл2 завершен!");
//
//        int y = 0;
//        Random random = new Random();
//        int randomNumber, count12 = 0, count13 = 0;
//
//        System.out.println("+++++++++++");
//        while (y < 1_000_000) {
//            randomNumber = random.nextInt(13);
//            if (randomNumber == 12) count12++;
//            if (randomNumber == 13) count13++;
//            y++;
//        }
//        System.out.println("count12 " + count12 + " count13: " + count13);
//
//        int var1 = 0;
//
//        while (var1 != 0) {
//            System.out.println("While: var не равен 0");
//        }
//
//        do {
//            System.out.println("Do-while var не равен 0");
//        } while (var1 != 0);
//
//        System.out.println();
//        System.out.println("Do-while ===============");
//
        Scanner scanner = new Scanner(System.in);
//        int answerInt;
//
//        do {
//            System.out.println("Введите число меньше или равное 10");
//            answerInt = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Вы ввели число: " + answerInt);
//            System.out.println("Test: " + (answerInt > 10));
//        } while (answerInt > 10);
//
//        System.out.println("УРА! Ваше число подходит! " + answerInt);

//        int counter = 1;
//
//        while (counter <= 5) {
//            System.out.println(counter++);
////            counter = counter + 1;
//        }



//        int infinity = 1;
//
//        while (infinity > 0) {
//            System.out.println(infinity);
//            infinity++;
//        }

        // Переполнение типа
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Max " + maxInt);
        System.out.println("Min " + minInt);

        System.out.println("MAX + 1 => " + (maxInt + 1));
        System.out.println("MIN - 1 => " + (minInt - 1));

        /*
        Вывести на экран все четные числа от 1 до 20 включительно
         */

        int counter1 = 1;
        while (counter1 <= 20) {
            if (counter1 % 2 == 0 ) System.out.println(counter1);

            counter1++;
        }

         /*
        Вывести на экран все четные числа от 5 до 20 включительно и посчитайте их количество
         */

        int counterIter = 0;
        int startInt = 5;
        int evenCount= 0;
        int sum1 = 0;

        while (startInt <= 20) {
            if (startInt % 2 == 0 ) {
                System.out.print(startInt + " ");
                evenCount++;
                sum1 = sum1 + startInt;
            }
            startInt++;
            counterIter++;
        }
        System.out.println();
        System.out.println("============= Много переменных");
        System.out.println("Кол-во итераций цикла: " + (counterIter - 1));
        System.out.println("Кол-во четных чисел: " + evenCount);
        System.out.println("Сумма всех четных чисел: " + sum1);
        System.out.println("Среднее арифметическое: " + (double)sum1 / evenCount);
        System.out.println();
        System.out.println("============= Много переменных");


        /*
        Посчитать среднее арифметическое N случайных чисел в диапазоне от 1 до 100
        N получить от пользователя в консоли;
         */

        Random random1 = new Random();

        System.out.println("Введите число: ");
        int userInt = scanner.nextInt();

        int counter2 = 1;

        int sum = 0;
        while (counter2 <= userInt) {
            int randomInt = random1.nextInt(100) + 1;
//            System.out.print(randomInt + " ");
            sum = sum + randomInt;
            counter2++;
        }

        int countIterations = counter2 - 1;

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Цикл завершен. Кол-во повторений: " + countIterations);

        System.out.println("Среднее арифметическое: " + (double)sum / countIterations );


    }
}
