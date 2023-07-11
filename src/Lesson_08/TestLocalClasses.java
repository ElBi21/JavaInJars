package Lesson_08;

public class TestLocalClasses {
    int attributeOne = 7;

    {
        int attributeTwo = attributeOne;
    }
    // This is a block, but not a statement!
    // A block is a group of zero or more statements between balanced braces
    // and can be used anywhere a single statement is allowed

    // WRE: int attributeThree = attributeTwo; // attr2 is out of its scope

    class Inner { // An inner class
    }

    public int aRandomMethod() {
        int localVar = 3;

        /* Local classes have only access to "effectively final" local variables */
        class LocalInner { // Local class inside the method aRandomMethod()
            int anotherMethod() {
                System.out.println(attributeOne); // ok, access to a member of the enclosing class
                System.out.println(localVar); // ok, localVar is "effectively final"

                return 42;
            }

            LocalInner () {

            }
        }

        // Why can local classes only access to final or effectively final local variables? For the way that local
        // classes are made, they persist even after the method gets executed. The decision of keeping local classes'
        // access restricted to local variables comes from the decision to keep the integrity and the predictability of
        // the captured variables

        // In general, we may consider local classes as scopes with the properties of a class

        // WRE: localVar++; // localVar is not effectively final anymore

        return new LocalInner().anotherMethod(); // weirdly enough, this would still be ok if q() were private!

        // what if m() returned an object of *local* type LocalInner!?
        // WRE: return new LocalInner(); // Must change the return type of aRandomMethod()
    }

    public static void TestLocalClass () {
        Inner I;
        // WRE: LocalInner J; // LocalInner only visible within the body of m()

        Object localClassObject = new TestLocalClasses().aRandomMethod();
        System.out.println(localClassObject);
    }
}
