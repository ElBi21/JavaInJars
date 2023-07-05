package Lesson_04;

public class Lesson04_Main {
    public static void main(String[] args) {
        IntListTest();
        StackListTest();
    }

    public static void IntListTest () {
        System.out.println("------- Starting Integer List Test -------");
        IntList l1 = new IntList(1, new IntList(9, new IntList(5,null)));
        l1.printList(4);

        IntList l2 = new IntList(3, new IntList(7, null));
        l2.printList(20);

        l1.concat(l2); // Concatenates l2 and l1; now l2 has 5 elements

        System.out.println("Printing Lists 1 and 2");
        l1.printList(10);
        l2.printList(50);

        l1.loop(); // now l1 is circular. Is l2 circular too?
        System.out.print("List 1: ");
        l1.printList(50);
        System.out.print("List 2: ");
        l2.printList(50); // ...do you understand why?!
    }

    public static void StackListTest () {
        System.out.println("------- Starting Stack List Test -------");
        ListStack l = new ListStack();
        //l.push(42);
        System.out.println((l.is_empty()) ? "Empty list!" : "");

        /* We can implement if-else statements directly in a line, by using the following syntax:
         *
         * <value to check if it's true or false> ? <action if true> : <action if false>
         *
         * The value to check has to be somehow boolean: for example if we put
         *       public int test = 0;
         *       public String isZero = test ? "Yes, it's zero" : "No, it's not zero";
         *
         * If we try to print isZero we'll obtain "Yes, it's zero".
         * */

        l.push(6);
        l.push(3);

        try {
            l.pop();
            l.pop();
            System.out.println(l.pop());
        }
        catch (EmptyStackException exception) {
            System.out.println("Exception caught: " + exception);
        }
    }
}