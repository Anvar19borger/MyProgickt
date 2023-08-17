package lesson_21.homework20;

public class MainDogs {
    public static void main(String[] args) {

        System.out.println(Dog.MULTIPLIER);
        System.out.println(Dog.getTotalJumpCounter());

        Dog dog1 = new Dog("Dog1", 100);
        Dog dog2 = new Dog("Dog2", 150);

        dog1.whoAmI();
        System.out.println(dog1.getName() + ", Мой макс прыжок " + dog1.getMaxJumpHeight());

        dog2.whoAmI();
        System.out.println(dog2.getName() + ", Мой макс прыжок " + dog2.getMaxJumpHeight());

        dog1.getBarrier(150);
        dog1.getBarrier(150);

        dog2.getBarrier(150);
        dog2.getBarrier(150);

        System.out.println();
        // Dog.totalJumpCounter = 10; // Открытое поле. Плохо. Надо исправлять
        System.out.println("Все собаки совершили " +  Dog.getTotalJumpCounter() + " прыжков");

    }
}
