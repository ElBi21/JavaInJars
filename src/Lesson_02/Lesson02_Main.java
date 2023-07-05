package Lesson_02;

public class Lesson02_Main {
    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter();
        Counter third = new Counter();

        first.countUp();
        first.countUp();
        first.countUp();

        second.countUp();
        second.countDown();
        second.divideBy(1);

        third.countDown();
        third.countDown();
        third.doubleUpBy(3);

        System.out.print("The value of the first counter is ");
        System.out.println(first.value);

        System.out.print("The value of the second counter is ");
        System.out.println(second.value);

        System.out.print("The value of the third counter is ");
        System.out.println(third.value);
    }
}