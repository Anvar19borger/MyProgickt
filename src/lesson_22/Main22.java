package lesson_22;

public class Main22 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("f-132", 2000);

        System.out.println(vehicle.toString());

        /*
        vehicle.gas();
        vehicle.breaking();
        System.out.println(vehicle.getModel());

         */

        Vehicle vehicle1 = new Vehicle("f-132", 2000);
        System.out.println(vehicle1.toString());
        /*
        vehicle1.setModel("f-133");
        vehicle1.setModel("f-132");
        System.out.println(vehicle1.toString());

         */


        System.out.println("================");
        Car car = new Car("Polo", 2011);

        System.out.println(car.getModel());
        System.out.println(car.getYearOfManufacture());
        System.out.println(car.toString());
        car.gas();
        car.breaking();

        car.goToRoute(1000);
        System.out.println(car.toString() + " Сейчас пробег: " + car.getMileage());

        System.out.println();
        System.out.println("+++++++++++++++++++");
        Bus bus = new Bus("Sprinter", 2022, 23);
        System.out.println(bus.toString());

        bus.gas();
        bus.goToRoute(150);
        System.out.println("Сейчас в автобусе: " + bus.getCountPassenger());

        bus.takePassenger();
        bus.takePassenger();
        bus.dropPassenger();

        System.out.println("Сейчас в автобусе: " + bus.getCountPassenger());


    }
}