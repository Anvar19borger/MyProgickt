package lesson_07;

import java.util.Scanner;

public class Lesson07 {
    public static void main(String[] args) {
        /*
        Task 0
        Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
        а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
         */

        int x = 3;
        long long1 = 12L;

        switch ((int) long1) {
            case 1: {
                System.out.println("x равен 1");
                break;
            }
            case 2: {
                System.out.println("x равен 2");
                break;
            }
            case 3: {
                System.out.println("x равен 3");
                break;
            }
            default: {
                System.out.println("Введено какое-то другое число");
            }
        }

        String str1 = "1234";
        int stringYoInt = Integer.parseInt(str1);
//
////        if (x == 5 ) System.out.println("if: x равен 5");
//
//        int myMoney = 100;
//        System.out.println("start my money: " + myMoney);
//
//        int incoming = 0;
//
//        switch (incoming) {
//            case 0: {
//                myMoney += 5;
//                break;
//            }
//            case 10: {
//                myMoney += 25;
//                break;
//            }
//            case 20: {
//                myMoney += 75;
//                break;
//            }
//            default: {
//                myMoney += incoming;
//            }
//
//        }
//            System.out.println("end my money: " + myMoney);

//        System.out.println("У меня есть загадка:");
//        System.out.println("Что это такое: желтый, большой, с рогами и полный зайцев?");
//        System.out.println("Как думаешь?");
//
//        Scanner scanner = new Scanner(System.in);
//        String answer = scanner.nextLine();
//
//
//        char firstCharSubstring = answer.trim().toLowerCase().substring(1,3).charAt(0);
//        System.out.println("my char: " + firstCharSubstring);
//
//        answer = answer.trim().toLowerCase();
//
//
//
//        switch (answer) {
//            case "троллейбус":
//            case "троллейбус!":
////            case "Троллейбус":
//            {
//                System.out.println("Правильно! Ты, наверное, нагуглил?");
//               break;
//            }
////            case "Сдаюсь":
//            case "сдаюсь!":
//            case "сдаюсь":
//            {
//                System.out.println("Очень жаль. Правильный ответ Троллейбус");
//                break;
//            }
//            default: {
//                System.out.println("А вот и не правильно! попробуй еще");
//            }
//        }


        /*
        Task 0
        Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
                а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3,
                если 4 ли 5 - написать "вы ввели 4 или 5"
                Результат вывода сохранить в переменную
        */

        String result = "";

//       From Java 14 + code
//        int myChoice = 1;
//        int resInt;
//
//        result = switch (myChoice) {
//            case 1 -> "Вы ввели один";
//            case 2 -> "Вы ввели два";
//            case 3 -> "Вы ввели три";
//            case 4, 5 -> "Вы ввели 4 или 5";
//            default -> "Строка по умолчанию";
//        };

        System.out.println("Result string: " + result);
    }
}
