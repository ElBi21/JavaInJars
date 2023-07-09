package Lesson_10;

public class Generics <E> {
    public void printAnything() {
        System.out.println("Anything. What? You told me to print anything");
    }

    public void printParam (E x) {
        System.out.println(x);
    }
}
