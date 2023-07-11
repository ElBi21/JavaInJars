package Lesson_11;

public class TestAnonymous {
    // When creating anonymous classes, there are mainly two ways: we can either extend a class or implement an
    // interface
    public static int what = 3;


    public static void TestAnonymousClasses() {
        String greeting = "Hello";

        Readable<String> anonymousByExtension = new MyReadable<>(greeting) {
            // This anonymous class extends MyReadable<String>, and creates a new get() method, which will override the
            // get() method in MyReadable. When an anonymous class is created by extending another class, it has the
            // same restrictions of the local classes, such as being able to access to only final (or effectively final
            // variables) present inside the "scope". The scope, in this case, is the method that contains the class.

            MyReadable<Integer> newItem = new MyReadable<>(43); // I can use the constructor

            public String get() {
                // WRE: greeting = greeting + "Ayo!"; // Will return error because greeting has to be either final or
                //      effectively final
                System.out.println(greeting);
                return super.get();
            }
        };

        Readable<Integer> anonymousByImplementation = new Readable<Integer>() {
            // In this other example of anonymous class, we made one by implementing the interface Readable<Integer>. In
            // this case, we can only use the default constructor of the interface itself

            /*public Integer wow() {
                return 3;
            }*/

            @Override
            public Integer get() {
                return 42;
            }
        };

        System.out.println(anonymousByExtension.get());
        System.out.println(anonymousByImplementation.get());

        // Since Java 8, Java supports lambda expressions. They are anonymous functions that can perform operations on
        // the spot. A lambda expression has the body
        //
        //      Interface<Type> nameVariable = (parameter1, parameter2, ...) -> {operations};
        //
        // They can only exist for interfaces where there are abstract methods. In this case, the lambda expression is
        // constructing an instance of the interface Readable of type String, with the value "expression!"
        Readable<String> z = () -> "expression!";
        System.out.println("A lambda " + z.get());
    }
}
