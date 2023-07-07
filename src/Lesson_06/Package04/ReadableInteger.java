package Lesson_06.Package04;

public interface ReadableInteger {
    static final int value = 42;

    static void sumWith (int v) {
        System.out.println(value + v);
    }

    int get ();
}
