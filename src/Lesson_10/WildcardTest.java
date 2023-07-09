package Lesson_10;

public class WildcardTest {
    public static void TestWildcard () {
        // Test for the wildcard

        // In Java, we use the wildcard "?" when we want to generalize a class, a method or a variable in order to
        // tell Java that we don't know a priori the type of such object. Its type gets determined at compile time. It's
        // important to say that "?" is not a type, but rather a parameter for the diamond operator (so the angle
        // brackets) How do we use the wildcard though?

        // WRE: ? y; // "?" is not a type!
        Generics<?> x;  // In this example, we don't know what the type of Generics will be
        Generics<String> genericsString = new Generics<String>();
        Generics<?> ao = new Generics<String>();
        x = genericsString; // Generics<String> is a subtype of Generics<?>
        // WRE: Generics<Object> go = new Generics<String>(); // We can't do this because Generics<String> is not a
        //      sub type of Generics<Object>. Instead, Generics<?> myVar = new Generics<String>(); is possible because
        //      the actual type of myVar will be known (and determined) at compile time

        // WRE: x = new Generics<?>(); // Cannot create an instance of Generics<?>, and again, that's because ? is not a
        //      type, so it can't be used to create a Generics object of type "?"

        x.printAnything();
        // WRE: x.printParam("Green");
        // The compiler doesn't know what's in x, so it is unable to tell if printParam would be capable of printing a
        // String (because the actual type of x is <?>, even if we assigned to it a Generics of type String the type
        // still remains "?"). In order to maintain type safety, the compiler will prevent the calls to the printParam()
        // method, making so that all


        x.printParam(null); // ...however you can do this, because null is a valid value for any reference type, but
        // it's not a valid value for primitive types. If we had to make any operation with the parameter x, then we
        // would have a NullPointerException

        Generics<ClassOne> y = new Generics<ClassOne>();
        Generics<ClassTwo> z = new Generics<ClassTwo>();
        Generics<ClassThree> w = new Generics<ClassThree>();

        WildcardTest t = new WildcardTest();

        // t.extMethod(y); // ClassOne does not extend ClassTwo
        t.extMethod(z);
        t.extMethod(w);

        t.supMethod(y);
        t.supMethod(z);
        // t.supMethod(w); // ClassThree is not a supertype of ClassTwo
    }

    /** May be applied to a {@code Generics<T>} for any subtype {@code T} of {@link ClassTwo}; */
    public void extMethod (Generics<? extends ClassTwo> x) {
        System.out.println("I extend, therefore I work fine!");
    }

    /** May be applied to a {@code Generics<T>} for any supertype {@code T} of {@link ClassTwo}; */
    public void supMethod (Generics<? super ClassTwo> x) {
        System.out.println("I an super, therefore I work fine!");
    }
}
