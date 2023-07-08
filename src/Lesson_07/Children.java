package Lesson_07;

public class Children {
    // This class has static fields: this means that such fields will be equal for all the class
    public static int childrenCounter = 0; // Gets incremented every time a new child is born
    private final int childID; // Each child has its own ID
    private final String name;

    public Children(String name) {
        this.name = name;
        this.childID = childrenCounter;
        childrenCounter++; // A child's ID is its position in the order of birth
    }

    /** Prints in the console the name and the ID of the object*/
    public void whoAmI () {
        System.out.println("I am " + name + ". My ID is " + childID);
    }
}
