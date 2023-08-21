package lesson_23;

public class MainTest {
    public static void main(String[] args) {
        BusDriver driver = new BusDriver("Bob", 32);
        System.out.println(driver.toString());

        driver.addCategories("C");
        System.out.println(driver.toString());

    }
}