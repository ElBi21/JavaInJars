package Lesson_06.Package01;
import Lesson_06.Package02.Powers;

public class TestPackage01Class {
    public static void TestPackage01 () {
        Powers powersObject = new Powers();
        System.out.println("Printing ninth: " + powersObject.ninth); // OK: public field!
        // WRE: System.out.println("Printing tenth: " + powersObject.tenth); // clearly NOT: private field!
        // WRE: System.out.println("Printing eleventh: " + powersObject.eleventh); // NO: protected field!
        // WRE: System.out.println("Printing twelfth: " + powersObject.twelfth); // NO: "package-private" field!

        // Since this class doesn't extend the Powers class of Package02, we can't access to the protected or
        // package-private values

        SuperPowers superPowersObject = new SuperPowers();
        superPowersObject.printPowers(); // This will print the eleventh power but cannot access the twelfth, since it's
                                         // package-private.
    }
}
