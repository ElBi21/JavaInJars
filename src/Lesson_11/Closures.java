package Lesson_11;

/** We call a Closure a lambda expression that can access to values inside a class (or in general, other values that are
 *  not the ones provided in the expression's parameters)
 * */
public class Closures {
    static int index;

    public static void TestClosures() {
        index = 0;
        Runnable runnable0 = () -> System.out.println(index);

        index = 1;
        Runnable runnable1 = () -> System.out.println(index);

        index = 2;

        runnable0.run();
        runnable1.run();
    }
}
