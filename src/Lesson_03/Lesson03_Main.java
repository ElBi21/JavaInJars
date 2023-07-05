package Lesson_03;

public class Lesson03_Main {
    public static void main(String[] args) throws Exception {
        encapsulationTest();
        arrayStackTestA();
        arrayStackTestB();
    }

    public static void encapsulationTest() {
        System.out.println("------- Starting Encapsulation Test -------");
        Encapsulation firstObj = new Encapsulation();

        firstObj.showValue();
        firstObj.set(51);
        firstObj.showValue();
        firstObj.increment(43);
        firstObj.showValue();

        int objVal = firstObj.get();

        System.out.println("Can I mix strings with ints? If I can print " + objVal
                + " then that means that it works");
    }

    public static void arrayStackTestA() {
        System.out.println("------- Starting Array Stack Test A -------");
        ArrayStack newArray = new ArrayStack(5);

        // int number = newArray.pop();     // Will return ArrayIndexOutOfBoundsException
        // System.out.println(number);

        newArray.push(32);
        newArray.push(84);
        newArray.push(854);
        newArray.print();
    }


    public static void arrayStackTestB() throws EmptyStackException, FullStackException{
        System.out.println("------- Starting Array Stack Test B -------");
        ArrayStack2 stack2 = new ArrayStack2(2);
        System.out.printf("The array is %s item(s) long\n", stack2.length());

        try {
            stack2.push(6);
            stack2.push(3);
            stack2.push(33);        // FullStackException here

            stack2.pop();
            stack2.pop();
            stack2.pop();              // EmptyStackException here
        } catch (EmptyStackException exception) {
            System.out.println("Exception caught: " + exception);
            System.out.println("Empty stack exception!");
        } catch (FullStackException exception) {
            System.out.println("Exception caught: " + exception);
            System.out.println("Full stack exception while pushing " + exception.value);
        }

        stack2.print();
    }
}