package lesson_20;

public class Car {
    private String name;
    private int powerPS;
    static private int numberOfCars;

    public Car(String name, int powerPS) {
        this.name = name;
        this.powerPS = powerPS;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public int getPowerPS() {
        return powerPS;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    static void showStaticInfo() {
        System.out.println("Всего машин: "+ numberOfCars);
    }
}
