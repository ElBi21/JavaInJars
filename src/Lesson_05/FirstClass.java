package Lesson_05;

/** In this class we have two attributes (they are {@code public} for the sake of the example), two constructors and a couple
 *  methods. The two values are standard for each element of the class, but can be modified.*/
public class FirstClass {
    public int valueOne = 1;
    public int valueTwo = 2;

    public FirstClass (int valueOne) {
        this.valueOne = valueOne;
    }

    public FirstClass (int valueOne, int valueTwo) {
        this(valueOne);
        this.valueTwo = valueTwo;
    }

    public void printString (String toPrint) {
        System.out.println(toPrint);
    }

    public void plus () {
        System.out.println("[CLASS 1] valueOne + valueTwo = " + (valueOne + valueTwo));
    }
}
