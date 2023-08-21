package lesson_24;

public class Main24 {

    public static void main(String[] args) {


        Cat cat = new Cat(); // восходящее преобразование. Происходит автоматически
        Dog dog = new Dog();
        Hamster hamster = new Hamster();

        Cat cat1 = (Cat) cat; // нисходящее преобразование
//        cat1.eat();

        Animal[] animals = new Animal[3];
        animals[0] = cat;
        animals[1] = dog;
        animals[2] = hamster;

        cat.eat();

        for (Animal animal: animals){
            animal.voice();

//            System.out.println(animal.getClass().getName());
//            if (animal.getClass().getName().equals("Cat")) {
//                System.out.println("Cat!");
//            }

            if (animal instanceof Cat) {
                Cat  newCat = (Cat) animal;
                newCat.eat();
            }
        }

//        Object objectCat = new Cat();


//        cat.voice();
//        dog.voice();
//        hamster.voice();



    }
}
