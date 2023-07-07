package Lesson_06.Package01;
import Lesson_06.Package02.Powers;

public class SuperPowers extends Powers {
    // Extends a class of a different package. The field is extended to Powers + SuperPowers

    public void printPowers () {
        // Here the following lines will show the difference between protected and package-private

        System.out.println("Printing eleventh: " + eleventh); // OK: the attribute is inside a protected field! Since we imported the package,
                                      // and this class extends a class of Package02, then this class is connected to
                                      // the space of the class Powers in Package02

        // WRE: System.out.println(twelfth); // NO: package-private field!
    }
}
