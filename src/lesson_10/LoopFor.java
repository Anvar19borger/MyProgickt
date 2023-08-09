package lesson_10;

public class LoopFor {
    public static void main(String[] args) {
       /*
        for ([начальные значения] ; [условие]; [изменение счетчика]) {
            тело цикла
        }

        */

        int j = 0;
        while (j < 10) {
            System.out.print(j + " ");
            j += 5;
        }
        System.out.println(j);
        System.out.println();
        System.out.println("End while loop");

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("End for loop");

        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i = i + 5) {
            System.out.println(i);
        }

        /*
        // минимально достаточное инициализация цикла for
        for ( ; ; ){ // бесконечный цикл, в котором отсутствуют блок инициализация, блок условия и блок инкремента
            System.out.println("hello");
        }
         */

//        Вывести все числа от 10 до 0
        int y = 10;
        int i;
        // код изменяющий i
        i = 14;
        for (int a = 0; i >= 0; i--, a++) { // в блоке изменения счетчиков, могут изменяться несколько переменных
            System.out.println(i + ":" + a);
        }
        System.out.println();
        System.out.println(i);

        int[] array = {5, 10, 43, 545, -10, -23, 0, 15};

        /*
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
        System.out.println();
        */


        /*
        // вывести на экран все числа от 5 до 20;
        for (int k = 5; k <= 20; k++) {
            System.out.println(k);
        }
        */

        // int[] array = {5, 10, 43, 545, -10, -23, 0, 15};

        System.out.println(" =============== ");
        int forSearch = 545; // вывести на экран индекс элемента по заданному значению
        int index = -1;

        for (int k = 0; k < array.length; k++) {
            if (array[k] == forSearch) {
                index = k;
                System.out.println("Совпадение найдено");
                if (index == 3) {
                    continue; //break
                }
                System.out.println("Else ");

            } else {
                System.out.println("число " + array[k] + " не равно " + forSearch);
            }
        }

        System.out.println(index);
        System.out.println();

        System.out.println("==================");
        // Распечатать 10 раз цифры от 0 до 4

        for (int k = 0; k < 10; k++) {
            System.out.print(k + ": ");
            for (int l = 0; l < 5; l++) {
                System.out.print(" test ");
                if (k  == 3) break;
                System.out.print(l + " ");
            }
            System.out.println();
        }

        int a = 5;
        // a / 2 -> 2, остаток = 2
        // boolean b = a % (2...9) == 0; //
//        System.out.println(b);

    }
}
