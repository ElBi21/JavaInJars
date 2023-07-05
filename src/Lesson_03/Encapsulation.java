package Lesson_03;

public class Encapsulation {
    private int myValue = 0;

    public int get () {
        return myValue;
    }

    public void showValue () {
        System.out.printf("The current value is %s%n", myValue);;
    }

    public void set (int howMuch) {
        myValue = howMuch;
        System.out.printf("The value %s has been set as the primary value of ths object%n", howMuch);
    }

    public void increment (int howMuch) {
        int previousVal = myValue;
        myValue = myValue + howMuch;
        System.out.print("I added ");
        System.out.printf("I added %s to %s, obtaining %s%n", howMuch, previousVal, myValue);
    }
}
