package Lesson_06.Package02;

public class TestPackage02Class {
    public static void TestPackage02 () {
        //shows the difference between private and package-private

        Powers p = new Powers();

        System.out.println(p.ninth); // access to a public field
        // System.out.println(p.tenth); // access to a private field (failed!)
        System.out.println(p.twelfth); // access to a protected field
        // protectd seems to behave like public, but...
    }
}
