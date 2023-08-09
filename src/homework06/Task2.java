
package homework06;

        import java.util.Random;
        import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        System.out.println("Введите число 1, 2 или 3");
//        int answerNumber = scanner.nextInt();
//
////        scanner.hasNext();
//
//        if (answerNumber == 1) {
//            System.out.println("Вы ввели один");
//        } else if (answerNumber == 2) {
//            System.out.println("Вы ввели два");
//        } else if (answerNumber == 3) {
//            System.out.println("Вы ввели три");
//        } else {
//            System.out.println("Вы ввели что-то не то!");
//        }

        { //Task 1
            Random random = new Random();

            int a, b, c, d;
            a = random.nextInt(100);
            b = random.nextInt(100);
            c = random.nextInt(100);
            d = random.nextInt(100);
            System.out.println("число 1: " + a);
            System.out.println("число 2: " + b);
            System.out.println("число 3: " + c);
            System.out.println("число 4: " + d);

            int max = a;
            if (b > max) {
                max = b;
            }
            max = (c > max) ? c : max;
            if (d > max) max = d;

            System.out.println("Max: " + max);
        }

        {
            System.out.println("Введите 4-х значное число: ");
            String numberInString = scanner.nextLine();

            if (numberInString.length() != 4) {
                System.out.println("Не верный ввод");
            } else {
                int number = Integer.parseInt(numberInString);
//                System.out.println("number start: " + number);

                int digit1 = number % 10;
//                System.out.println("last digit " + digit1);
                number = number / 10;
//                System.out.println("number after cut " + number);

                int digit2 = number % 10;
//                System.out.println("digit2 " + digit2);
                number /= 10;
//                System.out.println("number after second cut " + number);

                int digit3 = number % 10;
                int digit4 = number / 10;

                if (digit1 + digit2 == digit3 + digit4) {
                    System.out.println("Ура! число счастливое!");
                } else {
                    System.out.println("Число НЕ является счастливым");
                }

            }

            System.out.println("Variant 2: ==========");
            if (numberInString.length() == 4) {
                char ch0 = numberInString.charAt(0);
                char ch1 = numberInString.charAt(1);
                char ch2 = numberInString.charAt(2);
                char ch3 = numberInString.charAt(3);

                // 0..1 -> десятичный код
                System.out.println(((int) '0') + " -> 0");
                System.out.println(((int) '1')  + " -> 1");
                System.out.println(((int) '2')+ " -> 2");
                System.out.println(((int) '3') + " -> 3");

                System.out.println("++++++++++++++++++++");

                System.out.println(((int) ch0 - 48) + " -> " + ch0);
                System.out.println(((int) ch1 - 48)  + " -> " + ch1);
                System.out.println(((int) ch2 - 48)+ " -> " + ch2);
                System.out.println(((int) ch3 - 48) + " -> " + ch3);

                if ((int)ch0 + ch1 == (int) ch2 + ch3) {
                    System.out.println("Число счастливое!");
                } else {
                    System.out.println("Число НЕ является счастливым");
                }


            } else {
                System.out.println("Все пропало. Число не 4-х значное");
            }


        }



    }
}

/*
Task 0
Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
 */

/*
Task 1

Запишите в 4 переменные случайные числа от 0 до 100
Выведите все 4 на экран
Программа должна определить максимальное из этих четырех чисел
Результат вывести на экран

Task 2 *Повышенной сложности (опционально)

программа предлагает пользователю ввести четырехзначное число
Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в формате String
Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с суммой третьей и четвертой цифры
Пример:

число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым
 */