package Lesson_06.Package03;

public class ClassTwo extends ClassOne{
    public void printSomething () {
        System.out.println("[PACKAGE 03] [CLASS 02] Something!");
    }

    public void randomWord () {
        super.printSomething();
        this.printSomething();
    }
}
