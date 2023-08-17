package lesson_17;

public class Lesson17 {

    public static void main(String[] args) {
//        System.out.println();
//        System.out.println("\"Маша\"\n");

        Cat cat = new Cat("Max", 5.0);

//        cat.whoAmI();
//        cat.eat();
//        cat.whoAmI();
//        cat.run();
//        cat.whoAmI();

        cat.startTraining(10);

        cat.whoAmI();

       /*
       Написать класс собака
       Собака должна иметь имя, высоту прыжка
       Должна уметь прыгать и должна уметь тренироваться. За каждую тренировку высота прыжка увеличивается на 10 сантиметров
       Максимальная высота, которую может натренировать собака не может быть больше, чем 2раза высоту первоначального прыжка.

        */

    }
}
