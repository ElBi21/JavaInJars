package Lesson_06.Package02;

public class Powers {
    // In Java there are 4 access modifiers, that work with classes, attributes and methods:
    //  - public: the class/attribute/method can be accessed from anywhere in the code;
    //  - package-private (when no modifier is expressed): the class/attribute/method is accessible in the whole
    //                                                     package;
    //  - protected: the class/attribute/method can be accessed from within the same class, package or eventual
    //               subclasses belonging to the space where the class/attribute/method lies;
    //  - private: the class/attribute/method is accessible only within the same class where it's declared.

    public int ninth = 512;
    private int tenth = 1024;
    protected int eleventh = 2048;
    int twelfth = 4096; // "package-private" (or default)
}
