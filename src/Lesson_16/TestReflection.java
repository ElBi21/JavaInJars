package Lesson_16;

import java.lang.reflect.*;

/** It creates an object of type Class and then uses it to construct an object of the corresponding class and call one
 * of its methods. Class is a generic type.
 */
public class TestReflection {
    public static void printMembers(Member[] members) {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public static void TestForReflection(String args[]) throws ClassNotFoundException, InstantiationException, InvocationTargetException, IllegalAccessException {
        String aString = "A string!";

        // In Java, with reflection, there are three ways for creating a Class object representing the class String:
        System.out.println("Via getClass(): " + aString.getClass());    // By using the getClass() method
        System.out.println("Via Class.class: " + String.class);         // By using the literal of the class
                                                                        // (in this case "String")
        System.out.println("Via Class.forName(): " + Class.forName("java.lang.String"));    // By using the class' full name
        System.out.println("Via Class.forName().getSimpleName(): " + Class.forName("java.lang.String"));

        // The class Class is indeed a class, but is a generic class. It doesn't have any constructor. We could try to
        // instantiate the class, but we would get an error

        // WRE: Class myClass = new Class();

        // WRE: Class<Integer> myIntegerClass = Class.forName("java.lang.Integer");
        //      Class.forName() provides a capture of ?, so it can't be used with Class<Integer>. We can use though the
        //      raw type, even if it's usually not suggested to use it

        Class myIntegerClass = Class.forName("java.lang.Integer");  // We could also use Class<?> myIntClass

        Class<?> aClass = Class.forName(args[0]);   // We can use <?> because we don't know which class is inside args
        System.out.println(aClass);

        System.out.println("> Constructors: ");
        printMembers(aClass.getDeclaredConstructors());
        System.out.println("> Fields: ");
        printMembers(aClass.getDeclaredFields());
        System.out.println("> Methods: ");
        printMembers(aClass.getDeclaredMethods());

        Class<?> LokiClass = Class.forName("Lesson_16.HuskyDog");
        Method firstMethod = LokiClass.getDeclaredMethods()[0];
        Method secondMethod = LokiClass.getDeclaredMethods()[1];

        System.out.println(firstMethod + "\n" + secondMethod);

        // We can save in a variable a constructor, and then call it from outside. If we use the normal class name we
        // just use the first one declared
        Object aNewLoki = LokiClass.newInstance();
        firstMethod.invoke(aNewLoki);

        Constructor makeANewNamedHusky = LokiClass.getDeclaredConstructors()[1];
        Object anotherHusky = makeANewNamedHusky.newInstance("CrazyDog");
        secondMethod.invoke(anotherHusky);
    }
}
