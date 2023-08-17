package lesson_20;

public class Dog {
    private String name;
    private int jumpHeight;
    private int maxJumpHeight;

    int increaseByTraining = 10;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public void whoAmI() {
        System.out.println("Я собака " + name + ", и я умею прыгать на " + jumpHeight + " см");
    }

    private void jump() {
        System.out.println("Я прыгаю!");
    }

    private void jump(int height) {
        System.out.println("Я прыгаю на высоту " + height + " см");
    }

    public boolean getBarrier(int barrierHeight) { // 100, 200, 150
        //      100    <= 106 -> true       &&  98 < 100 -> true
        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            // 98 < 100 -> true
            while (jumpHeight < barrierHeight) {
                training();
            }
        }

        boolean result;

        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
            result = true;
        } else {
            System.out.println("Я не могу перепрыгнуть барьер высотой: " + barrierHeight);
            result = false;
        }

        System.out.println("End get barrier. Текущий прыжок " + jumpHeight);
        return result;
    }

    public void training() {
        System.out.println("start training");  // есть собака с тек.прыжок 53, 106 -> барьер -> 105 (бесконечный цикл)
        //98 -> 106 // 108 <= 106

        //2. jump 50 -> maxJump 100 ->
        // jump [0..90] -> if
        if (jumpHeight + increaseByTraining <= maxJumpHeight) { // 50 -> 100 -> x <= 100 - 10 (90)
            jumpHeight += increaseByTraining;
            System.out.println("Я потренировался!");
            whoAmI();
        } //-> [91...infinity]
        // [9    100 - [91..inf] < 10 ==> будет true при значения [91-99]
        else if (maxJumpHeight - jumpHeight < increaseByTraining) {
            System.out.println("Small training start: jump = " + jumpHeight + "; max = " + maxJumpHeight);
            jumpHeight = maxJumpHeight;
        } else {
            System.out.println("Больше натренировать не могу, сорян!");
        }
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getIncreaseByTraining() {
        return increaseByTraining;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncreaseByTraining(int increaseByTraining) {
        this.increaseByTraining = increaseByTraining;
    }
}
