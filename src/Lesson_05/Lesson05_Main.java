package Lesson_05;

public class Lesson05_Main {
    public static void main(String[] args) {
        FirstClass objClassOne = new FirstClass(3);
        objClassOne.printString("[CLASS 1] valueOne = " + objClassOne.valueOne +
                ", valueTwo = " + objClassOne.valueTwo);
        System.out.println("[CLASS 1] Note how valueTwo has as default value " + objClassOne.valueTwo);
        objClassOne.plus();

        System.out.print("\n");

        SecondClass objClassTwo = new SecondClass(30, 20, 50);
        objClassTwo.printString("[CLASS 2] SecondClass: valueOne = " + objClassTwo.valueOne +
                ", valueTwo = " + objClassTwo.valueTwo); // inherited method

        System.out.println("[CLASS 2] valueThree = " + objClassTwo.valueThree); // original field of SecondClass
        objClassTwo.randomWord(); // original method of SecondClass

        objClassTwo.plus("[CLASS 2] Overloaded plus() method"); // overloading
        objClassTwo.plus(); // overriding
        System.out.println("[CLASS 2] ...because valueTwo = " + objClassTwo.valueTwo);
        System.out.println("[CLASS 2] Now we set valueTwo to " + 10);
        objClassTwo.valueTwo = 10;

        System.out.println("[CLASS 2] Normal valueTwo = " + objClassTwo.valueTwo);
        objClassTwo.upperValueTwo();

        System.out.print("\n");

        FirstClass objClassThree = new SecondClass(777, 888, 999);
        objClassThree.printString("[CLASS ?] valueOne = " + objClassThree.valueOne +
                ", valueTwo = " + objClassThree.valueTwo + ", valueThree = ?");

        // System.out.println("fourtytwo = " + objClassThree.fourtytwo); // a field of SecondClass (NO!)
        // objClassThree.blorg(); // NO!
        // objClassThree.blah(100); // NO!

        objClassThree.plus(); // the plus method of SecondClass is executed
        System.out.println("[CLASS ?] ...although valueTwo = " + objClassThree.valueTwo); // the b of FirstClass is read
        // in a slogan: methods are dispatched dynamically, attributes statically
    }
}