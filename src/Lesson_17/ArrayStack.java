package Lesson_17;

import Lesson_03.EmptyStackException;
import Lesson_03.FullStackException;

/** Usual implementation of the stack adt; a consistency condition on the top index is annotated */

public class ArrayStack {
    protected int[] stk;

    @ArrayConsistency(
            condition = "-1 <= top < stk.length"
    )
    private int top = -1;

    ArrayStack(int l) {
        stk = new int[l];
    }

    public int length() {
        return stk.length;
    }

    public void push(int v) throws FullStackException {
        if (top == stk.length - 1) throw new FullStackException(v);
        top = top + 1;
        stk[top] = v;
    }

    public int pop() throws EmptyStackException {
        if (top < 0) throw new EmptyStackException();
        top = top - 1;
        return stk[top + 1];
    }
}
