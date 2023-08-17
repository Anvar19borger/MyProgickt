package lesson_20;

public class MathUtils {
    public static int sumOfInts(int x, int... ints) {
        int sum = x;
        for (int value: ints) {
            sum += value;
        }

        return sum;
    }
}