package Lesson_03;

public class FullStackException extends Exception {
    public int value;

    public FullStackException (int v){
        value = v;
    }
}