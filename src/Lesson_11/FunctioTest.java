package Lesson_11;

public class FunctioTest {
    // Lambda expressions are a quick way to implement a functional interface, without the need of writing an anonymous
    // class. They are more concise
    public static Functio F = (String s) -> (s + s);
    public static Functio F1 = (s) -> s;
    public static Functio F2 = (s) -> (s + " - Some separator - " + s
            + " Oh look, a space! ...and now again the word " + s );

    public static String stringF0 = "Crazy";
    public static String stringF1 = "Wow";
    public static String stringF2 = "42!";

    public static void context (Functio x) {
        System.out.println(x.addString(stringF2));
    }

    public static void TestFunctio() {
        // By doing
        String resultString = F.addString(stringF0);
        // we are basically calling the method addString() provided by the lambda expression. The interface specifies
        // the name of the method, while the expression executes it on the go. We can also print the result:
        System.out.println(resultString);

        // We can also provide directly a lambda expression to the context method. But why can we do that? At the end of
        // the day, the lambda expression is just a Functio object, so instead of first declaring it as a variable and
        // then passing it to the context() method, we just declare it inside the method as its parameter. In this case,
        // this lambda expression, given a String s, will always return "Wow", which is stringF1
        context( ((String s) -> stringF1) );
        context(F1);
        context(F2);
    }
}