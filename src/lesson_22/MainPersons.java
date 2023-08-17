package lesson_22;

public class MainPersons {
    public static void main(String[] args) {
        Person person = new Person("Bob");
        person.setKind(true);
        System.out.println(person.getName() + " - ребенок? " + person.isKind());
        System.out.println(person.isHaveSpecialRequirements());
        person.move();

        Passenger passenger = new Passenger("John");
        System.out.println(passenger.getName() + " - ребенок? " +passenger.isKind() );

        System.out.println(passenger.toString());

        Passenger passenger1 = new Passenger("Stella");
        passenger1.setHaveSpecialRequirements(true);

        System.out.println(passenger1.toString() + " haveSpecialRequirements: " + passenger1.isHaveSpecialRequirements());

    }
}
