package Lesson_08;
import Lesson_04.EmptyStackException;
import Lesson_03.ArrayStack;
import Lesson_04.ListStack;

public interface Stack {
    /* Interfaces may have fields, which are implicitly public static final */
    int FOURTYTWO = 42;
    // Same as: public static final int FOURTYTWO = 42;

    boolean is_empty ();
    void push (int v);
    int pop () throws EmptyStackException;

    /**Dumps s1 in s2*/
    static void dump (Stack s1, Stack s2) throws EmptyStackException {
        // WRE: is_empty(); // NO: non-static methods cannot be referenced from a static context

        while (!s1.is_empty())
            s2.push(s1.pop());
    }

    // What does the default keyword do? Prior to Java 8, interfaces could only declare abstract methods. Now, with the
    // default keyword, we can set up a default method that will get executed if we tried to call it through the class
    // implementing this interface
    default void printStack () {
        if (is_empty()) {
            System.out.println();
            return;
        }
        try {
            int val = pop();
            System.out.print(val + " ");
            printStack();
            push(val);
        }
        catch (Exception e) {
            System.out.println("shouldn't happen!");
        }
    }
}
