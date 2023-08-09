package homework10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        /*
        Заполните массив 20 случайными целыми числами.
        Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.
        */
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Task 0
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        int countEven = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                countEven++;
                sum = sum + array[i];
            }
        }
        System.out.println("Кол-во четных: " + countEven);
        System.out.println("Сумма четных чисел в массиве: " + sum);
        System.out.println("===================");

        /*
        За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
        А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
        Для вычисления суммы с учетом процентов используйте цикл for.
        Пусть сумма вклада будет представлять тип float.
         */


        float depositSum;
        int months;
        float stavka = 7f;

        System.out.println("Введите сумму вклада: ");
        depositSum = scanner.nextFloat();

        System.out.println("Введите кол-во месяцев: ");
        months = scanner.nextInt();

//        System.out.println(depositSum + " : " + months);

        if (months >= 1 && depositSum > 0) { // проверка корректности введенных данных
            for (int i = 1; i <= months; i++) {
                float percents = depositSum * stavka / 100; // вычисление ежемесячной суммы увеличения суммы депозита
                depositSum += percents; // прибавление дивидентов к основной сумме вклада
            }
        } else {
            System.out.println("Incorrect data");
        }

        System.out.println("После " + months + " месяцев вы получите: " + depositSum);

        /*
        Task 2
        Заполните массив 50 случайными числами от 1 до 100.
        Программа должна найти, и вывести на экран все простые числа.
        Посчитайте сколько получилось таких чисел в массиве.
        Простое число - число, которое делится на цело только на 1 и само себя.
        */
        System.out.println("+++++++++++ Task2 +++++++++++");
        int[] numbers = new int[50];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000) + 1;
        }

        int countSimple = 0;

        System.out.println(Arrays.toString(numbers));
        numbers[10] = 1;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            boolean isPrime = true;
            if (numbers[i] == 1) {
//                System.out.println("Число равно 1 - " + numbers[i]);
                continue;
            }
//            for (int j = 2; j < numbers[i]; j++) { // 9 -> [2, 3, 4, 5, 6, 7, 8]
//                if (numbers[i] % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }

            if (numbers[i] % 2 == 0 || numbers[i] % 3 == 0) {
                isPrime = false;
                continue;
            }
            for (int j = 5; isPrime & j <= Math.sqrt(numbers[i]); j += 6) {
                if (numbers[i] % j == 0 || numbers[i] % (j + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(numbers[i] + " ");
                countSimple++;
            }
        }

        System.out.println("\nКоличество простых чисел в массиве: " + countSimple);

        /*
        Task3 *опционально Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
         */

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

/*
    5  7    11  13    17  19    23 25    29 31

 */
