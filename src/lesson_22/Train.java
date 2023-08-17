package lesson_22;

// Если мы задействуем механизм наследования,
// Классы ОБЯЗАТЕЛЬНО должны иметь связь IS-A
public class Train extends Vehicle{
    public Train(String model, int yearOfManufacture) {
        super(model, yearOfManufacture);
    }


}