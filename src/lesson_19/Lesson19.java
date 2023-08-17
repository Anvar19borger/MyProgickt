package lesson_19;

public class Lesson19 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.whoAmI();

//        cat.name = "";
//        cat.age = -2;
//        cat.weight = -1000;
//        int myAge = cat.age;
        cat.whoAmI();
        cat.setName("Barsik");
        cat.setAge(-2);
        cat.setWeight(1000);

        System.out.println("Имя " + cat.getName());
        System.out.println("Возраст " + cat.getAge());
        System.out.println("Вес " + cat.getWeight());

        cat.startRunning(5);



    }
}
