package Lesson_06.Package03;

public class TestPackage03Class {
    public static void TestPackage03 () {
        // In Package03 there are three classes, and each class extends the one before. The situation is the following:
        //
        //  ClassOne
        //   │
        //   │ is extended by
        //   │
        //   └--> ClassTwo
        //          │
        //          │ is extended by
        //          │
        //          └--> ClassThree
        //

        ClassThree objectClassThree = new ClassThree();

        // The randomWord() method has
        objectClassThree.randomWord(); // this is dynamic, super is static
    }
}