package homework07;

import java.util.Random;
import java.util.Scanner;

public class HW07 {
    public static void main(String[] args) {
        /*
        Task 1 (Использовать оператор switch)

Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int answer = scanner.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Error!");
        }

        /*
        Реализовать с использованием switch
        Ваш ребенок принес оценку за контрольную работу по математике. В школе 12 бальная система.
        Запишите в переменную случайное число от 0 до 12. Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
        На сегодня у него осталось 45 минут. (записать в переменную)
        Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня времени 1 час
        от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут от 4 до 6 -> Нейтральные слова + ко времени 15 минут 3 ->
        Огорчитесь. Минус 30 минут ко времени. Если оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
        Выведите на экран оставшееся на сегодня время для просмотра ТВ
         */

        {
            int note;
            int restMinutesForWatchTv = 45; //min

            Random random = new Random();
            note = random.nextInt(13);
            note = 14;

            System.out.println("Оценка: " + note);
            if (note < 1 || note > 12) {
                System.out.println("Что-то не так с оценкой");
            } else {
                switch (note) {
                    case 10:
                    case 11:
                    case 12:
                        System.out.println("Я рад!");
                        restMinutesForWatchTv += 60;
                        break;
                    case 7:
                    case 8:
                    case 9:
                        System.out.println("Слова похвалы");
                        restMinutesForWatchTv += 45;
                        break;

                    case 4:
                    case 5:
                    case 6:
                        System.out.println("Нейтральные слова");
                        restMinutesForWatchTv += 15;
                        break;
                    case 3:
                        System.out.println("Огорчился");
                        restMinutesForWatchTv -= 30;
                        break;
                    case 2:
                    case 1:
                        System.out.println("Трагедия");
                        restMinutesForWatchTv = 0;
                        break;
                    default:
                        System.out.println("Дите, да ты жулик!");

                }
            }


            System.out.println("На сегодня осталось " + restMinutesForWatchTv + " минут");

        }

    }

}
