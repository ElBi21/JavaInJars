package Lesson_02;

public class Counter {
    public int value = 0;

    /*
    *  When declaring a method, we can use either "int" or "void":
    *  - "int" requires a return value;
    *  - "void" doesn't return anything.
    */

    public void countUp() {
        value++;
    }

    public void countDown() {
        value--;
    }

    public void doubleUpBy(int multiplier) {
        value = value * multiplier;
    }

    public void divideBy(int divider) {
        if (divider != 0) {
            value = value / divider;
        } else {
            System.out.println("You can't divide a number by 0. The operation was cancelled");
        }
    }
}
