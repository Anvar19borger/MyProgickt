package lesson_24;

import lesson_24.Animal;

public class Cat extends Animal {

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("I am eating");
    }
}