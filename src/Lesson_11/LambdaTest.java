package Lesson_11;

import java.util.*;
import java.util.function.Consumer;

public class LambdaTest {
    public static void TestLambda() {
        List<String> words = Arrays.asList("Hey", "there", "I", "got", "split");

        // Since List extends Collector, which in turn extends Iterable, we can iterate on the list. After Java 8, the
        // interface Iterable provides a new way to iterate, and such way is the forEach method, which inputs an object
        // of type Consumer. Consumer is a generic functional interface with a (unique) abstract void method accept,
        // which is precisely (T t).

        for(String word : words) {
            System.out.println(word);
        }

        // Since Consumer is an interface, we can design our own version of the accept() method. We can do it either
        // with a lambda expression or through an anonymous class

        Consumer<String> printer = new Consumer<>() {
            public void accept(String s) {
                System.out.println(s);
            }
        };

        System.out.println("\n\n");
        words.forEach(printer);

        // Via a lambda expression it would look something like the following

        Consumer<String> printerLambda = (String s) -> System.out.println(s);

        System.out.println("\n\n");
        words.forEach(printerLambda);

        // Another possible way is the following

        System.out.println("\n\n");
        words.forEach((String s) -> System.out.println(s));
    }
}

