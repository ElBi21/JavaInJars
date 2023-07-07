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

        // The randomWord() method has two instructions inside:
        //  - calls super.printSomething()
        //  - calls this.printSomething()

        objectClassThree.randomWord();

        // We see that what was printed was the printSomething of ClassOne for the super.printSomething and the
        // printSomething() of ClassThree. This happens because this is dynamic, while super is static. It's similar
        // conceptually to what happens with the methods and the attributes in subclasses: super depends on the
        // class where the method was called (in this case it's ClassTwo, because the method belongs to ClassTwo), while
        // this refers to the object that called the method. If the method was in ClassThree then we would've seen the
        // super print Class 02, while this would've printed Class 03
    }
}