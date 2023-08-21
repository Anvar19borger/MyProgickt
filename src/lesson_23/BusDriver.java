package lesson_23;

import java.util.Arrays;

public class BusDriver {

    private final int id;
    private String name;
    private String[] categories;
    private int age;

    static private int counter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getCategories() {
        return categories;
    }

    public void addCategories(String categories) {
        //TODO
    }

    public void removeCategory(String category) { // str.equals(str1)
        //TODO
    }

    public String toString() {
        return "{id:" + id + "; name: " + name +
                "; categories: " + Arrays.toString(categories) + "}";
    }

    // метод запускающий у водителя функцию "управление автобусом"
    // в параметры метода приходит ссылка
    // на конкретный автобус, которым управляет сейчас водитель
    public void driveBus(Bus bus) {
        System.out.println("Водитель id:" + id +
                " управляет автобусом id:" + bus.getId() + " " + bus.getModel());
    }
}
