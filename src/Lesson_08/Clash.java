package Lesson_08;

public class Clash implements Interface1, Interface2 {
    // Commenting out method print() would create a clash between those inherited by the interfaces. When implementing
    // two interfaces and developing a method such as print() (so a method declared in both interfaces). This occasion
    // allows us to discuss how a class can implement multiple interfaces, while it can't extend multiple classes

    public void print () {
        System.out.println("Override!");
    }
}
