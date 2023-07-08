package Lesson_08;
import Lesson_03.ArrayStack;
import Lesson_04.ListStack;
import Lesson_04.EmptyStackException;

public class ReverseStack {
    /** Method that reverses a stack by creating two temporary stacks */
    public static void reverse (Stack s) throws EmptyStackException {
        ListStack tmp1 = new ListStack();
        ListStack tmp2 = new ListStack();
        Stack.dump(s, tmp1);
        Stack.dump(tmp1, tmp2);
        Stack.dump(tmp2, s);
    }

    public static void TestStackWithInterfaces () throws EmptyStackException {
        /* Tests reverse on two different stack implementations */

        Stack SL = new ListStack();
        Stack SA = new ArrayStack();

        SL.push(7);
        SL.push(9);
        SL.push(42);
        SL.printStack();
        reverse(SL);
        SL.printStack();

        SA.push(55);
        SA.push(44);
        SA.printStack();
        reverse(SA);
        SA.printStack();
    }
}
