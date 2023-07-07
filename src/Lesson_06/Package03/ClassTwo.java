package Lesson_06.Package03;

public class ClassTwo extends ClassOne{
    public void printSomething () {
        System.out.println("D2");
    }

    public void randomWord () {
        super.printSomething();
        this.printSomething();
    }
}
