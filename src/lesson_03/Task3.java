package lesson_03;

public class Task3 {
    public static void main(String[] args) {
        int temp1 = 24;
        int temp2 = 27;
        int temp3 = 28;
        int temp4 = 25;
        int temp5 = 24;
        int temp6 = 25;
        int temp7 = 28;

        double allgemeineTemp = ((double) temp1 + temp2 + temp3 + temp4 + temp5 + temp6 + temp7) / 7;
        System.out.printf(" Durchschnittstemperatur pro Woche : %.2f ", allgemeineTemp );


    }
}
