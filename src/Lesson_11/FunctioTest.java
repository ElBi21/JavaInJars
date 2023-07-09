package Lesson_11;

public class FunctioTest {
    public static Functio F = (String s) -> (s + s);
    public static Functio F1 = (s) -> s;

    public static void context (Functio x) {
        System.out.println(x.compute("42!"));
    }

    public static void TestFunctio() {
        System.out.println(F.compute("Crazy"));
        context((String s) -> "Wow");
    }
}
