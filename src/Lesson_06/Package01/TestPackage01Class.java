package Lesson_06.Package01;
import Lesson_06.Package02.Powers;

public class TestPackage01Class {
    public static void TestPackage01 () {

        // plays with access modifiers

        Powers p = new Powers();
        System.out.println(p.ninth); // OK: public field!
        // System.out.println(p.tenth); // clearly NOT: private field!
        // System.out.println(p.eleventh); // NO: protected field!
        // System.out.println(p.twelfth); // NO: "package-private" field!


        SuperPowers ps = new SuperPowers();
        ps.printPowers(); // prints the eleventh power but cannot access the twelfth
    }
}
