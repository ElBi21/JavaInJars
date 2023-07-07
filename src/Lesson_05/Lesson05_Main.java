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
                ", valueTwo = " + objClassTwo.valueTwo); // Inherited method from FirstClass

        System.out.println("[CLASS 2] valueThree = " + objClassTwo.valueThree); // Original field of SecondClass
        objClassTwo.randomWord(); // Original method of SecondClass

        // In this case we are overloading the method: since SecondClass has two plus() methods, we are using the one
        // with the aString parameter
        objClassTwo.plus("[CLASS 2] Overloaded plus() method");

        // Here we are choosing to use the plus() method without parameters, but which of the two methods are
        // we using? We are using the method provided by SecondClass, and not the one given by FirstClass. We call this
        // procedure (so using a method of a sub-class that replaces the method of the super class) overriding
        objClassTwo.plus();
        System.out.println("[CLASS 2] ...because valueTwo = " + objClassTwo.valueTwo);

        System.out.println("[CLASS 2] Now we set valueTwo to " + 10);
        objClassTwo.valueTwo = 10;
        System.out.println("[CLASS 2] Normal valueTwo = " + objClassTwo.valueTwo);
        objClassTwo.upperValueTwo();

        System.out.print("\n");

        // Now, the next line is an example of what is called polymorphism: the possibility of using an object of a
        // derived class as an object of the super class.
        FirstClass objClassThree = new SecondClass(777, 888, 999);

        objClassThree.printString("[CLASS ?] valueOne = " + objClassThree.valueOne +
                ", valueTwo = " + objClassThree.valueTwo + ", valueThree = ?");

        // Can we use the methods from class SecondClass with objClassThree? The answer is no: it's true that it is an
        // object of the class SecondClass, but we declared that its type is of FirstClass. This means that such object
        // will be treated as one of FirstClass. As a consequence, we won't be able to use any attribute or method of
        // SecondClass, but we will be able to use all the attributes and methods of FirstClass.

        // WRE: System.out.println("valueThree = " + objClassThree.valueThree); // a field of SecondClass (NO!)
        // WRE: objClassThree.randomWord(); // NO!

        // Now, what if we execute a method? Say that we execute the plus() method. What will happen?
        objClassThree.plus();
        // We can see that the plus() method of SecondClass is executed. What we said before it's not entirely true:
        // it's true that the methods from SecondClass are not available, but override still happens. This is valid only
        // if there exists a method in both class that:
        //  - has the same name;
        //  - takes the same parameters;
        //  - returns the same type of values.
        // On the other hand, attributes don't override. In general, we can represent polymorphism in this way:
        //
        //   Attributes are of ClassOne, they DON'T ovveride
        //         ||
        //         \/
        //      ClassOne anObject = new ClassTwo()
        //                                  /\
        //                                  ||
        //                      Methods are of ClassTwo, they override
        //

        System.out.println("[CLASS ?] ...although valueTwo = " + objClassThree.valueTwo);
        // the valueTwo of FirstClass is read

        /* In a slogan: methods are dispatched dynamically (they can override), attributes statically
         * (they can't override). Static methods CANNOT BE OVERRIDE by other methods.
         */
    }
}