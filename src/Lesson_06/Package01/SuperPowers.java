package Lesson_06.Package01;
import Lesson_06.Package02.Powers;

public class SuperPowers extends Powers {
    // extends a class of a different package

    public void printPowers () {
        // shows the difference between protected and package-private

        System.out.println(eleventh); // OK: protected field!
        // System.out.println(twelfth); // NO: package-private field!
    }
}
