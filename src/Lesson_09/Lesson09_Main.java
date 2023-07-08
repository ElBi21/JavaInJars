package Lesson_09;
import java.util.*;

public class Lesson09_Main {
    public static void main(String[] args) {
        System.out.println("------- Starting Generic Identity Test -------");
        GenericIdentity.TestGenericIdentity();

        System.out.println("------- Starting Generic List Test -------");
        TestLists();

        System.out.println("------- Starting Sequence Test -------");
        TestSequence();
    }

    public static void TestLists() {
        IntList intList = new IntList(1, null);
        intList.pushHead(2);
        intList.pushHead(3);
        intList.pushHead(4);

        intList.printList();
        System.out.println("Head element = " + intList.getHead());

        System.out.println();

        GenericList<Integer> genericList = new GenericList<Integer>(32, null);
        //WRE: GenericList<int> GLI = new GenericList<int>(32, null);
        // We can't use primitive types as type arguments, mainly because of how Java is designed

        genericList.pushElement(37);
        genericList.pushElement(38);
        genericList.pushElement(39);

        genericList.printList();
        System.out.println("Head element = " + genericList.getHead());

        System.out.println();

        GenericList<Boolean> genericBooleanList = new GenericList<Boolean>(true, null);
        genericBooleanList.pushElement(false);
        genericBooleanList.pushElement(false);
        genericBooleanList.pushElement(false);

        genericBooleanList.printList();
        System.out.println("Head element = " + genericBooleanList.getHead());

        System.out.println();

        GenericList<Object> genericObjectList = new GenericList<Object>(new Object(), null);
        genericObjectList.pushElement(new Object());

        genericObjectList.printList();
        System.out.println("My head is " + genericObjectList.getHead());
    }

    public static void TestSequence() {
        // Playing with generic class LinkedList

        LinkedList<String> text = new LinkedList<String>(); // A sequence of strings
        LinkedList<Integer> numbers = new LinkedList<Integer>(); // A sequence of integers

        Scanner input = new Scanner(System.in);

        // Class Scanner implements scanners of text, useful to input from keyboard
        // System.in is an object of type InputStream

        System.out.println("Please, type a word:");
        String s = input.nextLine(); // Input of a string
        System.out.println("I read " + s);

        System.out.println("Please, give me more words, separated by newline (press Enter each time). Type 'finish' at the end");

        int i = 1;
        while (!s.equals("finish")) { // Input cycle
            text.add(s); // Adds a string s to the text sequence
            numbers.add(new Integer(i++)); // Adds a new integer to the sequence of integers
            s = input.nextLine(); // input of a new string
        }

        System.out.println("You wrote: ");
        i = 0;

        for (String x : text) // for-each cycle
            System.out.println(numbers.get(i++).intValue() + ": " + x);
    }
}
