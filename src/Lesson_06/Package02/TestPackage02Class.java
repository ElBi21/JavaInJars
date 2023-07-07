package Lesson_06.Package02;

public class TestPackage02Class {
    public static void TestPackage02 () {
        // Shows the difference between private and package-private

        Powers powerObject = new Powers();

        System.out.println(powerObject.ninth); // Access to a public field
        // WRE: System.out.println(p.tenth); // Access to a private field (failed!)
        System.out.println(powerObject.twelfth); // Access to a protected field
        // Protected seems to behave like public, but it actually differs
    }
}
