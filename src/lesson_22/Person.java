package lesson_22;

public class Person {

    private String name;
    private boolean isKind;
    private boolean isHaveSpecialRequirements;

    public Person(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println("Я передвигаюсь");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }

    public boolean isHaveSpecialRequirements() {
        return isHaveSpecialRequirements;
    }

    public void setHaveSpecialRequirements(boolean haveSpecialRequirements) {
        isHaveSpecialRequirements = haveSpecialRequirements;
    }

}