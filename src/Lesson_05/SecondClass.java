package Lesson_05;

/** This class extends the previous class FirstClass. Here we can see what happens when we override the values*/

public class SecondClass extends FirstClass {
    public int valueTwo = 7; // override
    public int valueThree = 42; // original field of class SecondClass

    public SecondClass(int valueOne, int valueTwo, int anotherValue) {
        super(valueOne, valueTwo); // calls the constructor of superclass FirstClass
        // what would the difference be with calling super(valueOne, b)?
        this.valueTwo = valueTwo;
        valueThree = anotherValue;
    }

    public void randomWord () { // original method of class SecondClass
        System.out.println("[CLASS 2] I'm crazy");
    }

    public void plus (String aString) { // overload
        System.out.println(aString);
    }

    public void plus () { // override
        System.out.println("[CLASS 2] valueOne + valueTwo = " + (valueOne + this.valueTwo));
    }

    public void upperValueTwo () { // reads value valueTwo of superclass FirstClass
        System.out.println("[CLASS 2] Super valueTwo (from Class 1) = " + super.valueTwo);
    }
}
