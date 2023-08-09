
package homework04;

public class HW04 {
    public static void main(String[] args) {

        //Смещение строк по коду Shift + Alt + стрелки

        /*
        Task 01
        Создайте переменную с типом String, в которой будет хранится ВАше имя.
        Сколько букв в вашем имени? Выведите значение на экран
        Создайте две переменные типа char. Одной присвойте первый символ имени, второй - последний символ
        Выведите на экран десятичный код первого и последнего символа вашего имени
         */

//        String name = "Sergey";
//        String name1 = "Vas";
//        int charactersCount = name.length();
//        System.out.println("Количество: " + charactersCount);
//
//        char firstChar, lastChar;
//        firstChar = name.charAt(0);
//        lastChar = getLastChar("A");
//
//        int codeDecimal = (int) firstChar;
//        System.out.println(codeDecimal);
//        System.out.println(name.codePointAt(0));
//
//        System.out.println("last: " + lastChar);


/*
Из созданных строк склейте двумя разными способами строку: "Java is a powerful language"
*/
        String str = "JavaScript";
        String str1 = "is";
        String string2 = "a";
        String str3 = "powerful";
        String str4 = "language";

        String result = "Java is ...";
//        System.out.println("result " + result);

        String result1 = str + " " + str1 + " " + string2 + " " + str3 + " " + str4;
//        System.out.println("result1 " + result1);

//        String result2 = String.join(" :\t ", "JavaScript", "powerful", str, str1, string2, str3, str4);
        String result2 = String.join(" ", "JavaScript", "powerful", str, str1, string2, str3, str4);
        System.out.println("result2 " + result2);

        /*
        Task 02.2 Заменить в результирующей строке слово "powerful" на "super" Содержит ли строка подстроку "age"? Создайте переменную boolean типа c ответом
         */

        System.out.println(result2.replaceFirst(str3, "super"));
        System.out.println(result2.replace('a', 'A'));

        /*
        Даны строки разной длины (длина - четное число)
            "string"
            "code"
            "Practice"
        Необходимо распечатать два средних символа строки.
        Например, если дана строка "string" - результат будет "ri", для строки "code" результат "od",
        для "Practice" результат "ct".
         */

        String stringStr = "string1";
        String codeStr = "code";
        String practiceStr = "Practice1";

        String middleSub = middleChars(practiceStr);
        System.out.println("Средние символы: " + middleSub);

    }

    public static String middleChars(String str) {
        String result = "";
        int length = str.length();
        int startIndex = length / 2 - 1;
        result = str.substring(startIndex, startIndex + 2);
//        result = str.substring(1, 3); // Не верный подход
        String result1 = str.substring(length / 2 - 1, length / 2 + 1);
        System.out.println(result);
        System.out.println(result1);

        return result;
    }

    public static char getLastChar(String str) {
        return str.charAt(str.length() - 1);
    }
}