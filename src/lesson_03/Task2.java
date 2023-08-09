package lesson_03;

public class Task2 {
    public static void main(String[] args) {
        double preisA = 1000;
        double preisB = 500.0;
        double sum = preisA + preisB;
        System.out.println(" Obschaja summa: " + sum);

        int salle = 10;
        // a * 0,9

        double preisMitSalle =(preisA + preisB) * (double) (100 - salle ) / 100;
        System.out.println(" Summa s wischetom skidki: " + preisMitSalle);

        double sumSalle = sum * salle /100;
        System.out.println(" Summa skidki: " + sumSalle);


    }
}
