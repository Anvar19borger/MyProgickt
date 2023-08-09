package lesson_06;

import java.util.Random;
import java.util.Scanner;

public class Lesson06 {

    public static void main(String[] args) {

        int x = 10;

        if (x < 10) System.out.println("Priwet wsem");

        if (x == 10) {
            x = x - 1;
            System.out.println("x in if: " + x);
        }
        System.out.println(" x after in:" + x);


        Scanner scanner = new Scanner(System.in);

        System.out.println(" Wwedite chislo 1: ");
        int userInputInt = scanner.nextInt();
        if (userInputInt == 1) {
            System.out.println("Wi weli cheslo 1");


        } else if (userInputInt == 3) {
            System.out.println(" Wi je wweli 3, a ne 1");
        } else {
            System.out.println("Wi wweli cto to ne ponjatnoe");

        }


        System.out.println(" Wi wweli ");


        Random random = new Random();
        int money = 100;
        int note = random.nextInt(5);

        System.out.println("Ocenka:" + note);

        if (note == 5) {
            money += 20;

        } else if (note == 4) {
            money += 10;

        } else if (note == 3) {

        } else if (note == 2) {
            money -= 20;
        } else if (note == 1) {
            money = 0;
        } else {
            System.out.println(" Poluchena ne korektnoja otcenka!");
        }
        System.out.println(" U rebenka  ostalos: " + money + " monet");

    }






}
