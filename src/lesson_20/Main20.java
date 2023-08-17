package lesson_20;

import java.util.Arrays;
public class Main20 {
    int noStatic = 10;
    static int staticInt = 20;
    public static void main(String[] args) {

        Car car = new Car("Bmw", 200);
        Car car1 = new Car("Skoda", 110);
        Car car2 = new Car("Seat", 120);

        // Car.numberOfCars = 13; // !!! Статические поля тоже нужно закрывать от прямого доступа. Инкапсулировать
        System.out.println("Всего создано машин: " + Car.getNumberOfCars());
        Car.showStaticInfo();
        // car1.showStaticInfo(); обращение к статик методу возможно от имени экземпляра класса.
//            Но так делать НЕ НУЖНО!

        System.out.println("=====================");

        // static int a = 1; // не допустимое место для создания static переменной
        staticInt++;
        test();
//            testNotStatic(); нет доступа

        //вызов статического метода класса
        System.out.println("Сумма чисел " + MathUtils.sumOfInts(5, 6, 7, 8));
        Math.sqrt(4); // Класс состоящий только из статических методов. Утилитный класс

    }


    static void test() { // в статических методах есть доступ ТОЛЬКО к статическим классам.
        staticInt++;
        // noStatic++; нет доступа к переменной
    }

    public void testNotStatic() { // в не-статических методах есть доступ ко всем членам класса Статик и не-статик
        staticInt++;
        noStatic++;
        test();
    }

}
