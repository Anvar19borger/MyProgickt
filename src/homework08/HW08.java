package homework08;

import java.util.Scanner;

public class HW08 {
    public static void main(String[] args) {
        /*
        Task 0 Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while

        Task 1 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while

        Task 2 Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while

        Task 3 Программа просит пользователя слово "hello" Если пользователь вводит правильное слово - программа распечатывает на экран благодарность и завершает работу Если вводится не верное слово - программа просит ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово

        *опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова По окончанию - вывести число попыток на экран
         */

        int i = 1;
        while (i <= 10) {
            System.out.print("Task" + i + "; ");
            i++; // i = i + 1;
        }
        System.out.println();

        // Task 1

        int iDo = 1;
        do {

            if (iDo % 5 == 0) {
                System.out.print(iDo + " ");
            }

            iDo++;
        } while (iDo <= 100);
        System.out.println();

        System.out.println("Task2");
        System.out.println();

        int counter = 1;
        int amountDigit = 0;

        while (counter <= 100 && amountDigit < 7) {
//        while ( amountDigit < 7 || counter <= 100 ) { // true && (???)  -> (false) & (???) => (true) || false => (false || false

            if ((counter % 5) == 0) {
                System.out.print(counter + " ");
                amountDigit++;
            }

            counter++;
        }

        System.out.println();
        System.out.println("amountDigit: " + amountDigit);

        System.out.println("Task 2");
        System.out.println();
        /*
        Task 3 Программа просит пользователя слово "hello"
        Если пользователь вводит правильное слово - программа распечатывает на экран благодарность и завершает работу
        Если вводится не верное слово - программа просит ввести слово снова.
        До тех пор, пока не будет введено запрашиваемое слово
         */

        Scanner scanner = new Scanner(System.in);
        String answer;
        int attempts = 0;
        do {
            System.out.println("Введите слово hello");
//            answer = scanner.nextLine();
            answer = "hello";
            attempts++;
            System.out.println(answer.trim().substring(0, 5));

        } while (!answer.trim().substring(0, 5).equalsIgnoreCase("hello"));

        System.out.println("Благодарность на экране! Вы затратили " + attempts + " попыток");

        /*
        Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа
         */

        int userNumber;
        System.out.println("Введите число: ");
        userNumber = scanner.nextInt();

        System.out.println("number: " + userNumber);

        int digitForChar = userNumber;
        int sumDigit = 0;
        // 12345
        String strResult = "";

        while (userNumber > 0) {
            int digit = userNumber % 10;
            System.out.print(digit +  (userNumber > 10 ? " + " : " = " ));

//            String str1 = digit + " + ";
//            String temp = str1 + strResult;
//            strResult = temp;

            sumDigit = sumDigit + digit;
            userNumber = userNumber / 10;
        }
//        System.out.println(strResult);
        System.out.println(sumDigit);

        System.out.println("Option 2 =============");
        String strNumber = String.valueOf(digitForChar);
        System.out.println("String: " + strNumber);
        // "12345"
        int y = 0;
        int sum1 = 0;

        while (y < strNumber.length()) {
//            System.out.println(Integer.parseInt(String.valueOf(strNumber.charAt(y++))));
            int digit = Integer.parseInt(String.valueOf(strNumber.charAt(y++)));
            System.out.print(digit + " + ");

            sum1 += digit;
        }
        System.out.println(sum1);



    }
}
