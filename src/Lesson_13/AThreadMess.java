package Lesson_13;
import Lesson_03.FullStackException;
import Lesson_03.EmptyStackException;

/** Two threads pop over a stack. If they do not synchronize
 *  (see ArrayStack) they may extract the same element, and one
 *  element may be lost!
 */
public class AThreadMess {
    public static void TestMess() throws EmptyStackException, InterruptedException, FullStackException {
        ArrayStack S = new ArrayStack(10);

        Popper p1 = new Popper(S);
        p1.setName("PopperOne");

        Popper p2 = new Popper(S);
        p2.setName("PopperTwo");

        S.push(33);
        S.push(42);

        S.printStack();

        p1.start();
        p2.start();

        // What's the point in this?
        // Thread.currentThread().sleep(1000);
        // S.pop();
    }
}