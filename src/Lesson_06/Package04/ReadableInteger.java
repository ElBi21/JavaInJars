package Lesson_06.Package04;

/** In interfaces, static elements belong only to the interface where they have been declared. This is why we don't
 *  need to implement {@code sumWith()} or {@code value} in {@link IntegerVar}*/

public interface ReadableInteger {
    static final int value = 42;

    static void sumWith (int v) {
        System.out.println(value + v);
    }

    int get ();
}
